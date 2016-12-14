/**
 * 
 */
package com.oguzhan.shuttle.mgmt.jpa.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 * @author oisleyen
 *
 */
@Entity
public class Shuttle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int shuttleId;
	
	@Column(name = "shuttle_name")
	private String shuttleName;
	
	@ManyToMany
	@Column(name = "drivers")
	private List<Driver> drivers;
	
	@OneToMany(mappedBy="shuttle")
	@Column(name = "employees")
	private List<Employee> employees;
	
	@Column(name = "departureTime")
	private String departureTime;
	
	@Column(name = "arrivalTime")
	private String arrivalTime;
	
}
