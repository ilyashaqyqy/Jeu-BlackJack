/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blackjack;

/**
 *
 * @author ilyass
 */




public class Joueur extends Personne {
    private int solde;
    private int mise;

    public Joueur(String username) {
        super(username);
        this.solde = 100;
    }

    public void placerMise(int mise) {
        if (mise > solde) {
            System.out.println("Solde insuffisant pour placer cette mise.");
            return;
        }
        this.mise = mise;
        this.solde -= mise;
        System.out.println(username + " a placé une mise de " + mise + ".");
    }
    
        public void recevoirCartes(PaquetCartes paquet) {
        tirerCartes(paquet);
    }
        
        public void rester() {
        System.out.println(this.username + " décide de rester.");
    }
}




        
        
