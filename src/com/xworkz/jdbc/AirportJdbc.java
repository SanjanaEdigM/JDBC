package com.xworkz.jdbc;
import java.sql.*;

public class AirportJdbc {
   
	 static String url="jdbc:mysql://localhost:3306/Airport";
	 static String userName="root";
	 static String password="Sanjana@123";
	 
	 
	 static String sqlStatement="insert into Airport.Airport_details values(3,'CR','Bangalore',6)";
	 static String updateQuery = "update Airport.Airport_details SET location='Hyderbad' WHERE id=2";
	 static String deleteQuery = "Delete from Airport.Airport_details WHERE name='KempeGowda'";
	
	 public static void main(String ar[]) {
		 Connection connection = null;
			try {

			connection  = DriverManager.getConnection(url, userName, password);
			System.out.println(connection+url);
			
			Statement statement=connection.createStatement();
			statement.executeUpdate(sqlStatement);
			
			
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
						System.out.println("Connection is closed");
					}
				}
					catch(SQLException e) {
						
					}
					System.out.println("Query is executed");
			
		   }
		  }
		}
