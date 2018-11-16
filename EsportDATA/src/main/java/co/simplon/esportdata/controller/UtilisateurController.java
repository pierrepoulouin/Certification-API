package co.simplon.esportdata.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import co.simplon.esportdata.model.Utilisateur;
import co.simplon.esportdata.repository.UtilisateurRepository;

@RestController
@RequestMapping("/api")
public class UtilisateurController {

	@Autowired
	UtilisateurRepository userRepo;

	@GetMapping("/utilisateur")
	List<Utilisateur> getAllUsers() {
		return userRepo.findAll();
	}

	@GetMapping("/utilisateur/{userID}")
	ResponseEntity<Utilisateur> getUserById(@PathVariable long userID) {
		Utilisateur utilisateur = userRepo.findOne(userID);
		if (utilisateur == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(utilisateur);
	}

	@PostMapping("/utilisateur/add")
	Utilisateur addUser(@Valid @RequestBody Utilisateur utilisateur) {
		return userRepo.save(utilisateur);
	}
}
