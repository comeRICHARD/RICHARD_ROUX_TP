/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package superpuissance4;

/**
 *
 * @author richa
 */
public class SuperPuissance4 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String [] args){
        Partie nouvellepartie=new Partie();
        
        Jeton j = new Jeton("ROUGE");
        String s = j.lireCouleur();
        Cellule c=new Cellule();
        c.affecterJeton(j);
        
        Grille g=new Grille();
        g.afficherGrilleSurConsole();
    }
        
        
}
