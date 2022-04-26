package com.createiq.test;

import com.createiq.dao.EmployeeDao;
import com.createiq.dao.EmployeeDaoImpl;
import com.createiq.util.Employee;

public class AddEmployee {
	public static void main(String[] args) {
		EmployeeDao employeedao=new EmployeeDaoImpl();
		Employee employee=new Employee(102, "praveen", 150000.00);
		Employee employee2=new Employee(107,"vinith", 80000.00);
		Employee employee3=new Employee(110, "chary", 180000.00);
		employeedao.save(employee);
		employeedao.save(employee2);
		employeedao.save(employee3);
	}

}
