package co.simplon.esportdata.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

// TODO: Auto-generated Javadoc
/**
 * The Class Compte.
 */
@Entity
public class Compte {

	/** The account ID. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // Permet de faire l'auto_increment
	@Column
	private long accountID;

	/** The email. */
	@NotBlank
	@Column
	private String email;

	/** The mdp. */
	@Column
	private String mdp;

	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Compte(long accountID, String email, String mdp) {
		super();
		this.accountID = accountID;
		this.email = email;
		this.mdp = mdp;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email
	 *            the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the mdp.
	 *
	 * @return the mdp
	 */
	public String getMdp() {
		return mdp;
	}

	/**
	 * Sets the mdp.
	 *
	 * @param mdp
	 *            the new mdp
	 */
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

}
