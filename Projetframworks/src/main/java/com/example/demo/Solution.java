package com.example.demo;

import javax.persistence.*;


@Entity
public class Solution {
	@Id @GeneratedValue
	int id_solution;
	@ManyToOne
	Probleme probleme;// Mapped By solutions
	String solution;
	public Probleme getProbleme() {
		return probleme;
	}
	public void setProbleme(Probleme probleme) {
		this.probleme = probleme;
	}
	public String getSolution() {
		return solution;
	}
	public void setSolution(String solution) {
		this.solution = solution;
	}
	public void setId_solution(int id_solution) {
		this.id_solution = id_solution;
	}
	public Solution(Probleme probleme, String solution) {
		super();
		this.probleme = probleme;
		this.solution = solution;
	}
}
