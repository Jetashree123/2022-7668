package JDBC;


//Java Program illustrating Prepared Statement in JDBC

//Step 1: Importing DB(SQL here) classes
import java.sql.*;
//Importing Scanner class to
//take input from the user
import java.util.Scanner;

//Main class
class PreparedStatementEX {

 // Main driver method
 public static void main(String[] args)
 {
     // try block to check for exceptions
     try {

         // Step 2: Establish a connection

         // Step 3: Load and register drivers

         // Loading drivers using forName() method
         Class.forName("com.mysql.cj.jdbc.Driver");

         // Scanner class to take input from user
         Scanner sc = new Scanner(System.in);

         // Display message for ease for user
         System.out.println(
             "What age do you want to search?? ");

         // Reading age an primitive datatype from user
         // using nextInt() method
         int age = sc.nextInt();

         // Registering drivers using DriverManager
         Connection con = DriverManager.getConnection(
             "jdbc:mysql:///world", "root", "12345");

         // Step 4: Create a statement
         PreparedStatement ps = con.prepareStatement(
             "select name from world.people where age = ?");

         // Step 5: Execute the query
         ps.setInt(1, age);
         ResultSet result = ps.executeQuery();

         // Step 6: Process the results

         // Condition check using next() method
         // to check for element
         while (result.next()) {

             // Print and display elements(Names)
             System.out.println("Name : "
                                + result.getString(1));
         }

         // Step 7: Closing the connections
         // (Optional but it is recommended to do so)
     }

     // Catch block to handle database exceptions
     catch (SQLException e) {

         // Display the DB exception if any
         System.out.println(e);
     }

     // Catch block to handle class exceptions
     catch (ClassNotFoundException e) {

         // Print the line number where exception occurred
         // using printStackTrace() method if any
         e.printStackTrace();
     }
 }
}

