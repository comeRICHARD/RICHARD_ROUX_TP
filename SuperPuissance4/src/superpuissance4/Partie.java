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
    
    Joueur ListesJoueurs[]=new Joueur[2];
    Joueur JoueurCourant;
    Grille grilleJeu= new Grille();
    
    
    
    public void initialiserPartie(){
        
        
        //On commence par vider la grille
        grilleJeu.viderGrille();
        Cellule[][] CellulesJeu = new Cellule[6][7];
        
        
        //Entrée des noms
        Scanner sc = new Scanner(System.in);
        String nom_j1;
        String nom_j2;
       
        System.out.println("Joueur 1: Entrez votre nom");
        nom_j1=sc.nextLine();
        System.out.println("Joueur 2: Entrez votre nom");
        nom_j2=sc.nextLine();
       
        Joueur joueur_1= new Joueur(nom_j1);
        Joueur joueur_2=new Joueur (nom_j2);
        ListesJoueurs[0]=joueur_1;
        ListesJoueurs[1]=joueur_2;
        
        
        //Attribution des couleurs
        
        attribuerCouleursAuxJoueurs();
        
        
        // Attribution des Jetons
              
        for (int i = 0; i < 21; i++) {

            Jeton J = new Jeton(ListesJoueurs[0].Couleur);
     

            ListesJoueurs[0].ajouterJeton(J);
            ListesJoueurs[0].nombreJetonsRestants++;
            
                       
            joueur_2.ajouterJeton(new Jeton(ListesJoueurs[1].Couleur));
            ListesJoueurs[1].nombreJetonsRestants++;
            }
            
            /*Placement des 5 trous noir
            Random troualeat=new Random();
            int nbligne=6;
            int nbcolonne=7;
            for (int j=0;j<5;i++){
                int lignealeat=troualeat.nextInt(nbligne);
                int colonnealeat=troualeat.nextInt(nbligne);
                while(grilleJeu.CellulesJeu[lignealeat][colonnealeat].placerTrouNoir()==false && grilleJeu.CellulesJeu[lignealeat][colonnealeat].presenceTrouNoir()==true){
                     lignealeat=troualeat.nextInt(nbligne);
                     colonnealeat=troualeat.nextInt(nbligne);
                }
                
                */
               
            
        }


        
                
           
        
    
    public void attribuerCouleursAuxJoueurs(){
        int n1;
       String [] tableauc={"Rouge","Jaune"};
       Random caleat = new Random();
       int valaleat = caleat.nextInt(1);
       n1=valaleat;
       if (n1==0){
          ListesJoueurs[0].Couleur=tableauc[n1];
          ListesJoueurs[1].Couleur=tableauc[1];
           
       }else{
          ListesJoueurs[0].Couleur =tableauc[n1];
          ListesJoueurs[1].Couleur=tableauc[0];
       }
       
       System.out.println(ListesJoueurs[0].nom + " vous etes de couleur " + ListesJoueurs[0].Couleur);
       System.out.println(ListesJoueurs[1].nom + " vous etes de couleur " + ListesJoueurs[1].Couleur);
       
       
       
       
       
        
        
    }
    public void debuterPartie(){
        //déclaration des variables
        boolean colonnepleine=true;
        int num_colonne;
        Scanner sc = new Scanner(System.in);
        
        
        
        
        initialiserPartie();

        JoueurCourant=ListesJoueurs[0];
        System.out.println();
        System.out.println(ListesJoueurs[0].nom +" vous etes le premier à jouer");
        
        //Boucle du jeu, il y a 3 possibilités soit joueur 1 gagne, joueur 2 gagne ou joueur 3 gagne
        while(grilleJeu.etreGagnantePourJoueur(ListesJoueurs[0]) != true && grilleJeu.etreGagnantePourJoueur(ListesJoueurs[1]) != true && grilleJeu.etreRemplie() != true) {
          grilleJeu.afficherGrilleSurConsole();
              
            //cas ou le joueur 1 gagne
            if (grilleJeu.etreGagnantePourJoueur(ListesJoueurs[0])== true){
              grilleJeu.afficherGrilleSurConsole();
              System.out.println("C'est le joueur " +ListesJoueurs[0].nom + " qui a gagné");
              
              //cas ou le joueur 2 gagne
              
          }else if(grilleJeu.etreGagnantePourJoueur(ListesJoueurs[1])== true){
              grilleJeu.afficherGrilleSurConsole();
              System.out.println("C'est le joueur " +ListesJoueurs[1].nom + " qui a gagné");
              
              //cas ou la grille est pleine
              
          }else if(grilleJeu.etreRemplie() == true){
              grilleJeu.afficherGrilleSurConsole();
              System.out.println("La grille est pleine");
              
              
              //déroulement de la partie
          }
            
            do{
            
            //Le joueur renseigne son coup
            System.out.println();
            System.out.println(JoueurCourant.nom + " Entrez un numéro de colonne entre 1 et 7");    
              
            // Verification de Coup valide      
                num_colonne=sc.nextInt() -1;
               
              //message d'erreur si le numéro de colonne n'est pas compris entre 1 et 6
              if(num_colonne<0 || num_colonne>6){
                   System.out.println("Veuillez entrer un nombre compris entre 1 et 7");
              } else {
                  
              //message d'erreur si la colonne est pleine
                colonnepleine=grilleJeu.colonneRemplie(num_colonne);             
              if(grilleJeu.colonneRemplie(num_colonne)==true){
                  System.out.println("La Colonne est pleine, Choisissez une autre");
                  
              }   
              } 
                       
            }while(colonnepleine==true || num_colonne<0 || num_colonne>6);
              
            //Ajout du jeton
              Jeton j=JoueurCourant.ListeJetons[JoueurCourant.nombreJetonsRestants-1];
              grilleJeu.ajouterJetonDansColonne(j,num_colonne);
            //On enlève au joueur un jeton 
              JoueurCourant.ListeJetons[JoueurCourant.nombreJetonsRestants-1]=null;
              JoueurCourant.nombreJetonsRestants--;
              
              
              
              
         
              //Changement de tour des joueurs
              if (JoueurCourant==ListesJoueurs[0]){
                  JoueurCourant=ListesJoueurs[1];
              }else{
                  JoueurCourant=ListesJoueurs[0];
              }
              
            
        }
              
              
              
              
              
          
        }
        
    }
    
    

