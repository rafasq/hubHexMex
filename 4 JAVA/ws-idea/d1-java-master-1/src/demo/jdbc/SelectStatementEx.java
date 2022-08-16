package demo.jdbc;

import java.sql.*;

public class SelectStatementEx {
    public static void main(String[] args) {
        //add mysql-connector-java-8.0.27 to project
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            //load the driver // handle ClassNotFoundException.
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded.");
//            connect
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/SAKILA","root","mysql");
//          query
            System.out.println("connected");
            String selectQuery = "SELECT ACTOR_ID, FIRST_NAME, LAST_NAME FROM ACTOR WHERE ACTOR_ID < 6";
            // statement
            System.out.println("Query created");
            statement  = connection.createStatement();
            System.out.println("query executed");
            // execute query on statement / get ResultSet
             resultSet = statement.executeQuery(selectQuery);
            System.out.println("iterate resultset");
            // iterate
            while(resultSet.next()) {
//              int actorId =   resultSet.getInt("actor_id");
//              String firstName = resultSet.getString("first_name");
//                String lastName = resultSet.getString("last_name");

                int actorId =   resultSet.getInt(1);
                String firstName = resultSet.getString(2);
                String lastName = resultSet.getString(3);

                System.out.println(actorId + "\t" + firstName + "\t" + lastName );
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found");
        } catch (SQLException e) {
            System.out.println("Connect failed..");
        }
        finally {
            System.out.println("close connection");
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("failed closing con");
            }
        }
    }
}
