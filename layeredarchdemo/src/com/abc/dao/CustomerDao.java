package com.abc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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
	
	public Customer findCustomerById(int customerId) {
		
		String sql = "select * from customer_tbl where customer_id = ?";
		
		Customer customer = null;
		
		try (Connection con = DBUtil.getDBConnection()) {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, customerId);
				
			ResultSet rs = ps.executeQuery();				
			
			if(rs.next()) {
				int cid = rs.getInt(1);
				String name = rs.getString(2);
				Date dob = rs.getDate(3);
				String email = rs.getString(4);		
				
				customer = new Customer();
				customer.setCustomerId(cid);
				customer.setCustomerName(name);
				customer.setDob(dob.toLocalDate()); // converting sql date to LocalDate 
				customer.setEmail(email);				
			}		

		} catch (SQLException e) {
			e.printStackTrace();
		}				
			
		return customer;				
	}	
	
	public boolean deleteCustomer(int customerId) {
		
		//todo
		return false;		
	}
	
	public List<Customer> getAllCustomers() {
		
		//todo
		return null;		
	}	
	
}
