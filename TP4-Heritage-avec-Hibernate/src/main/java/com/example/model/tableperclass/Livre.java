package com.example.model.tableperclass;

import javax.persistence.*;

@Entity
public class Livre extends Produit {

    private String auteur;

    public Livre() {}
    public Livre(String nom, Double prix, String auteur) {
        super(nom, prix);
        this.auteur = auteur;
    }

    public String getAuteur() { return auteur; }
    public void setAuteur(String auteur) { this.auteur = auteur; }

    @Override
    public String toString() {
        return "Livre{" + "id=" + getId() + ", nom='" + getNom() + '\'' +
                ", prix=" + getPrix() + ", auteur='" + auteur + '\'' + '}';
    }
}
