package com.example.model.joined;

import javax.persistence.*;

@Entity
@Table(name = "managers")
public class Manager extends Employe {

    private Integer nombreEquipe;

    public Manager() {}
    public Manager(String nom, String prenom, Double salaire, Integer nombreEquipe) {
        super(nom, prenom, salaire);
        this.nombreEquipe = nombreEquipe;
    }

    public Integer getNombreEquipe() { return nombreEquipe; }
    public void setNombreEquipe(Integer nombreEquipe) { this.nombreEquipe = nombreEquipe; }

    @Override
    public String toString() {
        return "Manager{" + "id=" + getId() + ", nom='" + getNom() + '\'' +
                ", prenom='" + getPrenom() + '\'' + ", salaire=" + getSalaire() +
                ", nombreEquipe=" + nombreEquipe + '}';
    }
}
