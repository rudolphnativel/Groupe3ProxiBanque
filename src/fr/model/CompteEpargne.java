package fr.model;

public class CompteEpargne extends Compte{
	private double taux;

	public CompteEpargne() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param taux
	 */
	public CompteEpargne(double taux) {
		super();
		this.taux = taux;
	}

	/**
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}

	/**
	 * @param taux the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

	@Override
	public String toString() {
		return "CompteEpargne [taux=" + taux + "]";
	}
	
	
}
