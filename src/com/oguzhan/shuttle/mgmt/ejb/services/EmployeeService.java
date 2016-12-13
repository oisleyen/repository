/**
 * 
 */
package com.oguzhan.shuttle.mgmt.ejb.services;

import com.oguzhan.shuttle.mgmt.jpa.entities.Employee;

/**
 * @author Oguzhan
 *
 */
public interface EmployeeService {

	public void addEmployee(Employee emp);
	
	public void removeEmployee(Employee emp);
	
}
