package org.javabase.apps.service;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.Employees;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface EmployeesService {
	
	public List<Employees> getAllEmployeess();
	public List<Employees> getAllEmployeessByParam(Map<String, Object> params);
	public Employees getEmployeesById(int employeesId);
	public boolean addEmployees(Employees employees);
	public boolean updateEmployees(Employees employees);
    public boolean deleteEmployees(int employeesId);

}
