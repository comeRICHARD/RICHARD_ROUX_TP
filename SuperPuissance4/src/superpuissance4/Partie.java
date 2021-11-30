/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superpuissance4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author richa
 */
public class Partie {
    // normalement, toutes ces variables doivent etre "private"

    Joueur ListesJoueurs[] = new Joueur[2]; // tu appelles ca liste alors que c'est un tableau. Correct nom serait "joueurs"
    Joueur JoueurCourant; // lower case pour la premiere letre
    Grille grilleJeu = new Grille();

    public void initialiserPartie() {

        //On commence par vider la grille
        grilleJeu.viderGrille();
        //Cellule[][] CellulesJeu = new Cellule[6][7]; // "cellules" serait un nom plus correct

        //Entrée des noms
        Scanner sc = new Scanner(System.in);
        String nom_j1;
        String nom_j2;

        System.out.println("Joueur 1: Entrez votre nom");
        nom_j1 = sc.nextLine();
        System.out.println("Joueur 2: Entrez votre nom"); // n'oublis as de gerer si les deux rentrent le meme nom
        nom_j2 = sc.nextLine();

        Joueur joueur_1 = new Joueur(nom_j1);
        Joueur joueur_2 = new Joueur(nom_j2);
        ListesJoueurs[0] = joueur_1;
        ListesJoueurs[1] = joueur_2;

        //Attribution des couleurs
        attribuerCouleursAuxJoueurs();

        // Attribution des Jetons
        for (int i = 0; i < 21; i++) {
            ListesJoueurs[0].ajouterJeton(new Jeton(ListesJoueurs[0].Couleur));
            ListesJoueurs[0].nombreJetonsRestants++;

            ListesJoueurs[1].ajouterJeton(new Jeton(ListesJoueurs[1].Couleur));
            ListesJoueurs[1].nombreJetonsRestants++;
        }

        //Placement des 5 trous noir
        Random troualeat = new Random();
        int nbligne = 6;
        int nbcolonne = 7;

        for (int nbrtrounoir = 0; nbrtrounoir < 5;) {
           
                
            

            int lignealeat = troualeat.nextInt(nbligne);
            int colonnealeat = troualeat.nextInt(nbcolonne);
            if (grilleJeu.placerTrouNoir(lignealeat, colonnealeat)) {
                nbrtrounoir++;
            }
            //On place les desintegrateurs cacher dans les trous noirs
            for (int nbrdesinteg=0;nbrdesinteg< 3;){
                lignealeat = troualeat.nextInt(nbligne);
                colonnealeat = troualeat.nextInt(nbcolonne);
                
                
            if(grilleJeu.cellulesJeu[lignealeat][colonnealeat].presenceTrouNoir()){
                grilleJeu.placerDesintegrateur(lignealeat, colonnealeat);
                nbrdesinteg++;
            }
            }
            }
            //On place ensuite les désintegrateurs visibles
            
            for (int nbrdesinteg=0;nbrdesinteg< 2;){
                int lignealeat = troualeat.nextInt(nbligne);
                int colonnealeat = troualeat.nextInt(nbcolonne);
                if(grilleJeu.cellulesJeu[lignealeat][colonnealeat].presenceTrouNoir()==false){
                    grilleJeu.placerDesintegrateur(lignealeat, colonnealeat);
                    nbrdesinteg++;
                    
                }
            }

        

    }

    public void attribuerCouleursAuxJoueurs() {

        int n1;
        String[] tableauc = {"Rouge", "Jaune"};
        Random caleat = new Random();
        int valaleat = caleat.nextInt(1);
        n1 = valaleat;
        if (n1 == 0) {
            ListesJoueurs[0].Couleur = tableauc[n1];
            ListesJoueurs[1].Couleur = tableauc[1];

        } else {
            ListesJoueurs[0].Couleur = tableauc[n1];
            ListesJoueurs[1].Couleur = tableauc[0];
        }

        System.out.println(ListesJoueurs[0].nom + " vous etes de couleur " + ListesJoueurs[0].Couleur);
        System.out.println(ListesJoueurs[1].nom + " vous etes de couleur " + ListesJoueurs[1].Couleur);

    }

    public void debuterPartie() {
        //déclaration des variables
        boolean colonnepleine = true;
        int num_colonne = 0;
        int num_ligne;
        Scanner sc = new Scanner(System.in);
        int choixjoueur;

        initialiserPartie();

        JoueurCourant = ListesJoueurs[0];
        System.out.println();
        System.out.println(ListesJoueurs[0].nom + " vous etes le premier à jouer");

        //Boucle du jeu, il y a 3 possibilités soit joueur 1 gagne, joueur 2 gagne ou joueur 3 gagne
        while (grilleJeu.etreGagnantePourJoueur(ListesJoueurs[0]) != true && grilleJeu.etreGagnantePourJoueur(ListesJoueurs[1]) != true && grilleJeu.etreRemplie() != true) {
            do {
                grilleJeu.afficherGrilleSurConsole();
                System.out.println();
                System.out.println(JoueurCourant.nom + " Que souhaitez vous faire ?");
                System.out.println("1/Jouer une jeton \n2/Récupérer un jeton \n3/Utiliser un désintégrateur");
                choixjoueur = sc.nextInt();
                if (choixjoueur != 1 && choixjoueur != 2 && choixjoueur != 3) {
                    System.out.println();
                    System.out.println(" Rentrez un numéro parmis les choix proposés");
                }
            } while (choixjoueur != 1 && choixjoueur != 2 && choixjoueur != 3);

            //déroulement de la partie
            if (choixjoueur == 1) {
                do {

                    //Le joueur renseigne son coup
                    System.out.println();
                    System.out.println(JoueurCourant.nom + " Entrez un numéro de colonne entre 1 et 7");

                    // Verification de Coup valide      
                    num_colonne = sc.nextInt() - 1;

                    //message d'erreur si le numéro de colonne n'est pas compris entre 1 et 6
                    if (num_colonne < 0 || num_colonne > 6) {
                        System.out.println("Veuillez entrer un nombre compris entre 1 et 7");
                    } else {

                        //message d'erreur si le joueur veut ajouter un jeton alors que la colonne est pleine 
                        colonnepleine = grilleJeu.colonneRemplie(num_colonne);
                        if (grilleJeu.colonneRemplie(num_colonne) == true) {
                            System.out.println("La Colonne est pleine, Choisissez une autre");

                        }

                    }

                } while (colonnepleine == true || num_colonne < 0 || num_colonne > 6);

                //Dans le cas ou le joueur souhaite ajouter un jeton
                Jeton j = JoueurCourant.ListeJetons[JoueurCourant.nombreJetonsRestants - 1];
                grilleJeu.ajouterJetonDansColonne(j, num_colonne);
                //On enlève au joueur un jeton 
                JoueurCourant.ListeJetons[JoueurCourant.nombreJetonsRestants - 1] = null;
                JoueurCourant.nombreJetonsRestants--;
            } //Dans le cas ou le joueur souhaite récupérer un jeton
            else if (choixjoueur == 2) {

                //On commence par vérifier qu'il y a au moin 1 jetons dans la grille
                /* for(int i=0;i<Grille.NOMBRE_DE_LIGNES;i++){
                               for(int j=0;j<Grille.NOMBRE_DE_COLONNES;j++){
                                       if(grilleJeu.lireCouleurDuJeton(i, j)!=JoueurCourant.Couleur){
                                          System.out.println();
                                          System.out.println("Il n'y a aucun jeton de votre couleur  la grille");
                                          choixjoueur=1; //Le joueur est donc obligé de placer un jeton
                                          
                                }
                                    
                                    }
                             }*/
                do {
                    do {

                        System.out.println();
                        System.out.println("Renseignez les coordonnées du Jeton à récupérer");
                        System.out.println("Choix du numéro de ligne");
                        num_ligne = sc.nextInt() - 1;
                        //message d'erreur si le numéro de ligne n'est pas compris entre 1 et 6
                        if (num_ligne < 0 || num_ligne > 5) {
                            System.out.println("Veuillez entrer un nombre compris entre 1 et 6");
                        } else {
                            System.out.println("Choix du numéro de colonne");
                            num_colonne = sc.nextInt() - 1;
                            //message d'erreur si le numéro de lcolonne n'est pas compris entre 1 et 7
                            if (num_colonne < 0 || num_colonne > 6) {
                                System.out.println("Veuillez entrer un nombre compris entre 1 et 7");

                            }

                        }
                    } while ((num_colonne < 0 || num_colonne > 6) && (num_ligne < 0 || num_ligne > 5));

                    if (grilleJeu.celluleOccupee(num_ligne, num_colonne)) {
                        if (grilleJeu.lireCouleurDuJeton(num_ligne, num_colonne).equals(JoueurCourant.Couleur)) {
                            Jeton recup = grilleJeu.recupererJeton(num_ligne, num_colonne);
                            JoueurCourant.ajouterJeton(recup);
                            grilleJeu.tasserGrille(num_colonne);
                            //cas ou le jeton n'est pas de la couleur du joueur    
                        } else {
                            System.out.println();
                            System.out.println("Ce Jeton ne vous appartient pas, vous ne pouvez pas l'enlever");
                        }

                        //cas ou la cellule est vide   
                    } else {
                        System.out.println();
                        System.out.println("Il n'y a aucun jeton sur les coordonnées que vous avez rentrées");
                    }
                } while (!grilleJeu.celluleOccupee(num_ligne, num_colonne) && !grilleJeu.lireCouleurDuJeton(num_ligne, num_colonne).equals(JoueurCourant.Couleur));

            }else if(choixjoueur == 3){
                System.out.println();
                System.out.println("Choisissez le jeton que vous voulez désintégré");
                
            }

            //Changement de tour des joueurs
            if (JoueurCourant == ListesJoueurs[0]) {
                JoueurCourant = ListesJoueurs[1];
            } else {
                JoueurCourant = ListesJoueurs[0];
            }
            System.out.println();
            System.out.println(JoueurCourant.nom + "C'est à votre tour de jouer");

        }
        //On test pour savoir pourquoi on est sortit de la boucle
        //cas ou le joueur 1 gagne
        if (grilleJeu.etreGagnantePourJoueur(ListesJoueurs[0])) {
            grilleJeu.afficherGrilleSurConsole();
            System.out.println();
            System.out.println("C'est le joueur " + ListesJoueurs[0].nom + " qui a gagné");

            //cas ou le joueur 2 gagne
        } else if (grilleJeu.etreGagnantePourJoueur(ListesJoueurs[1])) {
            grilleJeu.afficherGrilleSurConsole();
            System.out.println();
            System.out.println("C'est le joueur " + ListesJoueurs[1].nom + " qui a gagné");

            //cas ou la grille est pleine
        } else if (grilleJeu.etreRemplie()) {
            grilleJeu.afficherGrilleSurConsole();
            System.out.println();
            System.out.println("La grille est pleine");
        }
    }
}
