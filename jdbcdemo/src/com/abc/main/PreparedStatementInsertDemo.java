package com.abc.main;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

import com.abc.util.DBUtil;

public class PreparedStatementInsertDemo {

	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Customer name: ");
		String customerName = sc.next();
		
		System.out.println("Enter Customer email: ");
		String customerEmail = sc.next();
		
		//read the date in string format
		System.out.println("Enter Customer DOB (yyyy-mm-dd):");
		String dob = sc.next();
		
		sc.close();
		
		//convert string format date to LocalDate
		LocalDate localDate = LocalDate.parse(dob);
		
		//convert LocalDate to java.sql.Date 
		Date customerDob = Date.valueOf(localDate);
		
		
		String insertSql = "insert into customer_tbl(customer_name,dob,email) values(?,?,?)";
		
		try(Connection con = DBUtil.getDBConnection()) {
			PreparedStatement ps = con.prepareStatement(insertSql);
			ps.setString(1, customerName);
			ps.setDate(2, customerDob);
			ps.setString(3, customerEmail);		
			
			int rowsEffected = ps.executeUpdate(); // insertion , updation and deletion
			System.out.println("No.of rows effected : "+rowsEffected);
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
