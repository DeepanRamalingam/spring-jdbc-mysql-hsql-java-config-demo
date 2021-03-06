package com.stackroute.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.stackroute.model.Employee;

@Repository
public class EmployeeDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public List<Employee> findAll(){
		return jdbcTemplate.query("select * from employee", new EmployeeMapper());		
	}
	
	public Employee findById(int id) {
		
		String sql = "select * from employee where empid = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] {id},new EmployeeMapper());
	}
}
