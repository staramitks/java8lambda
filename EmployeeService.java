package com.amit.java.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

	
	public List<EmployeeDTO> getEmployees()
	{
		List<EmployeeDTO> empList= new ArrayList<EmployeeDTO>();
		
		
			EmployeeDTO emp1= new EmployeeDTO(1,"Amit",33,"Agra",new BigDecimal("300000.0"));
			EmployeeDTO emp2= new EmployeeDTO(2,"Sumit",34,"Bhopal",new BigDecimal("320000.0"));
			EmployeeDTO emp3= new EmployeeDTO(3,"Ram",34,"Mathua",new BigDecimal("360000.0"));
			EmployeeDTO emp4= new EmployeeDTO(4,"Shilpi",30,"Noida",new BigDecimal("110000.0"));
			EmployeeDTO emp5= new EmployeeDTO(5,"Deepika",34,"Alwar",new BigDecimal("650000.0"));
			EmployeeDTO emp6= new EmployeeDTO(6,"Kamal",35,"Agra",new BigDecimal("200000.0"));
			EmployeeDTO emp7= new EmployeeDTO(7,"Ankush",34,"Agra",new BigDecimal("210000.0"));
			EmployeeDTO emp8= new EmployeeDTO(8,"Vinit",34,"Mumbai",new BigDecimal("300000.0"));
			EmployeeDTO emp9= new EmployeeDTO(9,"Swapnil",30,"Lalitpur",new BigDecimal("220000.0"));
			EmployeeDTO emp10= new EmployeeDTO(10,"Abhishek",29,"Allahabad",new BigDecimal("280000.0"));
			empList.add(emp1);
			empList.add(emp2);
			empList.add(emp3);
			empList.add(emp4);
			empList.add(emp5);
			empList.add(emp6);
			empList.add(emp7);
			empList.add(emp8);
			empList.add(emp9);
			empList.add(emp10);
			return empList;
		
	}
}
