package com.abc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.abc.bean.Customer;
import com.abc.util.DBUtil;

public class CustomerDao {

	public void saveCustomer(Customer customer) {

		String insertSql = "insert into customer_tbl(customer_name,dob,email) values(?,?,?)";

		// convert LocalDate to java.sql.Date
		Date customerDob = Date.valueOf(customer.getDob());

		try (Connection con = DBUtil.getDBConnection()) {
			PreparedStatement ps = con.prepareStatement(insertSql);
			ps.setString(1, customer.getCustomerName());
			ps.setDate(2, customerDob);
			ps.setString(3, customer.getEmail());
			
			ps.executeUpdate();	

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
