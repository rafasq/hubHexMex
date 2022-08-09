-- Active: 1659109364264@@127.0.0.1@3306@mavdb
USE MAVDB;
DROP TABLE TABLE1;
DROP TABLE TABLE2;
CREATE TABLE TABLE1
(ID INT, VALUE VARCHAR(10));

-- UNION
SELECT 1 AS 'NUMBER', 'RED' AS 'COLOR'
UNION
SELECT 2, 'GREEN'
UNION ALL
SELECT 1, 'RED';

USE SAKILA;
SELECT TITLE FROM FILM
UNION
SELECT FIRST_NAME FROM ACTOR;

SELECT FIRST_NAME FROM ACTOR
UNION
SELECT TITLE FROM FILM;

USE MAVDB;
-- DIFFERNT WAY OF INSERTING RECORDS INTO A TABLE USING UNION
INSERT INTO TABLE1(ID,VALUE)
SELECT 1, 'RED'
UNION ALL
SELECT 2, 'GREEN'
UNION ALL
SELECT 3, 'BLUE';
SELECT * FROM TABLE1;

CREATE TABLE TABLE2
(ID INT, VALUE VARCHAR(10));

INSERT INTO TABLE2(ID,VALUE)
SELECT 2, 'BASKET'
UNION ALL
SELECT 3, 'BASE'
UNION ALL
SELECT 6, 'CRICKET'
UNION ALL
SELECT 7, 'FOOTT'
;
SELECT * FROM TABLE1;
SELECT * FROM TABLE2;

---------------- JOINS -----------------
-- CARTESIAN PRODUCT / EACH ROW OF THE FIRTS TABLE IS MAPPED TO EACH ROW OF THE SECOND TABLE.
SELECT  * FROM TABLE1
CROSS JOIN TABLE2;

-- INNER JOIN / ONLY THE MATCHING RECORDS FROM BOTH THE TABLES
SELECT * FROM TABLE1
INNER JOIN TABLE2
ON TABLE1.ID = TABLE2.ID;

SELECT * FROM TABLE1
JOIN TABLE2
ON TABLE1.ID = TABLE2.ID;

SELECT TABLE1.ID AS 'BALL NO' , TABLE1.VALUE AS 'BALL COLOR', TABLE2.VALUE AS 'BALL TYPE'
FROM TABLE1
INNER JOIN TABLE2
ON TABLE1.ID = TABLE2.ID;

-- LEFT JOIN / ALL ROWS FROM LEFT TABLE, ONLY MATCHING RECORDS FROM THE RIGHT TABLE AND NULL FOR THE NON MATCHING ROWS IN THE RIGHT TABLE.
SELECT * FROM TABLE1
LEFT JOIN TABLE2
ON TABLE1.ID = TABLE2.ID;

SELECT * FROM TABLE1
LEFT OUTER JOIN TABLE2
ON TABLE1.ID = TABLE2.ID;

-- RIGTH JOIN / ALL ROWS FROM RIGHT TABLE, ONLY MATCHING RECORDS FROM THE LEFT TABLE AND NULL FOR THE NON MATCHING ROWS IN THE LEFT TABLE.
SELECT * FROM TABLE1
RIGHT JOIN TABLE2
ON TABLE1.ID = TABLE2.ID;

SELECT * FROM TABLE1
RIGHT OUTER JOIN TABLE2
ON TABLE1.ID = TABLE2.ID;

-- SELF JOIN / A TABLE JOINS WITH ITSELF

CREATE TABLE EMPLOYEE1 (EMPLOYEE_ID INT, NAME CHAR(20), MANAGER_ID INT);
SELECT * FROM EMPLOYEE1;
DELETE FROM EMPLOYEE1;
INSERT INTO EMPLOYEE1 VALUES (1,'MIKE',3),
(2,'DAVID',3);
INSERT INTO EMPLOYEE1 VALUES (3,'ROGER',NULL),
(4,'MARRY',2),
(5,'JOSEPH',2);

SELECT ALIASEMPLOYEE.EMPLOYEE_ID AS 'EMPLOYEE ID', ALIASEMPLOYEE.NAME AS 'EMPLOYEE NAME', ' WORKS FOR ', 
ALIASMANAGER.EMPLOYEE_ID AS 'MANAGER ID',  ALIASMANAGER.NAME
FROM EMPLOYEE1 ALIASEMPLOYEE
INNER JOIN EMPLOYEE1 ALIASMANAGER
ON ALIASEMPLOYEE.MANAGER_ID = ALIASMANAGER.EMPLOYEE_ID;

-- EXPLORE
SELECT  CONCAT(ALIASEMPLOYEE.NAME ,' WITH EMPLOYEE ID ' , ALIASEMPLOYEE.EMPLOYEE_ID , ' WORKS FOR ' , ALIASMANAGER.NAME , ' WITH ID ' ,ALIASMANAGER.EMPLOYEE_ID)
AS 'THE ULTIMATE REPORT OF WHO REPORTS TO WHOM?' FROM EMPLOYEE1 ALIASEMPLOYEE
INNER JOIN EMPLOYEE1 ALIASMANAGER
ON ALIASEMPLOYEE.MANAGER_ID = ALIASMANAGER.EMPLOYEE_ID;

-- IP
-- 1. Use `JOIN` to display the first and last names, as well as the address, of each staff member. Use the tables `staff` and
-- `address`

-- 2.  You want to run an email marketing campaign in Canada, for which you will need the names and email addresses of all Canadian
-- customers. Use joins to retrieve this information.
-- USE ADDRESS, CITY AND COUNRTY. 

-- GET THE FILM NAME, LANGUAGE AND CATEGORY NAME
-- S1 TABLES : FILM, LANGUAGE, CATEGORY, FILM_CATEGORY
-- S2 COLUMNS : TITLE, LANGULAGE_ID(FILM,LANGUAGE) NAME(FILM), NAME (CATEGORY)

USE SAKILA;
SELECT FILM.TITLE, language.NAME AS 'LNAGUAGE' ,CATEGORY.NAME CATEGORY FROM 
FILM
INNER JOIN language ON FILM.language_id = language.language_id
INNER JOIN film_category ON FILM.FILM_id = film_category.film_id
INNER JOIN category ON category.category_id = film_category.category_id;

SELECT * FROM FILM CROSS JOIN ACTOR;