package com.kalingauniversity.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kalingauniversity.dao.EmployeeDao;
import com.kalingauniversity.model.Employee;
import com.kalingauniversity.service.EmployeeServiceDao;

@Service
public class EmployeeServiceDaoImpl implements EmployeeServiceDao {

	@Autowired
	private EmployeeDao employeeDao;
	@Override
	public List<Employee> getEmployee() {
		
		return employeeDao.getEmployee();
	}

}
