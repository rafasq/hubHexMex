package demo.jdbc;

import java.sql.*;

public class CallableStatementEx {
    public static void main(String[] args) {
        useSakla();
    }
    private static void useSakla() {
        //add mysql-connector-java-8.0.27 to project
        Connection connection = null;
        CallableStatement callableStatement = null;
        ResultSet resultSet = null;
        try {
            //load the driver // handle ClassNotFoundException.
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded.");
//            connect
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/SAKILA","root","mysql");
//          query
            System.out.println("connected");
            String procedureCall = "{CALL GET_MOVIE_DETAILS(?)}";
            // statement
            System.out.println("Query created");
            callableStatement  = connection.prepareCall(procedureCall);
            callableStatement.setString(1, "ANIMATION");
            System.out.println("query executed");
            // execute query on statement / get ResultSet
             resultSet = callableStatement.executeQuery();
            System.out.println("iterate resultset");
            // iterate
            while(resultSet.next()) {
//              int actorId =   resultSet.getInt("actor_id");
//              String firstName = resultSet.getString("first_name");
//              String lastName = resultSet.getString("last_name");
                String title =   resultSet.getString(1);
                String language = resultSet.getString(2);
                String category = resultSet.getString(3);
                System.out.println(title + "\t" + language + "\t" + category );
            }
            System.out.println("**************************");
            callableStatement.setString(1, "ACTION");
            System.out.println("query executed");
            // execute query on statement / get ResultSet
            resultSet = callableStatement.executeQuery();
            System.out.println("iterate resultset");
            // iterate
            while(resultSet.next()) {
//              int actorId =   resultSet.getInt("actor_id");
//              String firstName = resultSet.getString("first_name");
//              String lastName = resultSet.getString("last_name");
                String title =   resultSet.getString(1);
                String language = resultSet.getString(2);
                String category = resultSet.getString(3);
                System.out.println(title + "\t" + language + "\t" + category );
            }
         ResultSetMetaData resultSetMetaData =  resultSet.getMetaData();
            System.out.println(resultSetMetaData.getColumnCount());
            System.out.println(resultSetMetaData.getColumnName(1));
            System.out.println(resultSetMetaData.getColumnName(2));
            System.out.println(resultSetMetaData.getColumnName(3));

            DatabaseMetaData databaseMetaData = connection.getMetaData();
            System.out.println(databaseMetaData.getDatabaseProductName());
            System.out.println(databaseMetaData.getDriverName());
            System.out.println(databaseMetaData.getUserName());
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found");
        } catch (SQLException e) {
            System.out.println("Connect failed..");
        }
        finally {
            System.out.println("close connection");
            try {
                resultSet.close();
                callableStatement.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("failed closing con");
            }
        }
    }
}
