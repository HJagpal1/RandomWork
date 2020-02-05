package com.qa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MysqlCustomerDao implements Dao<Customer>{

	//private Connection connection = DriverManager.getConnection("jdbc:mysql://35.234.135.151:3306/IMS","root","root");

	private Connection connection;

	public MysqlCustomerDao() throws SQLException{
		System.out.println("Wait.... Database is connecting");
		this.connection = DriverManager.getConnection("jdbc:mysql://35.234.135.151:3306/IMS","root","root");
		System.out.println("Great Success, you are now connected to your Database.");
	}
	
	public ArrayList<Customer> getAll(){
	 ArrayList<Customer> customers = new ArrayList<Customer>();
	try {
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from customer");
		while (resultSet.next()) {
			Long id = resultSet.getLong("customer_id");
			String firstName = resultSet.getString("customer_firstName");
			String surname = resultSet.getString("customer_surname");
			Customer customer = new Customer(id , firstName , surname);
			customers.add(customer);
		}
	} catch(Exception e) {
		e.printStackTrace();
	}
	return customers;
}
	public void create(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Customer> rendAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Customer t) {
		// TODO Auto-generated method stub
		
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	

}
