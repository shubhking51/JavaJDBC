package in.co.vwits.ems.model;

import java.util.List;

public class Employee {
	private int empId;
	private String name;
	private double salary;	
	private String department;

	public int getId() {
		return empId;
	}

	public void setId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ "]";
	}

	
	
	
	
	
	


}
