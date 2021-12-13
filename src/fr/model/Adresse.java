package fr.model;

public class Adresse {
	
	private String codePostal;
	private String ville;
	
	public Adresse() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param codePostal
	 * @param ville
	 */
	public Adresse(String codePostal, String ville) {
		super();
		this.codePostal = codePostal;
		this.ville = ville;
	}

	/**
	 * @return the codePostal
	 */
	public String getCodePostal() {
		return codePostal;
	}

	/**
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Adresse [codePostal=" + codePostal + ", ville=" + ville + "]";
	}
	
	
	
	
	

}
