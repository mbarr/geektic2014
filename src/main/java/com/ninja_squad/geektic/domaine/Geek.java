package com.ninja_squad.geektic.domaine;

import java.util.Date;
import javax.persistence.*;

@Entity
public class Geek {
	@Id
	private long id_geek;
	private String nom_geek;
	private String prenom_geek;
	private String pseudo_geek;
	private String mail_geek;
}
