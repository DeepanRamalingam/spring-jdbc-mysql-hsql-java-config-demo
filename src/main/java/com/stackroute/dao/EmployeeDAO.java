package com.stackroute.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.stackroute.model.Employee;

@Repository
public class EmployeeDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Employee> findAll(){
		return jdbcTemplate.query("select * from employee", new BeanPropertyRowMapper(Employee.class));		
	}
}
