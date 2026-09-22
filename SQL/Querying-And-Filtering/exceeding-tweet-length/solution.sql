SELECT tweet_id 
FROM Tweet 
WHERE CHAR_LENGTH(content) > 15;