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
        for (int i=0 ; i<3 ; i++){
            Random cl = new Random();
           
            int zz = cl.nextInt(4);
            int yy = cl.nextInt(4);
            grilleJeu.ajoutercartedanscolonne(zz , yy);

        }

        
        }

     
    
    public void DebuterPartie(){
        System.out.println("Bonjour à toi génie des maths, à toi de jouer");
        System.out.println("Le but du jeu est de garder une grille avec des espaces vides");
        System.out.println("Les 2 ne s'addittionnent qu'avec des 1 et inversement");
        InitialiserPartie();
        grilleJeu.afficherlagrillesurconsole();
        while (!grilleJeu.etreperdant() || !grilleJeu.etreremplie()){
            
        }
        
        

    }
} 
        
