package com.example.demo;

import java.sql.Date;
import java.util.*;

import javax.persistence.*;
@Entity
public class ProblemeCompose {
	@Id @GeneratedValue
	int id_prob_compose;
	String titre;
	Utilisateur username;
	Date date_publication;
	@OneToMany(mappedBy="problemeCompose",fetch=FetchType.LAZY)
	Collection<Probleme> problemes;//FK MappedBy(problemeCompose)
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Utilisateur getUsername() {
		return username;
	}
	public void setUsername(Utilisateur username) {
		this.username = username;
	}
	public Date getDate_publication() {
		return date_publication;
	}
	public void setDate_publication(Date date_publication) {
		this.date_publication = date_publication;
	}
	public Collection<Probleme> getProblemes() {
		return problemes;
	}
	public void setProblemes(Collection<Probleme> problemes) {
		this.problemes = problemes;
	}
	public ProblemeCompose(String titre, Utilisateur username, Date date_publication, Collection<Probleme> problemes) {
		super();
		this.titre = titre;
		this.username = username;
		this.date_publication = date_publication;
		this.problemes = problemes;
	}
	public void setId_prob_compose(int id_prob_compose) {
		this.id_prob_compose = id_prob_compose;
	}
	
	
	
}
