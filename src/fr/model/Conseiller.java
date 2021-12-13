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
public class Conseiller extends User{

	private Gerant gerant;
	private List<Client> clients = new ArrayList<>();
	
	/**
	 * Empty constructor
	 */
	public Conseiller() {
	}
	
	

	/**
	 * @param gerant
	 * @param clients
	 */
	public Conseiller(Gerant gerant, List<Client> clients) {
		super();
		this.gerant = gerant;
		this.clients = clients;
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
	public Conseiller(int idUser, String nom, String prenom, Adresse adresse, String telephone, String login,
			String password) {
		super(idUser, nom, prenom, adresse, telephone,login,password);
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
	public Conseiller( String nom, String prenom, Adresse adresse, String telephone, String login,
			String password) {
		super( nom, prenom, adresse, telephone,login,password);
	}
	/**
	 * 
	 * @param idUser
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param telephone
	 * @param gerant
	 * @param clients
	 * @param login
	 * @param password
	 */
	public Conseiller(int idUser, String nom, String prenom, Adresse adresse, String telephone,Gerant gerant, List<Client> clients, String login,
			String password) {
		super(idUser, nom, prenom, adresse, telephone,login,password);
		this.gerant = gerant;
		this.clients = clients;
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

	/**
	 * @return the clients
	 */
	public List<Client> getClients() {
		return clients;
	}

	/**
	 * @param clients the clients to set
	 */
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}



	@Override
	public String toString() {
		return "Conseiller [gerant=" + gerant + ", clients=" + clients + " "+super.toString()+"]";
	}


	
	
	
}
