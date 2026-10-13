SELECT s.student_id,s.student_name
FROM Student s
WHERE s.student_id IN (SELECT student_id FROM Exam)
  AND s.student_id NOT IN(
      -- Collect all students who got MIN or MAX on any exam
      SELECT e.student_id
      FROM Exam e
      JOIN(SELECT exam_id, 
                  MIN(score) AS min_score,
                  MAX(score) AS max_score
            FROM Exam
            GROUP BY exam_id
      ) stats ON e.exam_id=stats.exam_id
      WHERE e.score=stats.min_score OR e.score=stats.max_score
  )
ORDER BY s.student_id