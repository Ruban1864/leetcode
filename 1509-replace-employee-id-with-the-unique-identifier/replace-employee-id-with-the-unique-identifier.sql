# Write your MySQL query statement below
select es.unique_id ,e.name from 
Employees e left join EmployeeUNI es 

on e.id = es.id