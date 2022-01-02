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
//On commence par créer une grille d'integer, ainsi qu'un tableau contenant les cartes à ajouter sur la grille au fur et à mesure

    int[] tabcarte = {1, 2, 3};
    Integer[][] grille = new Integer[4][4];
//On commence par remplire la grille qui est remplit de null au début de la partie

    public Grille() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                grille[i][j] = null;

            }
        }
    }
//Cette méthode nous permet de vérifier qu'il n'y a plus aucune case null dans notre grille

    public boolean etreremplie() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (grille[i][j] == null) {
                    return false;
                }
            }
        }
        return true;
    }

    //Cette méthode nous permet de savoir si une colonne est pleine 
    public boolean colonnepleine(int numcolonne) {
        for (int i = 0; i < 4; i++) {
            if (grille[i][numcolonne] == null) {
                return false;

            }
        }
        return true;
    }

    //Cette méthode nous permet de savoir si une ligne est pleine   
    public boolean lignepleine(int numligne) {
        for (int j = 0; j < 4; j++) {
            if (grille[numligne][j] == null) {
                return false;
            }
        }
        return true;
    }

    //Cette méthode permet d'ajouter une carte dans une case de la grille en prenant comme paramètre les coordonées de la case   
    public boolean ajoutercartedansgrille(int numligne, int numcolonne) {
        Random t = new Random();
        int tirage = t.nextInt(3);
        int numeroCarte = tabcarte[tirage];
        if (grille[numligne][numcolonne] == null) {
            grille[numligne][numcolonne] = numeroCarte;
            return true;
        }
        return false;

    }

//Cette méthode nous permet d'afficher notre grille sur la console, elle est actualisée tout au long de la partie à chaque fois que le joueur joue    
    public void afficherlagrillesurconsole() {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (grille[i][j] != null) {
                    System.out.print("  " + grille[i][j] + "  ");
                } else {
                    System.out.print("  _  ");
                }
            }
            System.out.println();

        }

    }

//Avec cette méthode on peut additionner 2 cartes similaires côte à côte en traitant le cas des 2 et des 1 à la condition que l'on est bloqué pour permettre les cartes de se supperposés entre elles    
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
        //On traite le cas ou le joueur swippe vers le bas
        if (direction == "B") {

            for (int j = 0; j < 4; j++) {
                int i = 3;
                while (i >= 1 && grille[i][j] != null && grille[i - 1][j] != null) {
                    //On traite le cas ou on a des 2 et des 1
                    if ((grille[i][j] == 1 || grille[i][j] == 2) && (grille[i - 1][j] == 1 || grille[i - 1][j] == 2)) {
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

        //Dans le cas ou le joueur swippe a droite
        if (direction == "D") {

            for (int i = 0; i < 4; i++) {
                int j = 3;
                while (j >= 1 && grille[i][j] != null && grille[i][j - 1] != null) {
                    //On traite le cas ou on a des 2 et des 1
                    if ((grille[i][j] == 1 || grille[i][j] == 2) && (grille[i][j - 1] == 1 || grille[i][j - 1] == 2)) {
                        if (grille[i][j] == 1 && grille[i][j - 1] == 2 || grille[i][j] == 2 && grille[i][j - 1] == 1) {
                            grille[i][j] = 3;
                            grille[i][j - 1] = null;
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
        //Dans le cas ou il swippe a gauche
        if (direction == "G") {

            for (int i = 0; i < 4; i++) {
                int j = 0;
                while (j <= 2 && grille[i][j] != null && grille[i][j + 1] != null) {
                    //On traite le cas ou on a des 2 et des 1
                    if ((grille[i][j] == 1 || grille[i][j] == 2) && (grille[i][j + 1] == 1 || grille[i][j + 1] == 2)) {
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

    }

    public int calculscore() {
        //Cette méthode calcul le score du joueur en ne comptant pas les 1 et les 2
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

    public boolean additionimpossible() {
        //Cette méthode nous permet de vérifier si le joueur n'a plus la possibilité d'additionner 2 cartes quelques soit le cas
        //Grâce à cette méthode combiné avec la méthode grillepleine on peut savoir si la partie est finie ou non
        boolean verif = true;

        //On procède a une verficiation au préalable pour s'assurer que la grille est pleine pour ne pas faire de test sur des null
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (grille[i][j] == null) {
                    verif = false;
                }

            }
        }
        if (verif == false) {
            return false;
        } else {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                    //On fait un premier test pour ne pas faire de vérification sur des cases nulles
                    if (grille[i][j] != null && grille[i + 1] != null && grille[i][j + 1] != null) {
                        //On procède à un premier test pour savoir si il n'y a plus aucun chiffre similaire côte à côte
                        if ((grille[i][j] != grille[i + 1][j] || grille[i][j] != grille[i][j + 1])) {
                            //On vérifie ensuite qu'il n'y a pas de 2 et de 1 côte à côte
                            if ((grille[i][j] == 1 && (grille[i][j + 1] == 2 || grille[i + 1][j] == 2)) || (grille[i][j] == 2 && (grille[i][j + 1] == 1 || grille[i + 1][j] == 1))) {

                                return false;
                            }
                            //Dans le cas ou il y a 2 chiffres similaires côte à côte, on vérifie que ce ne sont pas des 1 et des 2
                        } else {
                            if (grille[i][j] != 1 && grille[i][j] != 2) {
                                return false;
                            }
                        }
                    } else {
                        return false;
                    }
                }
            }

            return true;

        }
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
