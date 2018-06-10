package com.example.demo;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.Where;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class ProjetMetierImpl implements IProjetMetier {
	@Autowired
	private UtilisateurRepository utilisateurRepository;
	@Override	
	public Utilisateur chercher_utilisateur(String username) {
		
		List<Utilisateur> user=utilisateurRepository.findAll();
		if(user!=null){
			for(int i=0;i<user.size();i++){
				if(user.get(i).getUsername().equals(username)){
					return user.get(i);
				}
			}
		}
		return null;
	}

	@Override
	public void ajouter_utilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouter_prob(Probleme prob) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Probleme chercher_probleme(int id_probleme) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Probleme> liste_probleme() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Probleme> chercher_problemes(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimer_prob(int id_prob) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HashSet<Integer> look_like_myproblem(int id_problem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Probleme> tous_prob(HashSet<Integer> lstId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouter_sous_prob(Probleme prob) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Probleme> chercher_sous_problemes(int id_prob_compose) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimer(int id_probleme) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerByCompo(int id_prob_compose) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AjouterProblemeCompose(ProblemeCompose pc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProblemeCompose> Checher_Prob_Com(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerc(int id_prob_compse) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouter_solution(Solution s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Solution> chercher_solutions(int id_probleme) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouter_tag(tags tag) {
		// TODO Auto-generated method stub
		
	}

}
