# Write your MySQL query statement below
select d.name as Department , e.name as Employee , e.salary as Salary
From(
    select e.name , e.salary, e.departmentId,
    Dense_rank() over (partition by departmentid order by salary desc) as salary_order
    From employee e
) e
Join department d on e.departmentid = d.id
where salary_order <=3;