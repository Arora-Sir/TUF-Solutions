SELECT DISTINCT title
FROM Content c
JOIN TVProgram tv ON tv.content_id=c.content_id
WHERE kids_content='Y' AND content_type='Movies' AND YEAR(program_date)=2020 AND MONTH(program_date)=6;