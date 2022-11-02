package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
public class DBConnectivity{
  
private static final String CREATE_TABLE="CREATE TABLE User("+"USER_ID int(10) NOT NULL,"+"FULLNAME VARCHAR(20) NOT NULL,"+"DOB DATE NOT NULL,"+"EMAIL VARCHAR(50) NOT NULL,"+"PRIMARY KEY (USER_ID))";
//Class.forName("com.mysql.cj.jdbc.Driver");  

//create table person(id int , )

public static void main(String[] args) throws ClassNotFoundException 
{
    String url = "jdbc:mysql://localhost:3306/ecommerce";
    String username = "root";
    String passwd = "Mysqlserver_80";
    Connection connect = null;
    PreparedStatement statement = null;
    Class.forName("com.mysql.cj.jdbc.Driver");
    try 
{
    //Class.forName("com.mysql.cj.jdbc.Driver");
connect = DriverManager.getConnection(url, username, passwd);
statement = connect.prepareStatement(CREATE_TABLE);
statement.executeUpdate();
System.out.println("Table created");
}
    catch(SQLException e) 
{
e.printStackTrace();
}
    finally
{
      try {
        if (statement != null) {
          statement.close();
        }
        if (connect!= null) {
          connect.close();
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
