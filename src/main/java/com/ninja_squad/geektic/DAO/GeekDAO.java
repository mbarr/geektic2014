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
	
	public Geek findByIdWithCentreInterets(long idGeek) {
		Query query = entityManager.createQuery("SELECT g FROM Geek as g left join fetch g.centresInterets where id_geek=" + idGeek,Geek.class);
	    return (Geek) query.getSingleResult();
	}
	
	public List<Geek> findAll() {
	    TypedQuery<Geek> query = entityManager.createQuery("SELECT distinct g FROM Geek as g left join fetch g.centresInterets",Geek.class);
	    return query.getResultList();
	}
	
	public List<Geek> findAllBySexAndInterets(int idSex, long idInteret) {
		TypedQuery<Geek> query = entityManager.createQuery("SELECT distinct g FROM Geek as g left join fetch g.centresInterets "
				+ "where sexe_geek=" + idSex + " AND id_interet=" + idInteret,Geek.class);
	    return query.getResultList();
	}
}
