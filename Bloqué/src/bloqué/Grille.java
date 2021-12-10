/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloqué;

/**
 *
 * @author richa
 */
public class Grille {
     int grille[][] = new int[4][4];
    public boolean GrilleRemplie(){
        
        
        
        return false;
}
    public void AfficherGrille(){
        System.out.println();
    }
    public int LireChiffre(int i ,int j){
        return grille[i][j];
    }
    public boolean ColonneRemplie(int num_cln){
        for (int i=0 ; i<4 ; i++){
        if (grille[i][num_cln]==0){
            return false;}
        else {
            
        
        
         return true;
        }
        
    }
        
    }

    
}
   