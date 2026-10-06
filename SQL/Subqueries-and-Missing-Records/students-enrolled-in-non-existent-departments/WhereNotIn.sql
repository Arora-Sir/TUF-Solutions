-- Dangerous: The Famous NULL Trap ()

SELECT id,name
FROM Students s
WHERE s.department_id NOT IN (SELECT id FROM Departments)
      OR s.department_id IS NULL -- Instead use NOT EXISTS

-- Will also gives error if any id in Departments table is NULL
