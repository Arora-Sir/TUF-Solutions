SELECT query_name,
  ROUND(
    -- SUM(rating/position)/COUNT(*),
    AVG(rating/position),
    2
  ) AS quality,
  ROUND(
    SUM((rating<3))/COUNT(*)*100,
    -- COUNT(CASE WHEN rating<3 THEN 1 END)/COUNT(*)*100,
    -- AVG(rating<3)*̄100,
    2
  ) AS poor_query_percentage
FROM Queries
GROUP BY query_name

-- Rules must to remember:
-- Never write SELECT, FROM, or GROUP BY inside the column list. Once you write GROUP BY query_name at the bottom of the query, every function in your SELECT clause automatically calculates per group.
-- Use AVG() instead of SUM() / COUNT(*) for averages and percentages.
-- COUNT(column) only ignores NULL. It never filters out 0 or false. So if we do COUNT(rating<3) it doesn't means it will count all with rating less than 3, it will actually is if the internal value is not null then return 1, and will return 100% instaed of the actual answer doesn't matter the rating is 1 or 5, as internal statement will return 1 or 0, and both not null so count increases everytime.