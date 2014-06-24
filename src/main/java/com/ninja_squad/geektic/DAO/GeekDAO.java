package com.ninja_squad.geektic.DAO;

import javax.persistence.*;

public class GeekDAO {
	private EntityManager entityManager;
	public GeekDAO(EntityManager entityManager) { 
		this.entityManager = entityManager;
	}
}
