/**
 * 
 */
package com.oguzhan.shuttle.mgmt.jpa.entities;

/**
 * @author oisleyen
 *
 */
public class Shuttle {
	
	private int shuttleId;
	
	private String shuttleName;
	
	private Driver driver;
	
	private List<Employee> employees;
	
	private String departureTime;
	
	private String arrivalTime;

	public int getShuttleId() {
		return shuttleId;
	}

	public void setShuttleId(int shuttleId) {
		this.shuttleId = shuttleId;
	}

	public String getShuttleName() {
		return shuttleName;
	}

	public void setShuttleName(String shuttleName) {
		this.shuttleName = shuttleName;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	
}
