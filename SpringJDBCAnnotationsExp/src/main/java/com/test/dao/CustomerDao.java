package com.test.dao;


import java.util.List;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.test.model.Customer;
import com.test.model.CustomerMapper;

@Component
@Transactional(propagation = Propagation.REQUIRED)
public class CustomerDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public CustomerDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	private final String insert_sql = "insert into customer(id,firstName,lastName,location) values(?,?,?,?)";
	
	private final String update_sql = "update customer set firstName = ?, lastName = ?, location = ? where id = ?";
	
	private final String delete_sql = "delete from customer where id = ? ";
	
	private final String get_all_sql = "select * from customer ";
	
	@Transactional(propagation = Propagation.NEVER)
	public boolean createCustomer(Customer cust) {
		return jdbcTemplate.update(insert_sql,cust.getId(),cust.getFirstName(),cust.getLastName(),cust.getLocation())>0;

	}
	
	public boolean updateCustomer(Customer cust) {
		return jdbcTemplate.update(update_sql,cust.getFirstName(),cust.getLastName(),cust.getLocation(),cust.getId())>0;
	}
	
	public boolean deleteCustomer(Customer cust) {
		return jdbcTemplate.update(delete_sql,cust.getId())>0;
	}
	
	public List<Customer> getAllCustomers(){
		return jdbcTemplate.query(get_all_sql,new CustomerMapper());
	}
}
