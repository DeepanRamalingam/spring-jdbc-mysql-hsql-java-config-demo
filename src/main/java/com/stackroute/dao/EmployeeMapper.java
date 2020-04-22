package com.stackroute.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.stackroute.model.Employee;

public class EmployeeMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setEmpid(rs.getInt(1));
		emp.setEmpname(rs.getString(2));
		emp.setGender(rs.getString(3).charAt(0));
		emp.setDesign(rs.getString(4));
		emp.setCity(rs.getString(5));
		emp.setSalary(rs.getInt(6));
		return emp;
	}

}
