package co.simplon.esportdata.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Personne {

	private String email;
	private String mdp;
	private String pseudo;

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

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

}
