package com.ninja_squad.geektic.DAO;

import java.util.List;
import com.ninja_squad.geektic.domaine.CentreInteret;
import javax.persistence.*;
import org.springframework.stereotype.Repository;

@Repository
public class CentreInteretDAO {
	@PersistenceContext
	private EntityManager entityManager;
	
	public CentreInteretDAO() {}

	public List<CentreInteret> findAll() {
	    TypedQuery<CentreInteret> query = entityManager.createQuery("SELECT p FROM CentreInteret as p",CentreInteret.class);
	    return query.getResultList();
	}
}
