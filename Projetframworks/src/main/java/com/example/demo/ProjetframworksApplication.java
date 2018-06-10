package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetframworksApplication implements CommandLineRunner {
	@Autowired
	private UtilisateurRepository UtilisateurRepository;
	public static void main(String[] args) {
		SpringApplication.run(ProjetframworksApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Utilisateur User1=UtilisateurRepository.save(new Utilisateur("Soufiane","Soufiane"));
		Utilisateur User2=UtilisateurRepository.save(new Utilisateur("Simo","Simo"));
		Utilisateur User3=UtilisateurRepository.save(new Utilisateur("Oussama","Oussama"));
		Utilisateur User4=UtilisateurRepository.save(new Utilisateur("Chaimaa","Chaimaa"));
		
		
	}
}
