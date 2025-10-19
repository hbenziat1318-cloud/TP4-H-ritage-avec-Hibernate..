package com.example.model.singletable;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Entity
@Table(name = "vehicules")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_vehicule", discriminatorType = DiscriminatorType.STRING)
public abstract class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank private String marque;
    @NotBlank private String modele;
    @NotNull @PastOrPresent private LocalDate anneeFabrication;
    @NotNull @Positive private Double prix;

    public Vehicule() {}
    public Vehicule(String marque, String modele, LocalDate anneeFabrication, Double prix) {
        this.marque = marque; this.modele = modele;
        this.anneeFabrication = anneeFabrication; this.prix = prix;
    }

    // Getters et setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getMarque() { return marque; }
    public void setMarque(String marque) { this.marque = marque; }
    public String getModele() { return modele; }
    public void setModele(String modele) { this.modele = modele; }
    public LocalDate getAnneeFabrication() { return anneeFabrication; }
    public void setAnneeFabrication(LocalDate anneeFabrication) { this.anneeFabrication = anneeFabrication; }
    public Double getPrix() { return prix; }
    public void setPrix(Double prix) { this.prix = prix; }

    @Override
    public String toString() {
        return "Vehicule{" + "id=" + id + ", marque='" + marque + '\'' +
                ", modele='" + modele + '\'' + ", anneeFabrication=" + anneeFabrication +
                ", prix=" + prix + '}';
    }
}
