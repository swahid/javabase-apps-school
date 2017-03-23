/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.Employees;
import org.javabase.apps.mapper.EmployeesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Service
public class EmployessServiceImpl implements EmployeesService{

	@Autowired
	EmployeesMapper employeesMapper;

	@Override
	public List<Employees> getAllEmployeess() {
		return employeesMapper.getAllEmployeess();
	}

	@Override
	public List<Employees> getAllEmployeessByParam(Map<String, Object> params) {
		return employeesMapper.getAllEmployeessByParam(params);
	}

	@Override
	public Employees getEmployeesById(int employeesId) {
		return employeesMapper.getEmployeesById(employeesId);
	}

	@Override
	public boolean addEmployees(Employees employees) {
		return employeesMapper.addEmployees(employees);
	}

	@Override
	public boolean updateEmployees(Employees employees) {
		return employeesMapper.updateEmployees(employees);
	}

	@Override
	public boolean deleteEmployees(int employeesId) {
		return employeesMapper.deleteEmployees(employeesId);
	}

}
