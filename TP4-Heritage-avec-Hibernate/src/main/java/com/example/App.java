package com.example;

import com.example.model.singletable.*;
import com.example.model.joined.*;
import com.example.model.tableperclass.*;
import javax.persistence.*;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-inheritance");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        // --- SINGLE_TABLE ---
        Voiture v = new Voiture("Toyota", "Corolla", LocalDate.of(2020,1,1), 20000.0, 4, true, "Essence");
        Moto m = new Moto("Yamaha", "MT07", LocalDate.of(2021,5,1), 7000.0, 689, "Manuelle");
        em.persist(v); em.persist(m);

        // --- JOINED ---
        Developpeur d = new Developpeur("Ali", "Ben", 5000.0, "Java");
        Manager mg = new Manager("Sara", "Lahcen", 8000.0, 5);
        em.persist(d); em.persist(mg);

        // --- TABLE_PER_CLASS ---
        Livre livre = new Livre("Java Avancé", 50.0, "Hana H.");
        Electronique elec = new Electronique("Laptop", 1200.0, "Dell");
        em.persist(livre); em.persist(elec);

        em.getTransaction().commit();

        // --- Affichage ---
        System.out.println("--- SINGLE_TABLE ---");
        em.createQuery("SELECT v FROM Vehicule v", Vehicule.class)
                .getResultList().forEach(System.out::println);

        System.out.println("--- JOINED ---");
        em.createQuery("SELECT e FROM Employe e", Employe.class)
                .getResultList().forEach(System.out::println);

        System.out.println("--- TABLE_PER_CLASS ---");
        em.createQuery("SELECT p FROM Produit p", Produit.class)
                .getResultList().forEach(System.out::println);

        em.close();
        emf.close();
    }
}
