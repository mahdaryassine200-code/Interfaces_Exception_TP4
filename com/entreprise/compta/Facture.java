package com.entreprise.compta;

public class Facture implements Payable {

    private String reference;
    private String fournisseur;
    private double montant;

    public Facture(String reference, String fournisseur, double montant) {
        this.reference = reference;
        this.fournisseur = fournisseur;
        this.montant = montant;
    }

    @Override
    public double getMontantAPayer() {
        return montant;
    }

    @Override
    public String toString() {
        return "Facture " + reference + " (" + fournisseur + ") : " + montant;
    }
}
