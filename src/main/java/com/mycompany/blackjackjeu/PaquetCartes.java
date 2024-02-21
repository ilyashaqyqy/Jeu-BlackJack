/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blackjackjeu;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author user
 */
public class PaquetCartes {
    ArrayList<Carte> listeCarte;

    public PaquetCartes() {
        this.listeCarte = new ArrayList<Carte>();
    }

    public void creatPaquetCartes() {
        for (Types cartetypes : Types.values()) {
            for (Valeur cartevaleur : Valeur.values()) {

                this.listeCarte.add(new Carte(cartevaleur, cartetypes));

            }
        }

    }

    public void melangerCartes() {
        Collections.shuffle(this.listeCarte);
    }

    @Override
    public String toString() {
        String listeCarteoutput = "";

        for (Carte carte : this.listeCarte) {
            listeCarteoutput += "\n" + carte.toString();

        }
        return listeCarteoutput;

    }
}