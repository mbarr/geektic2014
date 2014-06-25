package com.ninja_squad.geektic.DAO;

import java.util.List;
import com.ninja_squad.geektic.domaine.Interet;
import javax.persistence.*;
import org.springframework.stereotype.Repository;

@Repository
public class InteretDAO {
	@PersistenceContext
	private EntityManager entityManager;
	
	public InteretDAO() {}
	
	public Interet findById(Long idGeek) {
		return entityManager.find(Interet.class, idGeek);
	}

	public List<Interet> findAll() {
	    TypedQuery<Interet> query = entityManager.createQuery("SELECT g FROM Geek as g",Interet.class);
	    return query.getResultList();
	}
}
