package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.Employees;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface EmployeesMapper {
	
	public List<Employees> getAllEmployeess();
	public List<Employees> getAllEmployeessByParam(Map<String, Object> params);
	public Employees getEmployeesById(int teacherPostId);
	public boolean addEmployees(Employees teacherPost);
	public boolean updateEmployees(Employees teacherPost);
    public boolean deleteEmployees(int teacherPostId);

}
