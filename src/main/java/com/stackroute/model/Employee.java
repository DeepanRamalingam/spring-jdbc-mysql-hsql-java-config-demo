package com.stackroute.model;

public class Employee {
	
	private int empid;
	private String empname;
	private char gender;
	private String design;
	private String city;
	private int salary;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int empid, String empname, char gender, String design, String city, int salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.gender = gender;
		this.design = design;
		this.city = city;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", gender=" + gender + ", design=" + design
				+ ", city=" + city + ", salary=" + salary + "]";
	}	

}
