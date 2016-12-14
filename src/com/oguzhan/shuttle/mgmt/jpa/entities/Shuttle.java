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

}
