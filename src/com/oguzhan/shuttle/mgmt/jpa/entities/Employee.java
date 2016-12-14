/**
 * 
 */
package com.oguzhan.shuttle.mgmt.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 * @author Oguzhan
 *
 */
@Entity
@Table(name = "employee")
public class Employee {
 
	@TableGenerator(name = "employee_gen", table = "id_gen", pkColumnName = "gen_name", valueColumnName = "gen_val", allocationSize = 1, pkColumnValue = "employee_gen")
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "employee_gen")
	private int employeeId;
 
	@Column(name = "first_name")
	private String firstName;
 
	@Column(name = "last_name")
	private String lastName;
	
	private Employer employer;
	
 
}
