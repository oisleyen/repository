/**
 * 
 */
package com.oguzhan.shuttle.mgmt.ejb.services.impl;

import com.oguzhan.shuttle.mgmt.ejb.services.ShuttleService;

/**
 * @author oisleyen
 *
 */
public class ShuttleServiceImpl implements ShuttleService {
	
	@PersistenceContext(name = "ShuttleApp")
	private EntityManager em;
}
