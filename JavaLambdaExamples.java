package com.amit.java.test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaLambdaExamples {
	
	public static void main (String... args){
		
		System.out.println("Hello World");
		
		EmployeeService empService= new EmployeeService();
		
		List<EmployeeDTO> employees = empService.getEmployees();
		//print all employees
		System.out.println("###########################");
		System.out.println("Print All Employees");
		System.out.println("###########################");
		employees.forEach((emp)->System.out.println(emp));
		
		//print employees who live in Agra
		System.out.println("###########################");
		System.out.println("Print Agra Employees");
		System.out.println("###########################");
		employees.forEach((emp)->{if (emp.getCity().equals("Agra"))
			System.out.println(emp);
		}
		);
		
		
		System.out.println("###########################");
		System.out.println("Print Agra Employees 2nd mechanism");
		System.out.println("###########################");
		
		employees.stream().filter(emp->emp.getCity().equals("Agra")).forEach((emp)->System.out.println(emp));
		
		
		//print employees whose salary>300000
		System.out.println("###########################");
		System.out.println("Print All Employees whose salary > 30000");
		System.out.println("###########################");
		
		employees.stream().filter(emp->emp.getSalary().compareTo(new BigDecimal("300000"))>0).forEach((emp)->System.out.println(emp));
		
		
		// Get unique cities of employees
		
		System.out.println("###########################");
		System.out.println("Print unique cities of Employees ");
		System.out.println("###########################");
		
		Set<String> cities= new HashSet<String>();
		employees.forEach(emp->cities.add(emp.getCity()));
		System.out.println(cities);
		
		
		//Map EmployeeId with Salary
		System.out.println("###########################");
		System.out.println("Print Map of employee id and salaries");
		System.out.println("###########################");
		Map<Integer,BigDecimal> employeesSalaryMap=employees.stream().collect(Collectors.toMap(EmployeeDTO::getEmpId,EmployeeDTO::getSalary));
		
		System.out.println("Map is "+employeesSalaryMap);
		
		
		
	}

}
