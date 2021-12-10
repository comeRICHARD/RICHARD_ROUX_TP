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
    Carte cartecourante;
    int[] tabcarte={1,2,3};
    
   public Integer[][]grille=new Integer[4][4];
    
    public Grille(){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                grille[i][j]=null;
                
            }
        }
    }
    public boolean etreremplie(){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if (grille[i][j]!=null){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean colonnepleine(int numcolonne){
        for(int i=0;i<4;i++){
            if(grille[i][numcolonne]!=null){
                return false;
                
            }
        }
        return true;
    }
    public boolean ligneplein(int numligne){
        for(int j=0;j<4;j++){
            if(grille[numligne][j]!=0){
                return false;
            }
        }
        return true;
    }
    public boolean ajoutercartedanscolonne(int numligne,int numcolonne){
        Random t=new Random();
        int tirage=t.nextInt(3);  
        int numeroCarte=tabcarte[tirage];
        if(grille[numligne][numcolonne]==null){
            grille[numligne][numcolonne]=numeroCarte;
            return true;
        }
        return false;
        
        
        
    }
    public void afficherlagrillesurconsole(){
        
    }
    public void additionnercartes(String direction){
        
    }
    public void tassergrille(){
        
    }
    public int aditionnergrille(){
        int score=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                score+=grille[i][j];
            }
        }
        return score;
    }
}


