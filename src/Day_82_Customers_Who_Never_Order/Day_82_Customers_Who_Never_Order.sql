# Write your MySQL query statement below
SELECT name as Customers from Customers 
LEFT OUTER JOIN Orders 
ON Customers.id= Orders.customerId
WHERE customerId IS NULL;



