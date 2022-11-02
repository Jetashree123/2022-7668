package JDBC;
// Java Program illustrating select Statement in JDBC
// Importing Database(SQL) classes
import java.sql.*; //step 1
 
// Class
class CreateStatementEX {
 
    // Main driver method
    public static void main(String[] args)
    {
        // Try block to check if any exceptions occur
        try {
            // Step 2: Loading and registering drivers
            // Loading driver using forName() method
            Class.forName("com.mysql.cj.jdbc.Driver");
 
            // Registering driver using DriverManager
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ecommerce", "root", "Mysqlserver_80");
 
            // Step 3: Create a statement
            Statement statement = con.createStatement();//prepareStatemet()
            String sql = "select * from user";
 
            // Step 4: Execute the query
            ResultSet result = statement.executeQuery(sql);
 
            // Step 5: Process the results
 
            // Condition check using hasNext() method which
            // holds true till there is single element
            // remaining in List
            
            while (result.next()) {
 
                // Print name an age
            	System.out.println(
                        "ID: " + result.getInt(1));
                System.out.println(
                    "Name: " + result.getString(2));
                System.out.println("Date of birth" + result.getDate(3));
                System.out.println(
                    "email address:" + result.getString(4));     
            }
        }
        // Catching database exceptions if any
        catch (SQLException e) {
            // Print the exception
            System.out.println(e);
        }
 
        // Catching generic ClassNotFoundException if any
        catch (ClassNotFoundException e) {
 
            // Print and display the line number
            // where exception occurred
            e.printStackTrace();
        }
    }
}

