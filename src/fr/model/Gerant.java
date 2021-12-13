/**
 * 
 */
package fr.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rudolph Nativel
 *
 */
public class Gerant extends Conseiller {

	// Attributes
	List<Conseiller> conseillers = new ArrayList<>();

	/**
	 * Empty constructor
	 */
	public Gerant() {
	}

	/**
	 * @param conseillers
	 */
	public Gerant(List<Conseiller> conseillers) {
		super();
		this.conseillers = conseillers;
	}

	/**
	 * 
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param telephone
	 * @param login
	 * @param password
	 */
	public Gerant(String nom, String prenom, Adresse adresse, String telephone, String login, String password) {
		super(nom, prenom, adresse, telephone, login, password);
	}

	/**
	 * 
	 * @param idUser
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param telephone
	 * @param login
	 * @param password
	 */
	public Gerant(int idUser, String nom, String prenom, Adresse adresse, String telephone, String login,
			String password) {
		super(idUser, nom, prenom, adresse, telephone, login, password);
	}

	/**
	 * 
	 * @param idUser
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param telephone
	 * @param conseiller
	 * @param login
	 * @param password
	 */
	public Gerant(int idUser, String nom, String prenom, Adresse adresse, String telephone, List<Conseiller> conseiller,
			String login, String password) {
		super(idUser, nom, prenom, adresse, telephone, login, password);
		this.conseillers = conseillers;
	}

	/**
	 * @return the conseillers
	 */
	public List<Conseiller> getConseillers() {
		return conseillers;
	}

	/**
	 * @param conseillers the conseillers to set
	 */
	public void setConseillers(List<Conseiller> conseillers) {
		this.conseillers = conseillers;
	}

	@Override
	public String toString() {
		return "Gerant [conseillers=" + conseillers + " "+super.toString()+"]";
	}

	
}
