# Write your MySQL query statement below
select a.name as Employee from employee a, employee b where b.id = a.managerid and a.salary > b.salary