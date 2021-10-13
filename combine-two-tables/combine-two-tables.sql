# Write your MySQL query statement below
select FirstName, LastName, City, State
from person
left outer join address
on person.personid = address.personid