package com.example.model.tableperclass;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank private String nom;
    @NotNull @Positive private Double prix;

    public Produit() {}
    public Produit(String nom, Double prix) { this.nom = nom; this.prix = prix; }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public Double getPrix() { return prix; }
    public void setPrix(Double prix) { this.prix = prix; }

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", nom='" + nom + '\'' + ", prix=" + prix + '}';
    }
}
