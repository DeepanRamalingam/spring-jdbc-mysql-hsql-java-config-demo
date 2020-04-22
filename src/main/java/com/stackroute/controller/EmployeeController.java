package com.stackroute.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.stackroute.dao.EmployeeDAO;
import com.stackroute.model.Employee;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeDAO empDao;
	@GetMapping("/employees")
	public String printAllEmployees(ModelMap map) {
		
		List<Employee> employees = empDao.findAll();
		for(Employee emp: employees) {
			System.out.println(emp);
		}
		map.addAttribute("employees", employees);
		return "welcome";
	}
	
	@GetMapping("/employee")
	public String printMessage(@RequestParam("empid")int empid,ModelMap map) {
		Employee employee = empDao.findById(empid);
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(employee);
			System.out.println(employee);
		map.addAttribute("employees", emps);
		return "welcome";
	}
}
