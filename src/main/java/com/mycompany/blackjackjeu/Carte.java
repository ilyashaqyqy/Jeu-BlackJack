/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blackjackjeu;

/**
 *
 * @author user
 */
public class Carte implements CarteInterface {
    private  Types types ;
    private Valeur valeur ;
    public Carte(Valeur valeur, Types types) {
        this.types = types;
        this.valeur = valeur;

    }
    
    @Override
    public String toString ()
    {
        return this.valeur.toString() + "-" + this.types.toString();
    }
    
    public Valeur  getVleur ()
    {
        return this.valeur ;
    }
}
