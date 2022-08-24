# CREATING THE DATABASE
# import sql connector
# import mysql.connector
# # create connection
# con = mysql.connector.connect(host="localhost",user="root",password="mysql");print(con)
# # get the cursor
# dbcursor = con.cursor()
# # create the db
# dbcursor.execute("create database mavpythondb"); print("db created")

# CREATING THE DATABASE TABLE
# import sql connector
import mysql.connector
# create connection
con = mysql.connector.connect(host="localhost",user="root",password="mysql", database="mavpythondb");print(con)
# get the cursor
dbcursor = con.cursor()
# create the db table
dbcursor.execute("create table Login(loginid char(10), password char(10))"); print("table created")