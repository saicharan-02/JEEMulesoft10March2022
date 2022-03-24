package com.abc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionDemo2 {

	public static void main(String[] args) {
		
		String driverName = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/batch10db";
		String username = "batch10";
		String password = "batch10";
		
		Connection con = null;
		
		try {
			//step1 : load the driver and register with DriverManager 
			Class.forName(driverName);
			System.out.println("Driver loadded");
			
			//step2 : Establish the connection
		    con = DriverManager.getConnection(url, username, password);   
		    System.out.println("Connection established");	
		    
		  //step3 : perform db operations
		    
		   
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}	
		
		//step4 : close the connection
		finally {					
		    try {
				con.close();
				System.out.println("Conneciton closed");
			} catch (SQLException e) {				
				e.printStackTrace();
			}	   
		}	

	}

}
