package com.ninja_squad.geektic.domaine;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Audit {
	@Id
	private long id_audit;
	
	@Column(name = "id_geek")
	private long idGeek;
	
	@Column(name = "compteur_audit")
	private long compteur;
	
	@Column(name = "heure_consultation_audit")
	private Date heureConsultation;
	
	@Column(name = "ip_visiteur_audit")
	private String ipVisiteur;
}
