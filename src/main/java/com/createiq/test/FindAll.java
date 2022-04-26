package com.createiq.test;

import java.util.List;

import com.createiq.dao.EmployeeDao;
import com.createiq.dao.EmployeeDaoImpl;
import com.createiq.util.Employee;

public class FindAll {
	public static void main(String[] args) {
		EmployeeDao employeeDao=new EmployeeDaoImpl();
		List<Employee> employee =employeeDao.findAll();
		employee.forEach(System.out::println);
	}

}
