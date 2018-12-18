package co.simplon.esportdata.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.esportdata.model.Compte;
import co.simplon.esportdata.repository.CompteRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class CompteController.
 */
@RestController
@RequestMapping("/api")
public class CompteController {

	/** The account repo. */
	@Autowired
	CompteRepository accountRepo;

	/**
	 * Gets the all account.
	 *
	 * @return the all account
	 */
	@GetMapping("/compte")
	List<Compte> getAllAccount() {
		return accountRepo.findAll();
	}

	/**
	 * Gets the account by id.
	 *
	 * @param accountID the account ID
	 * @return the account by id
	 */
	@GetMapping("/compte/{accountID}")
	ResponseEntity<Compte> getAccountById(@PathVariable long accountID) {
		Compte compte = accountRepo.findOne(accountID);
		if (compte == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(compte);
	}

	/**
	 * Adds the account.
	 *
	 * @param compte the compte
	 * @return the compte
	 */
	@PostMapping("/compte/add")
	Compte addAccount(@Valid @RequestBody Compte compte) {
		return accountRepo.save(compte);
	}

	/**
	 * Update account.
	 *
	 * @param accountID the account ID
	 * @param compte the compte
	 * @return the response entity
	 */
	@PutMapping("/compte/update/{accountID}")
	ResponseEntity<Compte> updateAccount(@PathVariable long accountID, @Valid @RequestBody Compte compte) {
		Compte accountToUpdate = accountRepo.findOne(accountID);
		if (accountToUpdate == null)
			return ResponseEntity.notFound().build();
		if (compte.getEmail() != null)
			accountToUpdate.setEmail(compte.getEmail());
		if (compte.getMdp() != null)
			accountToUpdate.setMdp(compte.getMdp());

		Compte updateAccount = accountRepo.save(accountToUpdate);
		return ResponseEntity.ok(updateAccount);

	}

	/**
	 * Delete account.
	 *
	 * @param accountID the account ID
	 * @return the response entity
	 */
	@DeleteMapping("/compte/delete/{accountID}")
	ResponseEntity<Compte> deleteAccount(@PathVariable long accountID) {
		Compte compte = accountRepo.findOne(accountID);
		if (compte == null)
			return ResponseEntity.notFound().build();
		accountRepo.delete(compte);
		return ResponseEntity.ok().build();

	}

}
