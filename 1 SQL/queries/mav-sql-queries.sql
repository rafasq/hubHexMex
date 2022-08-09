-- Active: 1659109364264@@127.0.0.1@3306@mavdb
CREATE DATABASE MAVDB;
USE MAVDB;
CREATE TABLE TEST(TESID INT, TESTNAME VARCHAR(20));
SELECT * FROM TEST;
INSERT INTO TEST VALUES (1, 'MYSQL');
INSERT INTO TEST VALUES (2, 'ORACLE');
SELECT COUNT(*) FROM TEST;
-- SWITCH TO A DATABASE
USE SAKILA;
-- SELECTING ALL THE COLUMNS 
SELECT * FROM ACTOR;
--  SELECT ( FETCH RECORDS)
-- * ( ALL THE COLUMNS )
-- FROM ( CONNECTING THE TABLE)
-- ACTOR (TABLE)

-- SELECT SPECIFIC COLUMNS
SELECT FIRST_NAME, LAST_NAME FROM ACTOR;
-- SELECT ACTORS WHOSE FIRST NAME IS ED
SELECT * FROM ACTOR WHERE FIRST_NAME = 'ED';
-- SELECT ED CHASE
SELECT * FROM ACTOR WHERE FIRST_NAME = 'ED' AND LAST_NAME = 'CHASE';
-- ACTORS WHOSE FIRST_NAME MAY BE ED OR LAST_NAME MAY BE CHASE
SELECT * FROM ACTOR WHERE FIRST_NAME = 'ED' OR LAST_NAME = 'CHASE';
-- PRINT WELCOME MESSAGE
SELECT 'WELCOME TO THE WORLD OF MYSQL';
-- USER DEFINED HEADING
SELECT 'WELCOME TO THE WORLD OF MYSQL' AS 'MESSAGE';
-- SELECT LOWER CASE
SELECT LOWER(FIRST_NAME) FROM ACTOR;
SELECT UPPER(FIRST_NAME) FROM ACTOR;
SELECT PI();
SELECT 100 + 200;
SELECT MOD(45,7);
SELECT * FROM ACTOR;
-- ORDER BY FIRST_NAME
SELECT * FROM ACTOR ORDER BY FIRST_NAME ; 
SELECT * FROM ACTOR ORDER BY LAST_NAME ASC; 
SELECT * FROM ACTOR ORDER BY LAST_NAME DESC; 

-- USING COLUMN NUMBER 
SELECT * FROM ACTOR ORDER BY 3 DESC; 
SELECT * FROM ACTOR ORDER BY 2; 

-- FILTERING RECORDS
SELECT * FROM ACTOR WHERE FIRST_NAME = 'JULIA';
SELECT * FROM ACTOR WHERE ACTOR_ID < 3;
SELECT * FROM ACTOR WHERE FALSE; 
SELECT * FROM ACTOR WHERE TRUE; 

-- COUNT NUMBER OF ROWS IN THE TABLE
SELECT COUNT(*) FROM ACTOR;
SELECT ROUND(50.567); -- 50.567 , 0
SELECT ROUND(50.567, 2);
SELECT ROUND(50.567,0);
SELECT ROUND(567.567,-1);
SELECT ROUND(567.567,-2);
SELECT ROUND(543.567,-2);
SELECT FLOOR(1.7);
SELECT FLOOR(-1.7); -- -1 TO -2  (smaller number -2 at the bottom and the larger number -1 on the top);
SELECT ceiling(1.7);
SELECT ceiling(-1.7); -- -1 TO -2  (smaller number -2 at the bottom and the larger number -1 on the top);

-- STRING OPERATIONS
SELECT 1 + 1; -- ADDITION
SELECT '1' + '1'; -- ADDITION
SELECT CONCAT('1' + '1'); -- ADDTION
SELECT CONCAT('1' , '1'); -- CONCATENATE
SELECT * FROM ACTOR;
SELECT CONCAT(FIRST_NAME, '  ' , LAST_NAME) FROM ACTOR;
-- USER DEFINED COLUMN HEADING
SELECT CONCAT(FIRST_NAME, '  ' , LAST_NAME) AS 'FULL NAME' FROM ACTOR;
SELECT * FROM FILM;

-- DATE FUNCTIONS
SELECT SYSDATE();
SELECT LAST_UPDATE FROM ACTOR;
SELECT last_Update, date_format(LAST_UPDATE, '%m/%d/%y') as last_update from actor;
use sakila;
select last_update, dayofmonth(last_update) from actor;
select sysdate(), dayofmonth(sysdate()),  month(sysdate()) , dayname(sysdate()),
 date_add(sysdate(), interval 2 day), dayname(date_add(sysdate(), interval 2 day)) from actor;
 select last_update from actor where month(last_update) = 2;
 select date_format(sysdate(), 'Today is %W of the month %M');
-- NAME WITH INITIALS
SELECT CONCAT(FIRST_NAME,'.', LAST_NAME) FROM ACTOR;
SELECT LEFT('foobarbar', 5);
SELECT LEFT(LAST_NAME,1) FROM ACTOR;
SELECT LEFT(LAST_NAME,1), LAST_NAME FROM ACTOR;
SELECT CONCAT(FIRST_NAME,'.', LEFT(LAST_NAME,1)) FROM ACTOR;
SELECT CONCAT(FIRST_NAME,'.', LEFT(LAST_NAME,1)) AS FULLNAME FROM ACTOR;
SELECT CONCAT(FIRST_NAME,'.', LEFT(LAST_NAME,1)) AS 'FULL NAME' FROM ACTOR;
SELECT * FROM ACTOR;
-- IP
-- USER STORY : THE ACTOR DETAILS KENNETH (FIRST_NAME) AND THE TOP 80 ACTORS AND TEMPLE (LAST_NAME).
SELECT ACTOR_ID, FIRST_NAME, LAST_NAME FROM SAKILA.ACTOR
WHERE (FIRST_NAME = 'KENNETH') OR (LAST_NAME = 'TEMPLE') OR ACTOR_ID <= 80
ORDER BY FIRST_NAME;
-- NOT INTERESTED IN KENNETH AND TEMPLE WHO ARE NOT IN TOP 80.
-- SLN1
SELECT ACTOR_ID, FIRST_NAME, LAST_NAME FROM SAKILA.ACTOR
WHERE (FIRST_NAME = 'KENNETH' OR LAST_NAME = 'TEMPLE') AND  ACTOR_ID <= 80;
-- SLN2
SELECT * FROM ACTOR WHERE (FIRST_NAME = 'KENNETH'
OR LAST_NAME = 'TEMPLE') AND ACTOR_ID <= 80 
UNION
SELECT * FROM ACTOR LIMIT 80;
-- SLN3
select actor_id, first_name, last_name from actor where(first_name = 'KENNETH'
and actor_id < 80) or (last_name = 'TEMPLE' and actor_id < 80) or actor_id < 80;
-- SLN4
SELECT ACTOR_ID,FIRST_NAME,LAST_NAME FROM SAKILA.ACTOR WHERE (FIRST_NAME = 'KENNETH'
OR LAST_NAME ='TEMPLE' OR ACTOR_ID<=80) AND ACTOR_ID<=80 ;

-- SLN5
SELECT * FROM ACTOR LIMIT 80;
-- UNIQUE
SELECT LAST_NAME FROM ACTOR;
SELECT COUNT(*) FROM ACTOR;
SELECT * FROM ACTOR;
SELECT DISTINCT LAST_NAME FROM ACTOR;
SELECT * FROM CITY WHERE CITY LIKE '%MEX%';
SELECT * FROM CITY WHERE CITY NOT LIKE '%MEX%';
SELECT * FROM CITY WHERE NOT CITY  LIKE '%MEX%';
SELECT * FROM CITY WHERE CITY  LIKE '%MEX%';
SELECT * FROM CITY WHERE CITY  != 'MEXICALI';

SELECT * FROM CITY WHERE CITY LIKE '%DALLAS%';
SELECT * FROM CITY WHERE COUNTRY_ID = 60;
SELECT * FROM CITY WHERE COUNTRY_ID =103;

-- CONSTRAINTS
USE MAVDB;
-- DATA DEFINITION LANGUAGE
-- PRODUCTS / RELATION
CREATE TABLE PRODUCTS 
(
-- ATTRIBUTES / 2 DEGREES 
PRODUCT_ID INT PRIMARY KEY,
PRODUCT_NAME VARCHAR(50)
);
SELECT * FROM PRODUCTS;
INSERT INTO PRODUCTS SET PRODUCT_ID = 3, PRODUCT_NAME = 'SYNTAX';
UPDATE PRODUCTS SET PRODUCT_NAME = 'TV' WHERE PRODUCT_ID = 3;
INSERT INTO PRODUCTS SET PRODUCT_ID = 3, PRODUCT_NAME = 'SYNTAX';
DELETE FROM PRODUCTS WHERE PRODUCT_ID = 3;
DELETE FROM PRODUCTS;
INSERT INTO PRODUCTS VALUES (1,'PEN');
INSERT INTO PRODUCTS VALUES (1,'PAPER');
INSERT INTO PRODUCTS VALUES (2,'PAPER');

Select first_name, last_name from actor;

-- DISTINCT
SELECT * FROM ACTOR;
SELECT FIRST_NAME FROM ACTOR ORDER BY FIRST_NAME;
SELECT DISTINCT FIRST_NAME FROM ACTOR ORDER BY FIRST_NAME;
SELECT COUNT(*) FROM ACTOR;
SELECT COUNT(FIRST_NAME) FROM ACTOR;
SELECT COUNT(DISTINCT FIRST_NAME) FROM ACTOR;
-- USING THE WHERE CLAUSE
-- WHERE clause Comparison Operators
-- Equal (=)
SELECT actor_id, first_name, last_name FROM sakila.actor WHERE actor_id = 100;
SELECT actor_id, first_name, last_name FROM sakila.actor WHERE first_name = 'Nick';
-- Less than (<)
SELECT actor_id, first_name, last_name FROM sakila.actor WHERE actor_id < 100 ORDER BY ACTOR_ID DESC;
SELECT actor_id, first_name, last_name FROM sakila.actor WHERE first_name < 'Nick' ORDER BY FIRST_NAME DESC;
SELECT actor_id, first_name, last_name FROM sakila.actor WHERE first_name > 'Nick' ORDER BY FIRST_NAME DESC;
-- Greater than (>)
SELECT actor_id, first_name, last_name FROM sakila.actor WHERE actor_id > 100;
SELECT actor_id, first_name, last_name FROM sakila.actor WHERE first_name > 'Nick';
-- Less than or Equal to (<=)
SELECT actor_id, first_name, last_name FROM sakila.actor WHERE actor_id <= 100 ORDER BY ACTOR_ID DESC;
SELECT actor_id, first_name, last_name FROM sakila.actor WHERE first_name <= 'Nick';
-- Greater than or Equal to (>=)
SELECT actor_id, first_name, last_name FROM sakila.actor WHERE actor_id >= 100;
-- Not equal (<> or !=)
SELECT actor_id, first_name, last_name FROM sakila.actor WHERE actor_id <> 1;
SELECT actor_id, first_name, last_name FROM sakila.actor WHERE actor_id != 1;
SELECT actor_id, first_name, last_name FROM sakila.actor WHERE first_name <> 'Nick';
SELECT actor_id, first_name, last_name FROM sakila.actor WHERE NOT first_name = 'Nick';

-- LOGICAL OPERATORS
-- AND
SELECT * FROM actor WHERE first_name = 'KENNETH';
-- USER STORY THE DETAILS OF NICK AND ED ARE NEEDED.
SELECT * FROM actor WHERE first_name = 'KENNETH' OR FIRST_NAME = 'ED';
SELECT * FROM sakila.actor WHERE first_name = 'KENNETH' AND actor_id < 90;
SELECT * FROM sakila.actor WHERE first_name = 'KENNETH' AND actor_id < 100 AND last_name = 'TORN';
-- OR
SELECT * FROM sakila.actor WHERE first_name = 'KENNETH';
-- GET KENNETH'S DETAILS AND ALL THE OTHER ACTORS WHOSE ID IS LESS THAN 100
SELECT * FROM sakila.actor WHERE first_name = 'KENNETH' OR actor_id < 100; 
SELECT * FROM sakila.actor WHERE first_name = 'KENNETH' OR actor_id < 100 OR last_name = 'TEMPLE';
-- NOT
SELECT actor_id, first_name, last_name FROM sakila.actor WHERE NOT actor_id = 5;
SELECT actor_id, first_name, last_name FROM sakila.actor WHERE actor_id <> 5;
SELECT * FROM sakila.actor WHERE first_name = 'KENNETH' AND actor_id < 100 OR last_name = 'TEMPLE';
SELECT * FROM sakila.actor WHERE first_name = 'KENNETH' OR last_name = 'TEMPLE' AND actor_id < 100;
SELECT * FROM sakila.actor WHERE (first_name = 'KENNETH' AND actor_id < 80) OR last_name = 'TEMPLE';
SELECT * FROM sakila.actor WHERE first_name = 'KENNETH' AND (actor_id < 100 OR last_name = 'TEMPLE');
SELECT * FROM sakila.actor WHERE (first_name = 'KENNETH' OR last_name = 'TEMPLE') AND actor_id < 100;
SELECT * FROM sakila.actor WHERE first_name = 'KENNETH' OR (last_name = 'TEMPLE' AND actor_id < 100);
SELECT * FROM sakila.actor WHERE NOT (first_name = 'KENNETH' OR (last_name = 'TEMPLE' AND actor_id < 100));
SELECT * FROM sakila.actor WHERE first_name = 'KENNETH' OR NOT(last_name = 'TEMPLE' AND actor_id > 100);

-- AGGREGATE FUNCTIONS
-- AGGREGATE COLUMNS / PERFORM AGGREGATE FUNCTIONS 
SELECT MIN(ACTOR_ID), MAX(ACTOR_ID), AVG(ACTOR_ID), COUNT(ACTOR_ID), SUM(ACTOR_ID) FROM ACTOR;
-- NON AGGREAGATE COLUMN / GROUP BY CLAUSE
SELECT SUM(FIRST_NAME) FROM ACTOR;
SELECT FIRST_NAME FROM ACTOR ORDER BY FIRST_nAME;

SELECT FIRST_NAME, COUNT(FIRST_NAME) FROM ACTOR 
GROUP BY FIRST_NAME
ORDER BY COUNT(FIRST_NAME) DESC;

SELECT FIRST_NAME, COUNT(FIRST_NAME) FROM ACTOR 
GROUP BY FIRST_NAME
HAVING COUNT(FIRST_NAME) > 2
ORDER BY COUNT(FIRST_NAME) DESC;

SELECT FIRST_NAME FROM ACTOR 
WHERE FIRST_NAME IN ('PENELOPE', 'ED','JULIA');
SELECT FIRST_NAME FROM ACTOR 
WHERE FIRST_NAME NOT IN ('PENELOPE', 'ED','JULIA', 'JULIANNE');
SELECT FIRST_NAME FROM ACTOR 
WHERE NOT FIRST_NAME  IN ('PENELOPE', 'ED','JULIA', 'JULIANNE');
SELECT FIRST_NAME, COUNT(FIRST_NAME) FROM ACTOR 
WHERE FIRST_NAME IN ('PENELOPE', 'ED','JULIA')
GROUP BY FIRST_NAME
HAVING COUNT(FIRST_NAME) > 2
ORDER BY COUNT(FIRST_NAME) DESC;

-- ARITHMETIC OPERATOR IN WHERE CLAUSE
SELECT * FROM ACTOR 
WHERE ACTOR_ID = 50 +1 ;
SELECT * FROM ACTOR 
WHERE 50 +1  = ACTOR_ID;
-- COLUMN LIST 
SELECT ACTOR_ID, FIRST_NAME, ACTOR_ID + 10 FROM ACTOR; 
-- HAVING CLUASE
SELECT FIRST_NAME, COUNT(FIRST_NAME) FROM ACTOR 
WHERE FIRST_NAME IN ('PENELOPE', 'ED','JULIA')
GROUP BY FIRST_NAME
HAVING COUNT(FIRST_NAME) > 1+1;
-- NOT IN FROM CLAUSE
-- SELECT * FROM 1+1; 
-- PRECEDENCE * / + 1
SELECT 10 * 10 / 5 + 3;
SELECT 10 * (10 / 5) + 3;
SELECT 10 * 10 / 5 + 3 -2;
SELECT 10 * 10 / (5 + 3) -2;
SELECT (100/8) -2;


 CREATE TABLE EMPLOYEE21 (EMP_ID INT, EMP_FULL_NAME CHAR(50));
--  SIMPLE VS COMPOSITE
 INSERT INTO EMPLOYEE21 VALUES (1, 'JOHN KING RAMBO');
 SELECT * FROM employee21;

 CREATE TABLE EMPLOYEE212 (EMP_ID INT, EMP_FULL_NAME CHAR(50), SKILLS CHAR(10));
--  SIMPLE VS MULTIVALUED
  INSERT INTO EMPLOYEE21 VALUES (1, 'JOHN KING RAMBO', 'FOOTBALL, BASEBALL, CRICKET');

  -- case sensitive comparison
select * from employees where first_name = 'steven';
select * from employees where binary first_name = 'Steven';
select * from employees where binary first_name like 'St%';

select * from employees where binary first_name like '%st%';
select * FROM job_history;

-- Create a query that will display the total number of employees and, of that total, the number   
--       of employees hired in 1981, 1983 and 1980. Create appropriate column headings.

	
--      TOTAL       1983       1982       1980
--       ---------- ---------- ----------   ----------
--         14               1          2              1
use hr;
select * from employees ORDER BY HIRE_DATE;
 select  count(*) from employees where year(hire_date)='1987';
-- count all columns
 select  count(*) 'TOTAL' from employees;
 select year(hire_date) from employees;
 -- count of year
 select count(hire_date)  from employees where year(hire_date) = '1994';
 select if(year(hire_date) = '1994',hire_date, null) from employees ORDER BY hire_date; 
  select count(if(year(hire_date) = '1994',hire_date, null)) '1994' from employees; 
 select  
    count(*) 'TOTAL' , 
    count(if(year(hire_date)='1996',hire_date,NULL)) "1996",
    count(if(year(hire_date)='1994',hire_date,null)) "1994"
from employees;

SELECT * from employees;
-- sub query
-- emp with sal > winston's salary
SELECT employees.salary from employees WHERE trim(first_name) = 'Winston';
select first_name, salary from employees where salary > (
SELECT employees.salary from employees WHERE trim(first_name) = 'Winston') 
ORDER BY salary asc;

select first_name, salary from employees where salary > (
SELECT employees.salary from employees WHERE trim(first_name) = 'Winston') 
ORDER BY salary asc;

sELECT employees.salary from employees WHERE first_name = 'Winston' or first_name = 'Neena';

-- Subquery returns more than 1 row
select first_name, salary from employees where salary > (
sELECT employees.salary from employees WHERE first_name = 'Winston' or first_name = 'Neena') 
ORDER BY salary asc;

select first_name, salary from employees where salary in (
sELECT employees.salary from employees WHERE first_name = 'Winston' or first_name = 'Neena') 
ORDER BY salary asc;

select first_name, salary from employees where salary in (
sELECT employees.salary from employees WHERE salary in (
    select salary from employees where salary between 3200 and 17000)
)
ORDER BY salary asc;

select first_name, salary from employees where salary > (select avg(salary) from employees);

USE HR;
SELECT * FROM departments;
SELECT * FROM EMPLOYEES;