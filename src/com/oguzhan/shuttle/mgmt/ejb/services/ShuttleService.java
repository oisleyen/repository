/**
 * 
 */
package com.oguzhan.shuttle.mgmt.ejb.services;

import com.oguzhan.shuttle.mgmt.jpa.entities.Shuttle;

/**
 * @author oisleyen
 *
 */
public interface ShuttleService {
	
	public void addShuttle(Shuttle sh);
	
	public void removeShuttle(Shuttle sh);
	
	public void updateShuttle(Shuttle sh);

	public List<Shuttle> getShuttles();

}
