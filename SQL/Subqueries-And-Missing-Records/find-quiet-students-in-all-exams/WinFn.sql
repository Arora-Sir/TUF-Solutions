WITH RankedExams AS(
    SELECT 
        exam_id,
        student_id,
        DENSE_RANK() OVER (PARTITION BY exam_id ORDER BY score ASC) AS rank_low,
        DENSE_RANK() OVER (PARTITION BY exam_id ORDER BY score DESC) AS rank_high
    FROM Exam
)
SELECT s.student_id,s.student_name
FROM Student s
WHERE s.student_id IN (SELECT student_id FROM Exam)
  AND s.student_id NOT IN (
      SELECT student_id 
      FROM RankedExams 
      WHERE rank_low=1 OR rank_high=1
  )
ORDER BY s.student_id;