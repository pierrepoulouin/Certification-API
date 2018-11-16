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

import co.simplon.esportdata.model.Joueur;
import co.simplon.esportdata.repository.JoueurRepository;



@RestController
@RequestMapping("/api")
public class JoueurController {

	@Autowired
	JoueurRepository playerRepo;

	
	@GetMapping("/joueur")
	List<Joueur> getAllPlayers() {
		return playerRepo.findAll();
	}

	@GetMapping("/joueur/{playerID}")
	ResponseEntity<Joueur> getActeurById(@PathVariable long playerID) {
	    Joueur joueur = playerRepo.findOne(playerID);
	    if(joueur == null) {
	        return ResponseEntity.notFound().build();
	    }
	    return ResponseEntity.ok().body(joueur);
	}
	@PostMapping("/joueur/add")
	Joueur addActeur(@Valid @RequestBody Joueur joueur){
		return playerRepo.save(joueur);
	}
}
