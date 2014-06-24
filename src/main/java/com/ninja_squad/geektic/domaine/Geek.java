package com.ninja_squad.geektic.domaine;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
public class Geek {
	@Id
	@Column(name = "id_geek")
	private long idGeek;
	
	@Column(name = "nom_geek")
	private String nom;
	
	@Column(name = "prenom_geek")
	private String prenom;
	
	@Column(name = "sexe_geek")
	private int sexe;
	
	@Column(name = "pseudo_geek")
	private String pseudo;
	
	@Column(name = "mail_geek")
	private String mail;
	
	@ManyToMany 
	@JoinTable(name="possede", joinColumns={@JoinColumn(name="id_geek", referencedColumnName="id_geek")}, 
				inverseJoinColumns={@JoinColumn(name="id_interet", referencedColumnName="id_interet")}) 
	private List<CentreInteret> centresInterets; 
	
	public List<CentreInteret> getCentreInterets() { 
		return this.centresInterets; } 
	
	public void setCentreInterets(List<CentreInteret> centresInterets) { 
		this.centresInterets = centresInterets; 
	}
	public long getIdGeek() {
		return idGeek;
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public int getSexe() {
		return sexe;
	}
	public String getPseudo() {
		return pseudo;
	}
	public String getMail() {
		return mail;
	}
	
	public void setNom(String leNom) {
		this.nom = leNom;
	}
	public void setPrenom(String lePrenom) {
		this.prenom = prenom;
	}
	public void setSexe(int leSexe) {
		this.sexe = sexe;
	}
	public void setPseudo(String lePseudo) {
		this.pseudo = pseudo;
	}
	public void setMail(String leMail) {
		this.mail = mail;
	}
}
