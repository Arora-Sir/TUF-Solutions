WITH SingleNumbers AS(
  SELECT num
  FROM MyNumbers
  GROUP BY num
  HAVING COUNT(num)=1
)
SELECT MAX(num) as num
FROM SingleNumbers;