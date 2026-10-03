SELECT DISTINCT l1.account_id
FROM LogInfo l1
JOIN LogInfo l2 ON l1.account_id=l2.account_id
                AND l1.ip_address!=l2.ip_address
WHERE l1.login BETWEEN l2.login AND l2.logout

      -- AND l1.login<=l2.logout AND l1.logout>=l2.login -- Person 1 arrives before Person 2 left && Person 1 stays until Person 2 arrived
      
      -- AND ((l1.login BETWEEN l2.login AND l2.logout) 
      --       OR (l1.logout BETWEEN l2.login AND l2.logout)
      --       OR (l2.login BETWEEN l1.login AND l1.logout))

-- INNER JOIN: ON and WHERE are interchangeable
-- LEFT JOIN: ON and WHERE are not interchangeable