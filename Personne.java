/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blackjack;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ilyass
 */
public class Personne {
    protected String username;
    protected ArrayList<Carte> mainJoueur;

    public Personne(String username) {
        this.username = username;
        this.mainJoueur = new ArrayList<>();
    }

    public void tirerCartes(PaquetCartes paquet) {

        Random rand = new Random();
        int index = rand.nextInt(paquet.listeCarte.size());
        Carte carteTiree = paquet.listeCarte.remove(index);
        this.mainJoueur.add(carteTiree);
    }

    public void voirCartes() {
        System.out.println("--------------------");
        System.out.println("Main de " + this.username + ":");
        System.out.println("--------------------");
        for (Carte carte : mainJoueur) {
            System.out.println(carte);
        }
    }
}
