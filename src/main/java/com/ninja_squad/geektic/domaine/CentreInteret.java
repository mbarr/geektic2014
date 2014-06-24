package com.ninja_squad.geektic.domaine;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "interet")
public class CentreInteret {
	@Id
	@Column(name = "id_interet")
	private long idInteret;
	
	@Column(name = "lib_interet")
	private String libelle;
	
	public long getIdInteret() {
		return idInteret;
	}
	public String getLibelle() {
		return libelle;
	}
	@JsonIgnore
	@ManyToMany(mappedBy = "centresInterets")
	private List<Geek> geeks;
}
