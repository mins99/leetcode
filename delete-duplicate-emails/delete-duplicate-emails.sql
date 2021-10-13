# Write your MySQL query statement below
delete p from person p, person p2 where p.email = p2.email and p.id > p2.id