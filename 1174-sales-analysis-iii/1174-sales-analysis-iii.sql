# Write your MySQL query statement below
SELECT distinct p.product_id, p.product_name from Product p
JOIN Sales s ON p.product_id = s.product_id 
WHERE p.product_id not in(
    select product_id from sales 
    where sale_date < '2019-01-01' OR sale_date > '2019-03-31'
);