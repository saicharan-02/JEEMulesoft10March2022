package com.abc.main;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {

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
		    String sql = "select *  from customer_tbl";
		    Statement st = con.createStatement();
		    ResultSet rs = st.executeQuery(sql);
		   // ResultSetMetaData rsmd=rs.getMetaData();		 
		    //int columnCount = rsmd.getColumnCount();		 
		    //System.out.println(rsmd.getColumnName(1)+ " "+rsmd.getColumnName(2)+" "+rsmd.getColumnName(3)+ " "+rsmd.getColumnName(4));
		    while(rs.next()) {
		    	int cid = rs.getInt(1);
		    	String cname = rs.getString("customer_name"); // either column index or name in result set
		    	Date cdob = rs.getDate(3);
		    	String cemail = rs.getString(4);
		    	System.out.println(cid+ " "+cname+" "+cdob+" "+cemail);
		    	
		    }
		   	   
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
