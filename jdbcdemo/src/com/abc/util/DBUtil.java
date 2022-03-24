package com.abc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private final static String DRIVERNAME = "org.postgresql.Driver";
	private final static String URL = "jdbc:postgresql://localhost:5432/batch10db";
	private final static String USERNAME = "batch10";
	private final static String PASSWORD = "batch10";
	
	public static Connection getDBConnection() {		
	
		Connection con = null;
		
		try {
			//step1 : load the driver and register with DriverManager 
			Class.forName(DRIVERNAME);
			System.out.println("Driver loadded");
			
			//step2 : Establish the connection
		    con = DriverManager.getConnection(URL, USERNAME, PASSWORD);   
		    System.out.println("Connection established");	
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}	
		
		return con;
	}
}
