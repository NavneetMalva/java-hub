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


-- You are given a table Employee with the following structure:
--
-- Employee
-- --------
-- emp_id        INT
-- emp_name      VARCHAR
-- department    VARCHAR
-- salary        INT
-- hire_date     DATE
-- manager_id    INT   -- refers to emp_id of the manager
--
-- Problem Statement:
-- Write a SQL query to find the top 2 highest paid employees in each department.
--
-- Employees with the same salary should receive the same rank.
--
-- If multiple employees tie for the 2nd highest salary, all of them should be included.
-- Do not use LIMIT, TOP, or subqueries.
--
-- Handle the case where an employee does not have a manager (manager_id is NULL).

SELECT *
FROM (
         SELECT e.*,
                DENSE_RANK() OVER (
               PARTITION BY department
               ORDER BY salary DESC
           ) AS dense_rank
         FROM employee e
     ) e
WHERE e.manager_id IS NOT NULL
  AND e.dense_rank <= 2;







