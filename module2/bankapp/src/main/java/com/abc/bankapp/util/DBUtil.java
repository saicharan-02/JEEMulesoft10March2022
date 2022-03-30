package com.abc.bankapp.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

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
			
			//step2 : Establish the connection
		    con = DriverManager.getConnection(URL, USERNAME, PASSWORD);   
		   
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
