/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blackjack;

/**
 *
 * @author ilyass
 */
public class Croupier extends Personne {
    public Croupier(String username) {
        super(username);
    }

    public void distribuerCartes(PaquetCartes paquet, Joueur joueur) {
        // Distribuer deux cartes au joueur
        joueur.tirerCartes(paquet);
        joueur.tirerCartes(paquet);

        // Distribuer deux cartes au croupier
        this.tirerCartes(paquet);
        this.tirerCartes(paquet);
    }

    @Override
    public void voirCartes() {
        System.out.println("--------------------");
        System.out.println("Main du croupier :");
        System.out.println("--------------------");
        System.out.println(mainJoueur.get(0)); // Afficher la première carte

        // Cacher les autres cartes
        for (int i = 1; i < mainJoueur.size(); i++) {
            System.out.println("[Carte cachée]");
        }
    }
}
