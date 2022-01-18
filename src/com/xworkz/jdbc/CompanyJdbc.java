package com.xworkz.jdbc;
import java.sql.*;

public class CompanyJdbc {
  static String url="jdbc:mysql://localhost:3306/companys";
  static String username="root";
  static String password ="Sanjana@123";
  
  static String sqlStatement="insert into companys.companys_details values(5,'wipro','Bangalore',0,98000000,300)";
  static String updateQuery = "update companys.companys_details SET location='Hyderbad' WHERE id=2";
  static String deleteQuery = "Delete from companys.companys_details WHERE name='honeywell'";
  


public static void main(String[] args) {
    
	
	Connection connection = null;
	try {

	connection  = DriverManager.getConnection(url, username, password);
	System.out.println(connection+url);
	
	Statement statement=connection.createStatement();
	statement.executeUpdate(updateQuery);
	statement.executeUpdate(deleteQuery);
	
	System.out.print("Query is executed \n");
	
	}catch(SQLException sr) {
		System.out.println("Query is not executed"+sr.getMessage());
    }
	
	finally {
		
		try {
			if(connection!=null)
			{
				connection.close();
				System.out.println("connection is closed");
			}
		}
			catch(SQLException e) {
				
			}
			System.out.println("Query is executed");
	
   }
  }
}
