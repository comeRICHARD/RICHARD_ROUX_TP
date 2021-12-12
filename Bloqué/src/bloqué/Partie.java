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
            Random tirage = new Random();
           
            int ligne = tirage.nextInt(4);
            int colonne = tirage.nextInt(4);
            grilleJeu.ajoutercartedanscolonne(ligne , colonne);

        }

        
        }

     
    
    public void DebuterPartie(){
        System.out.println("Bonjour à toi génie des maths, à toi de jouer");
        System.out.println("Le but du jeu est de garder une grille avec des espaces vides en additionant les cartes présentant le meme chiffre");
        System.out.println("Les 2 ne s'addittionnent qu'avec des 1 et inversement");
        System.out.println("A chaque tour vous choisirez une direction dans laquelle vont se déplacer les cartes de la grille");
        System.out.println("H pour haut \n B pour bas \n D pour droite \n G pour gauche");
        InitialiserPartie();
        //Déclaration des variables
        String choixdirection;
        Scanner reponse=new Scanner(System.in);
        Random tirage = new Random();
        int ligne;
        int colonne;
      
        
        while (!grilleJeu.etreperdant() || !grilleJeu.etreremplie()){
            grilleJeu.afficherlagrillesurconsole();
            
            do{
                
                System.out.println("Choisissez une direction");
                choixdirection=reponse.nextLine();
                
            }while(choixdirection!="H" || choixdirection!="B" || choixdirection!="G" || choixdirection!="D" );
            
            grilleJeu.additionnercartes(choixdirection);
            grilleJeu.TasserGrille(choixdirection);
            if (choixdirection=="H"){
                do{
                ligne=3;
                colonne = tirage.nextInt(4);
                grilleJeu.ajoutercartedanscolonne(ligne , colonne);
                
                }while(!grilleJeu.ajoutercartedanscolonne(ligne , colonne));
            }else if (choixdirection=="B"){
                do{
                ligne=0;
                colonne = tirage.nextInt(4);
                grilleJeu.ajoutercartedanscolonne(ligne , colonne);
                
                }while(!grilleJeu.ajoutercartedanscolonne(ligne , colonne));
            
        }else if (choixdirection=="D"){
                do{
                ligne=tirage.nextInt(4);
                colonne =0;
                grilleJeu.ajoutercartedanscolonne(ligne , colonne);
                
                }while(!grilleJeu.ajoutercartedanscolonne(ligne , colonne));
            
        }else if (choixdirection=="G"){
                do{
                ligne=tirage.nextInt(4);;
                colonne = 3;
                grilleJeu.ajoutercartedanscolonne(ligne , colonne);
                
                }while(!grilleJeu.ajoutercartedanscolonne(ligne , colonne));
            
        }
               

    }
        if (grilleJeu.etreperdant() && grilleJeu.etreremplie()){
            int score=0;
            System.out.println("Vous etes bloqué, vous avez perdu");
            score=grilleJeu.aditionnergrille();
            System.out.println("Votre score est de " + score + " points");
        }
} 
}
        
