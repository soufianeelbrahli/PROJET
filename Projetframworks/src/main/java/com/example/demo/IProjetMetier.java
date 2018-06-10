package com.example.demo;

import java.util.HashSet;
import java.util.List;



public interface IProjetMetier {
	public Utilisateur chercher_utilisateur(String username);
	public void ajouter_utilisateur(Utilisateur utilisateur );
	public void ajouter_prob(Probleme prob);
	public Probleme chercher_probleme(int id_probleme);
	public List<Probleme> liste_probleme();
	public List<Probleme> chercher_problemes(String username);
	public void supprimer_prob(int id_prob);
	public HashSet<Integer> look_like_myproblem(int id_problem);
	public List<Probleme> tous_prob(HashSet<Integer> lstId);
	public void ajouter_sous_prob(Probleme prob);
	public List<Probleme> chercher_sous_problemes(int id_prob_compose);
	public void supprimer(int id_probleme);
	public void supprimerByCompo(int id_prob_compose);
	public void AjouterProblemeCompose(ProblemeCompose pc);
	public List<ProblemeCompose> Checher_Prob_Com(String username);
	public void supprimerc(int id_prob_compse);
	public void ajouter_solution(Solution s);
	public List<Solution> chercher_solutions(int id_probleme);
	public void ajouter_tag(tags tag);

}
