package com.createiq.dao;


import java.util.List;

import com.createiq.util.Employee;

public interface EmployeeDao {
	public void save(Employee employee);

	public void update(Employee employee);

	public void delete(Integer id);

	public Employee findById(Integer id);
	public List<Employee> findAll();

	
	

}
