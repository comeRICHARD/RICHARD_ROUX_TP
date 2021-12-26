/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloqué;

import java.util.Random;

/**
 *
 * @author richa
 */
public class Partie {
    Grille grilleJeu = new Grille();
    

    public void InitialiserPartie(){

        for (int i=0 ; i<3 ; i++){
            Random tirage = new Random();
           
            int ligne = tirage.nextInt(4);
            int colonne = tirage.nextInt(4);
            grilleJeu.ajoutercarteInitiale(ligne , colonne); /* XXX ce n'est pas ajouter carte dans colonne mais ajouter carte tout court */

        }

        
        }

     
    
    public void DebuterPartie(){
        System.out.println("Bonjour à toi génie des maths, à toi de jouer");
        System.out.println("Le but du jeu est de garder une grille avec des espaces vides"); /* XXX no ce n'est pas le but mais un moyen... */
       System.out.println("Le but du jeu est de rester en vir le maximum de coup / ou marquer un maximum de point =s en ...");
        System.out.println("Les 2 ne s'additionnent qu'avec des 1 et inversement"); /* XXX addittionne -> additionne */ 
        InitialiserPartie();
        grilleJeu.afficherlagrillesurconsole();
        while (!grilleJeu.etreperdant()){
            
        }
        
        

    }
} 
        
