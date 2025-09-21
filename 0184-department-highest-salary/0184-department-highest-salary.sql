select e.name as Employee, e.salary as Salary , d.name as department
FROM (
    select e.name , e.salary, e.departmentid,
      DENSE_RANK() over(partition by departmentid order by salary DESC) as rank_order
    From Employee e
 ) e
 Join Department d on e.departmentid = d.id
where rank_order = 1;