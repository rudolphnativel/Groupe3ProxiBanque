/**
 * 
 */
package fr.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Rudolph Nativel
 *
 */
public class Client extends User {

	private Map<String, Compte> comptes = new HashMap<>();

	/**
	 * 
	 */
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idUser
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param telephone
	 */
	public Client(int idUser, String nom, String prenom, Adresse adresse, String telephone, String login,
			String password) {
		super(idUser, nom, prenom, adresse, telephone,login,password);
		// TODO Auto-generated constructor stub
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
	public Client( String nom, String prenom, Adresse adresse, String telephone, String login,
			String password) {
		super( nom, prenom, adresse, telephone,login,password);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param idUser
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param telephone
	 * @param comptes
	 * @param login
	 * @param password
	 */
	public Client(int idUser, String nom, String prenom, Adresse adresse, String telephone,Map<String, Compte> comptes, String login,
			String password) {
		super(idUser, nom, prenom, adresse, telephone,login,password);
		this.comptes = comptes;
	}

	/**
	 * @return the comptes
	 */
	public Map<String, Compte> getComptes() {
		return comptes;
	}

	/**
	 * @param comptes the comptes to set
	 */
	public void setComptes(Map<String, Compte> comptes) {
		this.comptes = comptes;
	}

	@Override
	public String toString() {
		return "Client [comptes=" + comptes + " "+super.toString()+"]";
	}

	
	
	
}
