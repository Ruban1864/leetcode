# Write your MySQL query statement below
Select p.product_name,s.year,s.price 
from Sales s natural join product p 
where s.product_id = p.product_id;