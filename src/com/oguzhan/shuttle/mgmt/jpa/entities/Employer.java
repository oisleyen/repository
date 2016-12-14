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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 * @author oisleyen
 *
 */
@Entity
public class Employer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employerId;
	
	@Column(name = "employer_name")
	private String employerName;
	
	@OneToMany(mappedBy="employer")
	@Column(name = "employees")
	private List<Employee> employee;

	
}
