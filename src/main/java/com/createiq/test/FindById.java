package com.createiq.test;

import com.createiq.dao.EmployeeDao;
import com.createiq.dao.EmployeeDaoImpl;
import com.createiq.util.Employee;

public class FindById {
	public static void main(String[] args) {
	EmployeeDao employeeDao=new EmployeeDaoImpl();
	System.out.println(employeeDao.findById(102 ));

	}

}
