package com.amit.java.test;

import java.io.Serializable;
import java.math.BigDecimal;

public class EmployeeDTO implements Serializable, Comparable<EmployeeDTO>{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6634766187785195435L;
	private Integer empId;
	private String name;
	private int age;
	private String city;
	private BigDecimal salary;
	
	public EmployeeDTO(int id, String name, int age, String city, BigDecimal salary) {
		super();
		this.empId=id;
		this.name = name;
		this.age = age;
		this.city = city;
		this.salary = salary;
	}

	
	
	//not fully implemented just added for future usaage
	@Override
	public int compareTo(EmployeeDTO emp) {
		return empId.compareTo(emp.getEmpId());
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		return result;
	}




	




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public String getCity() {
		return city;
	}




	public void setCity(String city) {
		this.city = city;
	}




	public BigDecimal getSalary() {
		return salary;
	}




	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}




	@Override
	public String toString() {
		return "EmployeeDTO [name=" + name + ", age=" + age + ", city=" + city + ", salary=" + salary + "]";
	}



	public int getEmpId() {
		return empId;
	}



	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	
	

}
