# Write your MySQL query statemen]s
select * from Cinema
where MOD(id,2)=1 and 
description != 'boring'
order by rating desc;