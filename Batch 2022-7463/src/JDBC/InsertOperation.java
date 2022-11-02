package JDBC;

	import java.sql.*;
	import java.util.Scanner;
	
	class InsertOperation
	{
	    public static void main(String[] args){
	        
	      Scanner sc=new Scanner(System.in);
	         try {
	      System.out.println("Enter user Id:");
	      String userid =sc.nextLine();
	      System.out.println("Enter FULL NAME");
	      String name =sc.nextLine();
	      System.out.println("Enter Date of Birth: (YYYY-MM-DD)");
	      String dob = sc.nextLine();
	      System.out.println("Enter Emailid:");
	      String email = sc.nextLine();
	    Class.forName("com.mysql.cj.jdbc.Driver");
	   Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "Mysqlserver_80");
	   PreparedStatement pst = connect.prepareStatement("insert into USER(USER_ID,FULLNAME,DOB,EMAIL) values(?,?,?,?)");
	 
	  pst.setString(1,userid);
	  pst.setString(2, name);
	  pst.setString(3, dob);
	  pst.setString(4, email);
	        
	  int i = pst.executeUpdate(); 
	  System.out.println(i + "rows affected");
	  if(i!=0){
	        System.out.println("record successfully added");
	      }
	      else{
	        System.out.println("failed");
	      }
	    }
	    catch (Exception e){
	     System.out.println(e);
	    }
	  }
	}

	
