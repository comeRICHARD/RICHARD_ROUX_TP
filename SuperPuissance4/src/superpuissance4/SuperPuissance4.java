/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package superpuissance4;
import java.util.scanner
/**
 *
 * @author richa
 */
public class SuperPuissance4 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String [] args){
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
        Partie nouvellepartie=new Partie();
        nouvellepartie.debuterPartie();
    }
        
        
        
}
