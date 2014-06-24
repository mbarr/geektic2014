package com.ninja_squad.geektic.domaine;

import java.util.Date;
import javax.persistence.*;

@Entity
public class Audit {
	@Id
	private long id_audit;
	private long id_geek;
	private long compteur_audit;
	private Date heure_consultation_audit;
	private String ip_visiteur_audit;
}
