package com.example.model.joined;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "developpeurs")
public class Developpeur extends Employe {

    private String langagePrincipal;

    public Developpeur() {}
    public Developpeur(String nom, String prenom, Double salaire, String langagePrincipal) {
        super(nom, prenom, salaire);
        this.langagePrincipal = langagePrincipal;
    }

    public String getLangagePrincipal() { return langagePrincipal; }
    public void setLangagePrincipal(String langagePrincipal) { this.langagePrincipal = langagePrincipal; }

    @Override
    public String toString() {
        return "Developpeur{" + "id=" + getId() + ", nom='" + getNom() + '\'' +
                ", prenom='" + getPrenom() + '\'' + ", salaire=" + getSalaire() +
                ", langagePrincipal='" + langagePrincipal + '\'' + '}';
    }
}
