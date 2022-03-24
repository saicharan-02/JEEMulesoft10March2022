package com.abc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String driverName = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String username = "postgres";
		String password = "master";
		
		//step1 : load the driver and register with DriverManager 
		Class.forName(driverName);
		System.out.println("Driver loadded");
		
		//step2 : Establish the connection
	    Connection con = DriverManager.getConnection(url, username, password);   
	    System.out.println("Connection established");	
		
		//step3 : perform db operations
		
		//step4 : close the connection
	    con.close();
	    System.out.println("Conneciton closed");

	}

}
