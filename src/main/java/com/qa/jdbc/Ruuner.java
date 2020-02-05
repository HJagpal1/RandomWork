package com.qa.jdbc;

import java.sql.SQLException;
import java.util.ArrayList;

public class Ruuner {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		MysqlCustomerDao dao = new MysqlCustomerDao();
		ArrayList<Customer> customers = dao.getAll();
		for (Customer customer : customers) {
			System.out.println(customer.getId() + " " +customer.getFirstName() + " "+ customer.getSurname());
		}
	}

}
