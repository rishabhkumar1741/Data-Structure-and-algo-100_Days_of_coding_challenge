-- # Write your MySQL query statement below
SELECT employee_id,salary*(employee_id%2)*(name not like 'M%') as bonus
FROM Employees
order by employee_id



