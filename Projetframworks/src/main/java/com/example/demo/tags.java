package com.example.demo;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;
@Entity
public class tags implements Serializable {
	@Id @GeneratedValue
	int id_tag;
	
	String nom;
	@ManyToMany
	Collection<Probleme> problemes; //FK MappedBy(tags)
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Collection<Probleme> getProblemes() {
		return problemes;
	}
	public void setProblemes(Collection<Probleme> problemes) {
		this.problemes = problemes;
	}
	public void setId_tag(int id_tag) {
		this.id_tag = id_tag;
	}
	public tags(String nom, Collection<Probleme> problemes) {
		super();
		this.nom = nom;
		this.problemes = problemes;
	}
	
}
