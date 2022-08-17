package demo.jdbc;

import java.sql.*;

public class PreparedStatementEx {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        insertUsingStatement();
        insertUsingPreparedStatement();
        long endTime = System.currentTimeMillis();
        System.out.println("Total " + (endTime-startTime));
    }
    public static void insertUsingPreparedStatement()
    {
        //add mysql-connector-java-8.0.27 to project
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            //load the driver // handle ClassNotFoundException.
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded.");
//            connect
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", "root", "mysql");
//          query
            System.out.println("connected");
            // statement
            String insertQuery = "INSERT INTO PRODUCTS1 VALUES (?,?)";
            preparedStatement = connection.prepareStatement(insertQuery);
            // execute query on statement / get ResultSet
            for(int i= 1; i< 500; i++) {
                preparedStatement.setInt(1,i);
                preparedStatement.setString(2,"(MOBILE"+i);
                int noRowsInserted = preparedStatement.executeUpdate();
//                System.out.println("Inserted " + noRowsInserted + " row..");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found");
        } catch (SQLException e) {
            System.out.println("Connect failed.." + e);
        } finally {
            System.out.println("close connection");
            try {

                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("failed closing con");
            }
        }
    }
    public static void insertUsingStatement()
    {

        //add mysql-connector-java-8.0.27 to project
        Connection connection = null;
        Statement statement = null;
        try {
            //load the driver // handle ClassNotFoundException.
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded.");
//            connect
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", "root", "mysql");
//          query
            System.out.println("connected");
            // statement
            statement = connection.createStatement();
            // execute query on statement / get ResultSet
            for(int i= 1; i< 500; i++) {
                String insertQuery = "INSERT INTO PRODUCTS1 VALUES (" + i + ",'" + "MOBILE" + i + "')";
//                System.out.println(insertQuery);
                int noRowsInserted = statement.executeUpdate(insertQuery);
//                System.out.println("Inserted " + noRowsInserted + " row..");
            }
            
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found");
        } catch (SQLException e) {
            System.out.println("Connect failed.." + e);
        } finally {
            System.out.println("close connection");
            try {

                statement.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("failed closing con");
            }
        }
    }
    }
