package com.createiq.test;

import com.createiq.dao.EmployeeDao;
import com.createiq.dao.EmployeeDaoImpl;
import com.createiq.util.Employee;

public class UpdateEmployee {
	public static void main(String[] args) {
		
	
	EmployeeDao employeeDao= new EmployeeDaoImpl();
	Employee employee=new Employee(103,"sai",60000.00);
	Employee employee2=new Employee(102,"praveenkumar", 70000);
	employeeDao.update(employee);
	employeeDao.update(employee2);

}
}