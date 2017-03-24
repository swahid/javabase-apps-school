/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.Employees;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Repository
@SuppressWarnings("unchecked")
public class EmployeesMapperImpl implements EmployeesMapper{

	@Autowired
	private HibernateTemplate  hibernateTemplate;
	private static final Logger log = LoggerFactory.getLogger(EmployeesMapperImpl.class);
	
	@Override
	@Transactional(readOnly=true)
	public List<Employees> getAllEmployeess() {
		String hql = "FROM Employees";
		return (List<Employees>) hibernateTemplate.find(hql);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<Employees> getAllEmployeessByParam(Map<String, Object> params) {
		String hql = "FROM Employees WHERE employeePost = 1";
		return (List<Employees>) hibernateTemplate.find(hql);
	}

	@Override
	@Transactional(readOnly=true)
	public Employees getEmployeesById(int employeesId) {
		return hibernateTemplate.get(Employees.class, employeesId);
	}

	@Override
	@Transactional
	public boolean addEmployees(Employees employees) {
		try {
			hibernateTemplate.save(employees);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean updateEmployees(Employees employees) {
		try {
			hibernateTemplate.update(employees);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteEmployees(int employeesId) {
		try {
			hibernateTemplate.delete(employeesId);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

}
