/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloqué;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author richa
 */
public class Partie {

    Grille grilleJeu = new Grille();

    public void InitialiserPartie() {
        /*
        int ColonneAleat [] = new int [4];
        int LigneAleat [] = new int [4];
        Random r = new Random();
        for (int i=0 ; i<=3 ; i++){
            ColonneAleat[i]=i+1;  
        } 
        for (int i=0 ; i<=3 ; i++){
            LigneAleat[i]=i+1;  
        }
        // Ajoute dans le tablo les chiffre de 1 à 4//
        
        for (int i=0 ; i<2 ; i++){
         
        
        // Choisi aleatoirement la ligne et colonne //
        
        int nc = ColonneAleat[r.nextInt(4)];
        int nl = LigneAleat[r.nextInt(4)];
        // nc num colonne et nl num ligne//
        
        int ChiffreAleat[] = new int[2];
        ChiffreAleat[0]=1;
        ChiffreAleat[1]=2;
        // Choisi entre 1 et 2 pour les deux premiere cases//
        
        int chiffreDonne = ChiffreAleat[r.nextInt(2)];
        
        grilleJeu[nl][nc]=chiffreDonne;
        // Ajoute dans la grille un 1 ou 2 dans clnn et ligne tirée//
         */
        for (int i = 0; i < 3; i++) {
            Random tirage = new Random();

            int ligne = tirage.nextInt(4);
            int colonne = tirage.nextInt(4);
            grilleJeu.ajoutercartedansgrille(ligne, colonne);

        }

    }

    public void DebuterPartie() {
        System.out.println("Bonjour à toi génie des maths, à toi de jouer");
        System.out.println("Le but du jeu est de garder une grille avec des espaces vides en additionant les cartes présentant le meme chiffre");
        System.out.println("Les 2 ne s'addittionnent qu'avec des 1 et inversement");
        System.out.println("A chaque tour vous choisirez une direction dans laquelle vont se déplacer les cartes de la grille");
        System.out.println("8 pour haut \n 2 pour bas \n 6 pour droite \n 4 pour gauche");
        InitialiserPartie();
        //Déclaration des variables
        int choixdirection;
        Scanner reponse = new Scanner(System.in);
        Random tirage = new Random();
        int ligne;
        int colonne;
        String direction;

        while (!grilleJeu.additionimpossible() || !grilleJeu.etreremplie()) {

            grilleJeu.afficherlagrillesurconsole();
            System.out.println("Choisissez une direction");
            choixdirection = reponse.nextInt();

            do {//On reste dans cette boucle tant que l'utilisateur n'a pas rentré une direction valable
                if (choixdirection != 8 && choixdirection != 2 && choixdirection != 4 && choixdirection != 6) {
                    System.out.println("Veuillez choisir parmit les directions proposées");
                    System.out.println("8 pour haut \n 2 pour bas \n 6 pour droite \n 4 pour gauche");
                    choixdirection = reponse.nextInt();
                }

            } while (choixdirection != 8 && choixdirection != 2 && choixdirection != 4 && choixdirection != 6);
            //Le choix des numéros (8,2,6,4) forment une fleche de direction sur le pavé numérique
            if (choixdirection == 8) {//On convertit l'entrée de l'utilisateur en string pour faire appelle à nos méthodes
                direction = "H";
            } else if (choixdirection == 2) {
                direction = "B";

            } else if (choixdirection == 4) {
                direction = "G";
            } else {
                direction = "D";
            }

            grilleJeu.additionnercartes(direction);
            grilleJeu.TasserGrille(direction);

            //On ajoute une carte sur la grille en fonction du sens ou se depalce l'utilisateur
            if (direction == "H") {
                int cmpt = 0;
                while (cmpt == 0) {
                    ligne = 3;
                    colonne = tirage.nextInt(4);
                    if (grilleJeu.ajoutercartedansgrille(ligne, colonne)) {//On verifie qu'il y a bien un espace libre sur la case ou l'on souhaite ajouter une carte
                        cmpt += 1;

                    }
                }

            } else if (direction == "B") {
                int cmpt = 0;
                while (cmpt == 0) {
                    ligne = 0;
                    colonne = tirage.nextInt(4);
                    if (grilleJeu.ajoutercartedansgrille(ligne, colonne)) {
                        cmpt += 1;

                    }

                }

            } else if (direction == "D") {
                int cmpt = 0;
                while (cmpt == 0) {

                    ligne = tirage.nextInt(4);
                    colonne = 0;
                    if (grilleJeu.ajoutercartedansgrille(ligne, colonne)) {
                        cmpt += 1;
                    }
                }

            } else if (direction == "G") {
                int cmpt = 0;
                while (cmpt == 0) {

                    ligne = tirage.nextInt(4);;
                    colonne = 3;
                    if (grilleJeu.ajoutercartedansgrille(ligne, colonne)) {
                        cmpt += 1;
                    }

                }

            }
        }

        //Dans les cas ou l'on quitte la boucle de jeu, c'est que le joueur a perdu, on affiche donc la grille en affichant le score du joueur
        if (grilleJeu.additionimpossible() && grilleJeu.etreremplie()) {
            int score = 0;
            grilleJeu.afficherlagrillesurconsole();
            System.out.println("Vous etes bloqué, vous avez perdu");
            score = grilleJeu.calculscore();
            System.out.println("Votre score est de " + score + " points");
        }
    }
}
