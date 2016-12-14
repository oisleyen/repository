/**
 * 
 */
package com.oguzhan.shuttle.mgmt.ejb.services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.oguzhan.shuttle.mgmt.ejb.services.ShuttleService;
import com.oguzhan.shuttle.mgmt.jpa.entities.Shuttle;

/**
 * @author oisleyen
 *
 */
@Stateless
public class ShuttleServiceImpl implements ShuttleService {
	
	@PersistenceContext(name = "ShuttleMgmtApp")
	private EntityManager em;

	@Override
	public void addShuttle(Shuttle sh) {
		em.persist(sh);
	}

	@Override
	public void removeShuttle(Shuttle sh) {
		em.remove(sh);
	}

	@Override
	public void updateShuttle(Shuttle sh) {
		//TODO
	}

	@Override
	public List<Shuttle> getShuttles() {
		//TODO
		return null;
	}
}
