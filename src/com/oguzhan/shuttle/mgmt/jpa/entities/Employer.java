/**
 * 
 */
package com.oguzhan.shuttle.mgmt.jpa.entities;

/**
 * @author oisleyen
 *
 */
public class Employer {
	
	
	private int employerId;
	
	private String employerName;
	
	private List<Employee> employees;

	public int getEmployerId() {
		return employerId;
	}

	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	
}
