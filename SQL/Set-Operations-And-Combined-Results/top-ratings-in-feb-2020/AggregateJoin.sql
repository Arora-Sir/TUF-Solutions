-- Prod: Aggregate Before Joining on massive data

(
  SELECT name AS results
  FROM Users u
  JOIN (
    SELECT user_id, COUNT(*) AS rating_count
    FROM MovieRating
    GROUP BY user_id
  ) mr ON u.user_id=mr.user_id
  ORDER BY rating_count DESC, name ASC
  LIMIT 1
)
UNION ALL
(
  SELECT title AS results
  FROM Movies m
  JOIN (
    SELECT movie_id, AVG(rating) AS avg_rating
    FROM MovieRating
    WHERE created_at BETWEEN '2020-02-01' AND '2020-02-29'
    GROUP BY movie_id
  ) r ON m.movie_id=r.movie_id
  ORDER BY avg_rating DESC, title ASC
  LIMIT 1
);