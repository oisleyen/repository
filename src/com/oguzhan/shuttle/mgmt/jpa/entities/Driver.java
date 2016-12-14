/**
 * 
 */
package com.oguzhan.shuttle.mgmt.jpa.entities;

/**
 * @author oisleyen
 *
 */
public class Driver {
	
	private int driverId;
	
	private String firstName;
	
	private String lastName;
	
	private Shuttle shuttle;

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Shuttle getShuttle() {
		return shuttle;
	}

	public void setShuttle(Shuttle shuttle) {
		this.shuttle = shuttle;
	}
	
	
}
