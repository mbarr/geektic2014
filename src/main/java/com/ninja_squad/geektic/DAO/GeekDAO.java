package com.ninja_squad.geektic.DAO;

import java.util.List;
import com.ninja_squad.geektic.domaine.Geek;
import javax.persistence.*;
import org.springframework.stereotype.Repository;

@Repository
public class GeekDAO {
	@PersistenceContext
	private EntityManager entityManager;
	
	public GeekDAO() {}
	
	public Geek findById(long idGeek) {
		return entityManager.find(Geek.class, idGeek);
	}
	public List<Geek> findBySex(int sexe) {
		TypedQuery<Geek> query = entityManager.createQuery("SELECT distinct g FROM Geek as g left join fetch g.centresInterets WHERE sexe_geek=" + sexe,Geek.class);
		/*Query q = em.createQuery("SELECT s FROM Geek s WHERE s.firstname = :fs");

		// set the parameter
		q.setParameter("fs", "Foo");*/
		
		return query.getResultList();
	}
	public List<Geek> findAll() {
	    TypedQuery<Geek> query = entityManager.createQuery("SELECT distinct g FROM Geek as g left join fetch g.centresInterets",Geek.class);
	    return query.getResultList();
	}
}
