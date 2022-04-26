package com.createiq.dao;

import java.util.List;

import org.hibernate.Session;

import com.createiq.session.SessionUtil;
import com.createiq.util.Employee;


public class EmployeeDaoImpl implements EmployeeDao{

	public void save(Employee employee) {
	Session session=SessionUtil.getsession();
	session.save(employee);
	session.beginTransaction().commit();
	session.close();
		
	}

	public void update(Employee employee) {
		Session session=SessionUtil.getsession();
		session.update(employee);
		session.beginTransaction().commit();
		session.close();
		
		
	}

	public void delete(Integer id) {
Session session =SessionUtil.getsession();
Employee employee=new Employee();
employee.setId(id);
session.delete(employee);
session.beginTransaction().commit();
SessionUtil.close(session);
		
	}

	public Employee findById(Integer id) {
		
		return (Employee) SessionUtil.getsession().get( Employee.class, id);
	}

	public List<Employee> findAll() {
		
		return SessionUtil.getsession().createQuery("from Employee where id=?").list();
	}

}
