package co.simplon.esportdata.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

// TODO: Auto-generated Javadoc
/**
 * The Class Joueur.
 */
@Entity
public class Joueur extends Personne {

	/** The player ID. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // Permet de faire l'auto_increment
	@Column
	private long playerID;

	/** The country. */
	@NotBlank
	@Column
	private String country;

	/** The game. */
	@NotBlank
	@Column
	private String game;

	/** The prize list. */
	@NotBlank
	@Column
	private String prizeList;

	/** The salary. */
	@NotNull
	@Column
	private double salary;

	/** The user ID. */
	@OneToOne
	@JoinColumn(name = "userid")
	private Utilisateur userID;

	public Joueur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Joueur(String pseudo,String country, String game, String prizeList, double salary) {
		super();
		this.pseudo = pseudo;
		this.country = country;
		this.game = game;
		this.prizeList = prizeList;
		this.salary = salary;
	
	}

	/**
	 * Gets the player ID.
	 *
	 * @return the player ID
	 */
	public long getPlayerID() {
		return playerID;
	}

	/**
	 * Sets the player ID.
	 *
	 * @param playerID
	 *            the new player ID
	 */
	public void setPlayerID(long playerID) {
		this.playerID = playerID;
	}

	/**
	 * Gets the country.
	 *
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Sets the country.
	 *
	 * @param country
	 *            the new country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * Gets the game.
	 *
	 * @return the game
	 */
	public String getGame() {
		return game;
	}

	/**
	 * Sets the game.
	 *
	 * @param game
	 *            the new game
	 */
	public void setGame(String game) {
		this.game = game;
	}

	/**
	 * Gets the prize list.
	 *
	 * @return the prize list
	 */
	public String getPrizeList() {
		return prizeList;
	}

	/**
	 * Sets the prize list.
	 *
	 * @param prizeList
	 *            the new prize list
	 */
	public void setPrizeList(String prizeList) {
		this.prizeList = prizeList;
	}

	/**
	 * Gets the salary.
	 *
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * Sets the salary.
	 *
	 * @param salary
	 *            the new salary
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * Gets the user ID.
	 *
	 * @return the user ID
	 */
	public Utilisateur getUserID() {
		return userID;
	}

	/**
	 * Sets the user ID.
	 *
	 * @param userID
	 *            the new user ID
	 */
	public void setUserID(Utilisateur userID) {
		this.userID = userID;
	}

	@Override
	public String toString() {
		return "Joueur [playerID=" + playerID + ", country=" + country + ", game=" + game + ", prizeList=" + prizeList
				+ ", salary=" + salary + ", userID=" + userID + "]";
	}
	
	

}
