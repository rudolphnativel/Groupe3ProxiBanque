package fr.model;

import java.sql.Date;

public class CompteCourant extends Compte {
	
	private double decouvertAutorise;
	
	public CompteCourant() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param decouvert_autorise
	 */
	public CompteCourant(double decouvert_autorise) {
		super();
		this.decouvertAutorise = decouvert_autorise;
	}
	
	
	/**
	 * @param numero
	 * @param solde
	 * @param dateCreation
	 * @param carte
	 */
	public CompteCourant(int numero, double solde, Date dateCreation, Carte carte) {
		super(numero, solde, dateCreation, carte);
	}
	
	/**
	 * @param numero
	 * @param solde
	 * @param dateCreation
	 * @param carte
	 */
	public CompteCourant(int numero, double solde, Date dateCreation, Carte carte,double decouvertAutorise) {
		super(numero, solde, dateCreation, carte);
		this.decouvertAutorise = decouvertAutorise;
	}

	/**
	 * @return the decouvert_autorise
	 */
	public double getDecouvert_autorise() {
		return decouvertAutorise;
	}

	/**
	 * @param decouvert_autorise the decouvert_autorise to set
	 */
	public void setDecouvert_autorise(double decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}

	@Override
	public String toString() {
		return "CompteCourant [decouvert_autorise=" + decouvertAutorise + ", getNumero()=" + getNumero()
				+ ", getSolde()=" + getSolde() + ", getDateCreation()=" + getDateCreation() + ", getCarte()="
				+ getCarte() + "]";
	}
	
	

}
