/**
 * 
 */
package com.oguzhan.shuttle.mgmt.gui.controllers;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;

import com.oguzhan.shuttle.mgmt.ejb.services.EmployeeService;
import com.oguzhan.shuttle.mgmt.jpa.entities.Employee;

/**
 * @author Oguzhan
 *
 */
@ManagedBean
public class EmployeeController {
 
	private Employee employee = new Employee();
 
	@EJB
	private EmployeeService service;
 
	public Employee getEmployee() {
		return employee;
	}
 
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
 
	public void saveEmployee(Employee emp) {
		service.addEmployee(emp);
	}
 
}
