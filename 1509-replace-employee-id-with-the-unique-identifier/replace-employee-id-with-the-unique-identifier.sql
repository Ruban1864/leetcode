# Write your MySQL query statement below
/*select unique_id,name 
from Employees join EmployeeUNI 
where unique_id IS NULL ;*/
SELECT e.unique_id, emp.name 
FROM Employees emp
LEFT JOIN EmployeeUNI e ON emp.id = e.id;
