# Write your MySQL query statement below
Select DISTINCT author_id as id
from Views
where  author_id = viewer_id
ORDER BY author_id Asc;