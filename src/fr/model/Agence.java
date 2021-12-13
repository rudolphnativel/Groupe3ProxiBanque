/**
 * 
 */
package fr.model;

import java.sql.Date;

/**
 * @author Rudolph Nativel
 *
 */
public class Agence {
	
	private String numero;
	private Date dateCreation;
	private Gerant gerant;
	
	/**
	 * Empty constructor
	 */
	public Agence() {
	}

	/**
	 * @param numero
	 * @param dateCreation
	 * @param gerant
	 */
	public Agence(String numero, Date dateCreation, Gerant gerant) {
		super();
		this.numero = numero;
		this.dateCreation = dateCreation;
		this.gerant = gerant;
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	/**
	 * @return the gerant
	 */
	public Gerant getGerant() {
		return gerant;
	}

	/**
	 * @param gerant the gerant to set
	 */
	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}

	@Override
	public String toString() {
		return "Agence [numero=" + numero + ", dateCreation=" + dateCreation + ", gerant=" + gerant + "]";
	}

	
}
