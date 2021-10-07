/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessmynumber_richard_roux;

import java.util.Random;
import java.util.Scanner;

/**
 * 04/10/2021 TP1 - SYNTAXE DE BASE
 *
 * EXO 3 - GUESS MY NUMBER
 *
 * @author richa
 */
public class GuessMyNumber_RICHARD_ROUX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        int i = 1;
        do {
            int n = generateurAleat.nextInt(100);
            System.out.println(n);
            i++;
        } while (i <= 5);
        /* Voici une boucle while qui génère 5 entiers aléatoires entre 0 et 100
         */
        int u;
        int nv;
        System.out.println("Bonjour, veuillez choisir le niveau de jeu : Vous avez le choix entre 'facile', 'normal', 'difficile'");
        System.out.println("Tapez 1 pour facile, 2 pour normal, 3 pour difficile");
        Scanner sc = new Scanner(System.in);
        nv = sc.nextInt();
        if (nv<=1){
            System.out.println("Bonjour, veuillez ecrire un entier entre 0 et 70");
            int p = generateurAleat.nextInt(70);
            u = sc.nextInt();
            /* on a un nombre alea p et on demande à l'ut d'en donner un u
             */
            int compteur = 0;
            /*
        initialisation du compteur
             */
            do {
                if (u > p) {
                    System.out.println("Trop grand!");
                    System.out.println("Essais encore");
                    u = sc.nextInt();
                    compteur++;
                }
                if (u < p) {
                    System.out.println("Trop petit!");
                    System.out.println("Essais encore");
                    u = sc.nextInt();
                    compteur++;

                }

            } while (u != p);

            System.out.println("Vous avez reussi! bravo");
            /* c'est bon, on peut jouer à deviner le chiffre alea de l'ordi!!
        la boucle while permet de prendre tout les cas de figures exepté si l'utilisateurs rentre un double ou float
             */
            System.out.println(compteur);
            if (compteur > 10) {
               System.out.println("Vous n'êtes pas très vif mon brave. Vous avez perdu");
            }
        }
        if (nv>=3){
            System.out.println("Bonjour, veuillez ecrire un entier entre 0 et 200");
            int p = generateurAleat.nextInt(200);
            u = sc.nextInt();
            int compteur = 0;
            
            do {
                if (u > p) {
                    System.out.println("Trop grand!");
                    System.out.println("Essais encore");
                    u = sc.nextInt();
                    compteur++;
                }
                if (u < p) {
                    System.out.println("Trop petit!");
                    System.out.println("Essais encore");
                    u = sc.nextInt();
                    compteur++;

                }

            } while (u != p);

            System.out.println("Vous avez reussi! bravo");
            
            System.out.println(compteur);
            if (compteur > 6) {
               System.out.println("Vous n'êtes pas très vif mon brave. Vous avez perdu");
            }
            else{ 
                System.out.println("Bonjour, veuillez ecrire un entier entre 0 et 150");
                int m = generateurAleat.nextInt(150);
                u = sc.nextInt();
            
               do {
                if (u > m) {
                    System.out.println("Trop grand!");
                    System.out.println("Essais encore");
                    u = sc.nextInt();
                    compteur++;
                }
                if (u < m) {
                    System.out.println("Trop petit!");
                    System.out.println("Essais encore");
                    u = sc.nextInt();
                    compteur++;

                }

            } while (u != m);

            System.out.println("Vous avez reussi! bravo");
            
            System.out.println(compteur);
            if (compteur > 8) {
               System.out.println("Vous n'êtes pas très vif mon brave. Vous avez perdu");}
                
            }
          
            
            
        }
    }
}


