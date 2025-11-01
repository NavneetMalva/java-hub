-- Q1. Two tables Customers and Orders: Find the customer first name who have placed an order

SELECT DISTINCT c.first_name
FROM Customers c
INNER JOIN Orders o
  ON c.customer_id = o.customer_id;

-- INNER JOIN : SQL keeps only rows that match in both tables.

-- Q2. Write an SQL query to find the second highest age among all customers.
SELECT age  FROM Customers c
WHERE age < (SELECT MAX(age) FROM Customers)
ORDER BY age DESC
LIMIT 1;


-- Q3. Write an SQL query to find the second highest age among all customers using the RANK() function.
SELECT age
FROM (
  SELECT age,
    RANK() OVER (ORDER BY age DESC) AS age_rank
  FROM Customers
) ranked
WHERE age_rank = 2;

SELECT age
FROM (
  SELECT age,
    DENSE_RANK() OVER (ORDER BY age DESC) AS age_rank
  FROM Customers
) ranked
WHERE age_rank = 2;


-- Q4. Write an SQL query to find the first name, last name of customers
--     who have placed an order worth more than 500 and whose order has been delivered.

SELECT
  c.first_name,
  c.last_name
FROM Customers c
INNER JOIN Orders o
  ON c.customer_id = o.customer_id
INNER JOIN Shippings s
  ON c.customer_id = s.customer_id
WHERE o.amount > 500
  AND s.status = 'Delivered';

-- Q5. Write an SQL query to find the total amount spent by each customer
SELECT c.first_name, SUM(o.amount) AS total_spent
FROM customers c
JOIN orders o
  ON c.customer_id = o.customer_id
GROUP BY c.customer_id
ORDER BY total_spent DESC;

-- Q6. Replace the 'n' by 'N' from first_name
SELECT REPLACE(first_name,'n','N') FROM customers;






