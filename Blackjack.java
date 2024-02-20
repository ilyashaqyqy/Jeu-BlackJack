/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.blackjack;

import java.util.Scanner;

/**
 *
 * @author ilyass
 */
public class Blackjack {

    public static void main(String[] args) {

        PaquetCartes paquet = new PaquetCartes();
        paquet.creatPaquetCartes();
        // System.out.println(paquet);
        //
        paquet.melangerCartes();
        // System.out.println(paquet);
        Scanner scanner = new Scanner(System.in);
        // PaquetCartes paquet = new PaquetCartes();
        Joueur joueur = new Joueur("joueur");
        Croupier croupier = new Croupier("Croupier");

        System.out.println("Appuyez sur 's' pour commencer :");
        char input = scanner.next().charAt(0);

        if (input == 's' || input == 'S') {
            System.out.println("Placez votre mise (depuis 100$) :");
            int mise = scanner.nextInt();
            joueur.placerMise(mise);

            croupier.distribuerCartes(paquet, joueur);

            joueur.voirCartes();
            croupier.voirCartes();

            // Choix du joueur entre Hit et Stand
            while (true) {
                System.out.println("Choisissez une action :");
                System.out.println("1. Hit");
                System.out.println("2. Stand");
                int choix = scanner.nextInt();

                if (choix == 1) {
                    joueur.recevoirCartes(paquet);
                    joueur.voirCartes();
                } else if (choix == 2) {
                    joueur.rester();
                    break;
                } else {
                    System.out.println("Choix invalide.");
                }
            }

        } else {
            System.out.println("Au revoir");
        }

        scanner.close();
    }

}
