SELECT DISTINCT page_id AS recommended_page
FROM Likes l
JOIN Friendship f ON (l.user_id=f.user1_id OR l.user_id=f.user2_id)
WHERE (f.user1_id=1 OR f.user2_id=1)
      AND l.user_id!=1
      AND l.page_id NOT IN (SELECT page_id FROM Likes WHERE user_id=1)
ORDER BY recommended_page; 