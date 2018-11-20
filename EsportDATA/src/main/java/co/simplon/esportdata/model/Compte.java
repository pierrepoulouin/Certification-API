package co.simplon.esportdata.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Compte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // Permet de faire l'auto_increment
	private long accountID;

	@NotBlank
	private String email;
	private String mdp;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

}