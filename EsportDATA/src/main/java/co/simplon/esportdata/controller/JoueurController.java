package co.simplon.esportdata.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.esportdata.model.Joueur;
import co.simplon.esportdata.repository.JoueurRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class JoueurController.
 */
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api")
public class JoueurController {

	/** The player repo. */
	@Autowired
	JoueurRepository playerRepo;

	/**
	 * Gets the all players.
	 *
	 * @return the all players
	 */
	@GetMapping("/joueur")
	List<Joueur> getAllPlayers() {
		return playerRepo.findAll();
	}

	/**
	 * Gets the player by id.
	 *
	 * @param playerID the player ID
	 * @return the player by id
	 */
	@GetMapping("/joueur/{playerID}")
	ResponseEntity<Joueur> getPlayerById(@PathVariable long playerID) {
		Joueur joueur = playerRepo.findOne(playerID);
		if (joueur == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(joueur);
	}

	/**
	 * Adds the player.
	 *
	 * @param joueur the joueur
	 * @return the joueur
	 */
	@PostMapping("/joueur/add")
	Joueur addPlayer(@Valid @RequestBody Joueur joueur) {
		
		Joueur playerAdd = playerRepo.save(new Joueur(joueur.getPseudo(),joueur.getGame(),
				joueur.getCountry(),joueur.getPrizeList(),joueur.getSalary()));
		return playerAdd;
	}

	/**
	 * Update player.
	 *
	 * @param playerID the player ID
	 * @param joueur the joueur
	 * @return the response entity
	 */
	@PutMapping("/joueur/update/{playerID}")
	ResponseEntity<Joueur> updatePlayer(@PathVariable long playerID, @Valid @RequestBody Joueur joueur) {
		Joueur playerToUpdate = playerRepo.findOne(playerID);
		if (playerToUpdate == null)
			return ResponseEntity.notFound().build();

		// Update the mandatory attributes
		/*
		 * playerToUpdate.setPseudo(joueur.getPseudo());
		 * playerToUpdate.setFirstName(joueur.getFirstName());
		 * playerToUpdate.setLastName(joueur.getLastName());
		 * playerToUpdate.setAddress(joueur.getAddress());
		 * playerToUpdate.setPhone(joueur.getPhone());
		 * playerToUpdate.setBirthDate(joueur.getBirthDate());
		 * playerToUpdate.setCountry(joueur.getCountry());
		 * playerToUpdate.setPrizeList(joueur.getPrizeList());
		 * playerToUpdate.setSalary(joueur.getSalary());
		 */

		// Update all other not null attributes
		if (joueur.getPseudo() != null)
			playerToUpdate.setPseudo(joueur.getPseudo());

		if (joueur.getFirstName() != null)
			playerToUpdate.setFirstName(joueur.getFirstName());

		if (joueur.getLastName() != null)
			playerToUpdate.setLastName(joueur.getLastName());

		if (joueur.getAddress() != null)
			playerToUpdate.setAddress(joueur.getAddress());

		if (joueur.getPhone() != null)
			playerToUpdate.setPhone(joueur.getPhone());

		if (joueur.getBirthDate() != null)
			playerToUpdate.setBirthDate(joueur.getBirthDate());

		if (joueur.getCountry() != null)
			playerToUpdate.setCountry(joueur.getCountry());
		
		if(joueur.getGame() != null)
			playerToUpdate.setGame(joueur.getGame());

		if (joueur.getPrizeList() != null)
			playerToUpdate.setPrizeList(joueur.getPrizeList());

		if (joueur.getSalary() != 0)
			playerToUpdate.setSalary(joueur.getSalary());

		Joueur updatedPlayer = playerRepo.save(playerToUpdate);
		return ResponseEntity.ok(updatedPlayer);
	}

	/**
	 * Delete player.
	 *
	 * @param playerID the player ID
	 * @return the response entity
	 */
	@DeleteMapping("/joueur/delete/{playerID}")
	ResponseEntity<Joueur> deletePlayer(@PathVariable long playerID) {
		
		Joueur joueur = playerRepo.findOne(playerID);
		if (joueur == null)
			return ResponseEntity.notFound().build();
		
		//Display delete
		System.out.println("Delete player with ID = " + playerID);

		playerRepo.delete(joueur);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/joueur/delete")
	public ResponseEntity<Joueur> deleteAllPlayer() {
		System.out.println("Delete All Players ! ");
		playerRepo.deleteAll();
		
		return new ResponseEntity<Joueur>( HttpStatus.OK);
	}

}
