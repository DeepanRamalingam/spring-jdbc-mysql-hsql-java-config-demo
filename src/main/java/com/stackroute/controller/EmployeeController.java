package com.stackroute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.stackroute.dao.EmployeeDAO;
import com.stackroute.model.Employee;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeDAO empDao;
	@GetMapping("/message")
	public String printMessage() {
		
		for(Employee emp: empDao.findAll()) {
			System.out.println(emp);
		}
		return "welcome";
	}
}
