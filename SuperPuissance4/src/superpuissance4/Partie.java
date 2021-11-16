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
    Joueur joueurCourant;
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

            Jeton j = new Jeton(joueur_1.Couleur);

            joueur_1.ajouterJeton(j);

            joueur2.ajouterJeton(new Jeton(joueur_2.Couleur));
        }


        
                
           
        
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
       
       
       
       
        
        
    }
    public void debuterPartie(){
        initialiserPartie();
        while(grilleJeu.etreGagnantePourJoueur(ListesJoueurs[0]) != true && grilleJeu.etreGagnantePourJoueur(ListesJoueurs[1]) != true && grilleJeu.etreRemplie() != true);{
          if (grilleJeu.etreGagnantePourJoueur(ListesJoueurs[0])== true){
              System.out.println()
              
          }  
        }
        
    }
    
    
}
