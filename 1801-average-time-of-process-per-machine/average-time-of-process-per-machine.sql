# Write your MySQL query statement below
select a.machine_id , ROUND(Avg(b.timestamp - a.timestamp),3) as processing_time
FROM Activity a JOIN
Activity b 
on a.machine_id = b.machine_id
and a.process_id = b.process_id 
and a.activity_type = 'start'
and b.activity_type = 'end'
group by machine_id;
