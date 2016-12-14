/**
 * 
 */
package com.oguzhan.shuttle.mgmt.ejb.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.oguzhan.shuttle.mgmt.ejb.services.EmployeeService;
import com.oguzhan.shuttle.mgmt.jpa.entities.Employee;

/**
 * @author Oguzhan
 *
 */
@Stateless
public class EmployeeServiceImpl implements EmployeeService {
 
	@PersistenceContext(name = "ShuttleMgmtApp")
	private EntityManager em;
 
	@Override
	public void addEmployee(Employee emp) {
		em.persist(emp);		
	}

	@Override
	public void removeEmployee(Employee emp) {
		em.remove(emp);
	}
	
	@Override
	public void updateEmployee(Employee emp) {
		//TODO
	}
 
}