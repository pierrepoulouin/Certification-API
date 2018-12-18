package co.simplon.esportdata.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// TODO: Auto-generated Javadoc
/**
 * The Class Utilisateur.
 */
@Entity
public class Utilisateur extends Personne {

	/** The user ID. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // Permet de faire l'auto_increment
	@Column
	private long userID;

	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Utilisateur(long userID) {
		super();
		this.userID = userID;
	}

	/**
	 * Gets the user ID.
	 *
	 * @return the user ID
	 */
	public long getUserID() {
		return userID;
	}

	/**
	 * Sets the user ID.
	 *
	 * @param userID
	 *            the new user ID
	 */
	public void setUserID(long userID) {
		this.userID = userID;
	}

}
