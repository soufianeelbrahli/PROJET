package com.example.demo;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

import javax.persistence.*;
@Entity
public class Probleme implements Serializable {
	@Id @GeneratedValue
	private int id_prob;
	
	String titre;
	String contenu;
	Date date_publication;
	boolean résolu;
	Utilisateur username;
	@ManyToOne
	ProblemeCompose problemeCompose;//FK MappedBy(problemes)
	@OneToMany(mappedBy="probleme",fetch=FetchType.LAZY)
	Collection<Solution> solutions; // FK MappedBy(probleme)
	@ManyToMany(mappedBy="problemes")
	Collection<tags> tags; // FK MappeBy(problemes)
	public Probleme(String titre, String contenu, Date date_publication, boolean résolu, Utilisateur username,
			ProblemeCompose problemeCompose, Collection<Solution> solutions, Collection<com.example.demo.tags> tags) {
		super();
		this.titre = titre;
		this.contenu = contenu;
		this.date_publication = date_publication;
		this.résolu = résolu;
		this.username = username;
		this.problemeCompose = problemeCompose;
		this.solutions = solutions;
		this.tags = tags;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public Date getDate_publication() {
		return date_publication;
	}
	public void setDate_publication(Date date_publication) {
		this.date_publication = date_publication;
	}
	public boolean isRésolu() {
		return résolu;
	}
	public void setRésolu(boolean résolu) {
		this.résolu = résolu;
	}
	public Utilisateur getUsername() {
		return username;
	}
	public void setUsername(Utilisateur username) {
		this.username = username;
	}
	public ProblemeCompose getProblemeCompose() {
		return problemeCompose;
	}
	public void setProblemeCompose(ProblemeCompose problemeCompose) {
		this.problemeCompose = problemeCompose;
	}
	public Collection<Solution> getSolutions() {
		return solutions;
	}
	public void setSolutions(Collection<Solution> solutions) {
		this.solutions = solutions;
	}
	public Collection<tags> getTags() {
		return tags;
	}
	public void setTags(Collection<tags> tags) {
		this.tags = tags;
	}
	public void setId_prob(int id_prob) {
		this.id_prob = id_prob;
	}
}
