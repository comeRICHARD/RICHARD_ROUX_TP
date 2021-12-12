/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloqué;

import java.util.Random;

/**
 *
 * @author utilisateur
 */
public class Grille {

    int[] tabcarte = {1, 2, 3};
    Integer[][] grille = new Integer[4][4];

    public Grille() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                grille[i][j] = null;

            }
        }
    }

    public boolean etreremplie() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (grille[i][j] != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean colonnepleine(int numcolonne) {
        for (int i = 0; i < 4; i++) {
            if (grille[i][numcolonne] != null) {
                return false;

            }
        }
        return true;
    }

    public boolean lignepleine(int numligne) {
        for (int j = 0; j < 4; j++) {
            if (grille[numligne][j] != null) {
                return false;
            }
        }
        return true;
    }

    public boolean ajoutercartedanscolonne(int numligne, int numcolonne) {
        Random t = new Random();
        int tirage = t.nextInt(3);
        int numeroCarte = tabcarte[tirage];
        if (grille[numligne][numcolonne] == null) {
            grille[numligne][numcolonne] = numeroCarte;
            return true;
        }
        return false;

    }

    public void afficherlagrillesurconsole() {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (grille[i][j] != null) {
                    System.out.print(" " + grille[i][j] + " ");
                } else {
                    System.out.print(" _ ");
                }
            }
            System.out.println();

        }

    }

    public void additionnercartes(String direction) {
        //Dans le cas ou le man il swap vers le haut t'as capté
        // eh oue mon frr jai capté
        if (direction == "H") {

            for (int j = 0; j < 4; j++) {
                int i = 0;
                while (i <= 2 && grille[i][j] != null && grille[i + 1][j] != null) {
                    //On traite le cas ou on a des 2 et des 1
                    if ((grille[i][j] == 1 || grille[i][j] == 2) && (grille[i + 1][j] == 1 || grille[i + 1][j] == 2)) {
                        if (grille[i][j] == 1 && grille[i + 1][j] == 2 || grille[i][j] == 2 && grille[i + 1][j] == 1) {
                            grille[i][j] = 3;
                            grille[i + 1][j] = null;
                        }
                    } else {

                        //On traite les autres cas                           
                        if (grille[i][j] == grille[i + 1][j]) {
                            grille[i][j] = 2 * grille[i][j];
                            grille[i + 1][j] = null;

                        }
                    }
                    i++;

                }

            }

        }
        //La le frro il swappe en bas la
        if (direction == "B") {

            for (int j = 0; j < 4; j++) {
                int i = 3;
                while (i >= 1 && grille[i][j] != null && grille[i - 1][j] != null) {
                    //On traite le cas ou on a des 2 et des 1
                    if ((grille[i][j] == 1 || grille[i][i] == 2) && (grille[i - 1][j] == 1 || grille[i - 1][j] == 2)) {
                        if (grille[i][j] == 1 && grille[i - 1][j] == 2 || grille[i][j] == 2 && grille[i - 1][j] == 1) {
                            grille[i][j] = 3;
                            grille[i - 1][j] = null;
                        }
                    } else {

                        //On traite les autres cas                           
                        if (grille[i][j] == grille[i - 1][j]) {
                            grille[i][j] = 2 * grille[i][j];
                            grille[i - 1][j] = null;

                        }
                    }
                    i--;

                }

            }
        }

        //On swappe a droite
        if (direction == "D") {

            for (int i = 0; i < 4; i++) {
                int j = 3;
                while (j >= 1 && grille[i][j] != null && grille[i][j - 1] != null) {
                    //On traite le cas ou on a des 2 et des 1
                    if ((grille[i][j] == 1 || grille[i][j] == 2) && (grille[i][j - 1] == 1 || grille[i][j - 1] == 2)) {
                        if (grille[i][j] == 1 && grille[i][j - 1] == 2 || grille[i][j] == 2 && grille[i][j - 1] == 1) {
                            grille[i][j] = 3;
                            grille[i][j] = null;
                        }
                    } else {

                        //On traite les autres cas                           
                        if (grille[i][j] == grille[i][j - 1]) {
                            grille[i][j] = 2 * grille[i][j];
                            grille[i][j - 1] = null;

                        }
                    }
                    j--;

                }

            }

        }
        //On vote pas a gauche

        for (int i = 0; i < 4; i++) {
            int j = 0;
            while (j <= 2 && grille[i][j] != null && grille[i][j + 1] != null) {
                //On traite le cas ou on a des 2 et des 1
                if ((grille[i][j] == 1 || grille[i][j] == 2) && (grille[i][j] == 1 || grille[i][j + 1] == 2)) {
                    if (grille[i][j] == 1 && grille[i][j + 1] == 2 || grille[i][j] == 2 && grille[i][j + 1] == 1) {
                        grille[i][j] = 3;
                        grille[i][j + 1] = null;
                    }
                } else {

                    //On traite les autres cas                           
                    if (grille[i][j] == grille[i][j + 1]) {
                        grille[i][j] = 2 * grille[i][j];
                        grille[i][j + 1] = null;

                    }
                }
                j++;

            }

        }

    }

    public int aditionnergrille() {
        int score = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (grille[i][j] != 1 && grille[i][j] != 2) {
                    score += grille[i][j];
                }
            }
        }
        return score;
    }

    public boolean etreperdant() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((grille[i][j] != grille[i + 1][j] || grille[i][j] != grille[i][j + 1])) {
                    return true;
                }
            }
        }
        return false;

    }

    public void TasserGrille(String direction) {
        // Dans cette methode, je fais cas par cas suivant la direction choisie le tassement des lignes ou colonnes
        // Ici je fais pour un swipe vers le haut, et commence en haut de la grille pour verif si ya une case null
        if (direction == "H") {
            for (int i = 0; i < 4; i++) {
                int j = 0;
                while (j <= 2) {
                    if (grille[j][i] == null) {
                        grille[j][i] = grille[j + 1][i];
                        grille[j + 1][i] = null;
                    }
                    j++;

                }
            }
        }
        // Ici vers le bas en commencant donc d'en bas de la grille
        if (direction == "B") {
            for (int i = 0; i < 4; i++) {
                int j = 3;
                while (j >= 1) {
                    if (grille[j][i] == null) {
                        grille[j][i] = grille[j - 1][i];
                        grille[j - 1][i] = null;
                    }
                    j--;

                }
            }
        }
        if (direction == "G") {
            for (int i = 0; i < 4; i++) {
                int j = 0;
                while (j <= 2) {
                    if (grille[i][j] == null) {
                        grille[i][j] = grille[i][j + 1];
                        grille[i][j + 1] = null;
                    }
                    j++;

                }
            }
        }
        if (direction == "D") {
            for (int i = 0; i < 4; i++) {
                int j = 3;
                while (j >= 1) {
                    if (grille[i][j] == null) {
                        grille[i][j] = grille[i][j - 1];
                        grille[i][j - 1] = null;
                    }
                    j--;

                }
            }
        }

    }
}
    