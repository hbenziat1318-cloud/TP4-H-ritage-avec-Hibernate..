package com.example.model.tableperclass;

import javax.persistence.*;

@Entity
public class Electronique extends Produit {

    private String marque;

    public Electronique() {}
    public Electronique(String nom, Double prix, String marque) {
        super(nom, prix);
        this.marque = marque;
    }

    public String getMarque() { return marque; }
    public void setMarque(String marque) { this.marque = marque; }

    @Override
    public String toString() {
        return "Electronique{" + "id=" + getId() + ", nom='" + getNom() + '\'' +
                ", prix=" + getPrix() + ", marque='" + marque + '\'' + '}';
    }
}
