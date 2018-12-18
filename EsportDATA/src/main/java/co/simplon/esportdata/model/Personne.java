package co.simplon.esportdata.model;

import javax.persistence.Basic;
import javax.persistence.Column;

import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



// TODO: Auto-generated Javadoc
/**
 * The Class Personne.
 */
@MappedSuperclass
public abstract class Personne {

	
	/** The pseudo. */
	@Column
	protected String pseudo;
	
	/** The first name. */
	@Column
	private String firstName;
	
	/** The last name. */
	@Column
	private String lastName;
	
	/** The address. */
	@Column
	private String address;
	
	/** The phone. */
	@Column
	private String phone;
	
	/** The birth date. */
	@Basic
	@Temporal(TemporalType.DATE)
	@Column
	private java.util.Date birthDate;

	

	/**
	 * Gets the pseudo.
	 *
	 * @return the pseudo
	 */
	public String getPseudo() {
		return pseudo;
	}

	/**
	 * Sets the pseudo.
	 *
	 * @param pseudo the new pseudo
	 */
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstname the new first name
	 */
	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Gets the phone.
	 *
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Sets the phone.
	 *
	 * @param phone the new phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Gets the birth date.
	 *
	 * @return the birth date
	 */
	public java.util.Date getBirthDate() {
		return birthDate;
	}

	/**
	 * Sets the birth date.
	 *
	 * @param birthDate the new birth date
	 */
	public void setBirthDate(java.util.Date birthDate) {
		this.birthDate = birthDate;
	}

}
