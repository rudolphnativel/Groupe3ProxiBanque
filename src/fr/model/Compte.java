
package fr.model;

import java.sql.Date;

public class Compte {

    private int numero;
    private double solde;
    private Date dateCreation;
    private Carte carte;
    
    public Compte() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param numero
     * @param solde
     * @param dateCreation
     * @param carte
     */
    public Compte(int numero, double solde, Date dateCreation, Carte carte) {
        super();
        this.numero = numero;
        this.solde = solde;
        this.dateCreation = dateCreation;
        this.carte = carte;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the solde
     */
    public double getSolde() {
        return solde;
    }

    /**
     * @param solde the solde to set
     */
    public void setSolde(double solde) {
        this.solde = solde;
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
     * @return the carte
     */
    public Carte getCarte() {
        return carte;
    }

    /**
     * @param carte the carte to set
     */
    public void setCarte(Carte carte) {
        this.carte = carte;
    }

    @Override
    public String toString() {
        return "Compte [numero=" + numero + ", solde=" + solde + ", dateCreation=" + dateCreation + ", carte=" + carte
                + "]";
    }
    
    
    
}