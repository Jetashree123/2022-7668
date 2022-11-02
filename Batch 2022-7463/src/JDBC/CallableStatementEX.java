package JDBC;

//Java Program illustrating Callable Statement in JDBC

//Step 1: Importing DB(SQL) classes
import java.sql.*;

//Main class
class CallableStatementEX {

 // Main driver method
 public static void main(String[] args)
 {
     // Try block to check if any exceptions occurs
     try {

         // Step 2: Establish a connection

         // Step 3: Loading and registering drivers

         // Loading driver using forName() method
         Class.forName("com.mysql.cj.jdbc.Driver");

         // Registering driver using DriverManager
         Connection con = DriverManager.getConnection(
        		 "jdbc:mysql://localhost:3306/ecommerce", "root", "Mysqlserver_80");
         //DriverUrl = jdbc:mysql://localhost:serverPortNo/databaseName
        // Username = root
         //password = *********

         // Step 4: Create a statement
         Statement s = con.createStatement();

         // Step 5: Execute the query
         // select * from people

         CallableStatement cs
             = con.prepareCall("{call getCustomersByCity(?)}");
         cs.setString(1, "mumbai");
        cs.execute();
         ResultSet result
             = cs.executeQuery();

         // Step 6: Process the results

         // Condition check using next() method
         // to check for element
         while (result.next()) {

             // Print and display elements (City)
             System.out.println("Name:  " +result.getString(1) + "   City: "
                                + result.getString(2) + "   Salary: " +result.getInt(3));
        
         }
     }

     // Catch statement for DB exceptions
     catch (SQLException e) {

         // Print the exception
         System.out.println(e);
     }

     // Catch block for generic class exceptions
     catch (ClassNotFoundException e) {

         // Print the line number where exception occurred
         e.printStackTrace();
     }
 }
}

