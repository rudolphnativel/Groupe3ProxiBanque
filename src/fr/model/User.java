package fr.model;

public class User {

	private int idUser;
	private String nom;
	private String prenom;
	private Adresse adresse;
	private String telephone;
	private String login;
	private String password;

	/**
	 * Empty constructor
	 */
	public User() {
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
	public User( String nom, String prenom, Adresse adresse, String telephone, String login,
			String password) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.login = login;
		this.password = password;
		}
	

	
	/**
	 * @param idUser
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param telephone
	 * @param login
	 * @param password
	 */
	public User(int idUser, String nom, String prenom, Adresse adresse, String telephone, String login,
			String password) {
		super();
		this.idUser = idUser;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.login = login;
		this.password = password;
	}


	/**
	 * 
	 * @param int       idUser
	 * @param String    nom
	 * @param String 	prenom
	 * @param Adresse	adresse
	 * @param String	telephone
	 */
	public User(int idUser, String nom, String prenom, Adresse adresse, String telephone) {
		super();
		this.idUser = idUser;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}


	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse
				+ ", telephone=" + telephone + ", login=" + login + ", password=" + password + "]";
	}
	

}
