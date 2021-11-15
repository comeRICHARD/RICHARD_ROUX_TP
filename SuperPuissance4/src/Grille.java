/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author richa
 */
public class Grille {
    for(int i=0 ; i<7 ; i++){
        for(int j=0;j<6;j++){
            CellulesJeu[j][i]=null;
    }
    
}
    CellulesJeu Cellule = new CellulesJeu;
    public void Grille(){
        
    }
    public boolean ajouterJetonDansColonne(Jeton j,int num_colonne){
        for(int i=5;i<CellulesJeu.length;i--){
           
            if (CellulesJeu[i][num_colonne]==null){
               
                CellulesJeu[i][num_colonne]=
                   
               
            }
           
        }
        return false;
    }
    public boolean etreRemplie(){
        for (int i=0 ; i<7 ; i++ ){
            for (int j=0 ; j<6 ; j++){
                if (CellulesJeu!=null){
                    return true;
                }else{
                    return false;
                }
                
            }
        }
    }
    public void viderGrille(){
        for (int i==0 ; i<7 ; i++ ){
            for (int j==0 ; j<6 ; j++){
                CellulesJeu[i][j]=null;
            }
        }
    }
    public void afficherGrilleSurConsole(){
        for(int i=0;i<6;i++){
            for(int j=0;j<7;j++){
                if(trounoir.CellulesJeu[][]==true){
                    System.out.print(Cellule);
                }
                        System.out.print()
        }
    }
    }
    
    public boolean celluleOccupee(num_ligne, num_colone){
        if(CellulesJeu[num_ligne][num_colone]!=null){
            return true;
        }else{
            return false;
        }
        
    }
    public void lireCouleurDuJeton(int, int){
        
    }
    public boolean etreGagnantePourJoueur(Joueur j ){
       
   
        //Verifiaction des lignes vers la droite
        for (int i=0;i<=3;i++){
            int compt=0;
            if(CellulesJeu[l][c+i]==Jeton j){
            compt+=1;
        }
            if (compt==3){
                return true;
            }
     
       
           
        }
           
        //Verification des lignes vers la gauche  
        for (int i=0;i<=3;i++){
            int compt=0;
            if (CellulesJeu[l][c-i]!==Jeton j){
            compt+=1;
               
               
            }
        }
         if (compt==3){
                return true;
            }
        //Verification des colonnes vers le haut
        for(int i=0;i<=3;i++){
            int compt=0;
            if (CellulesJeu[l+i][c]!==Jeton j){
            compt+=1;
                 
        }
        }
         if (compt==3){
                return true;
            }
        //Verification des colonnes vers le bas
        for(int i=0;i<=3;i++){
            int compt=0;
            if (CellulesJeu[l-i][c]!==Jeton j){
                compt+=1;
                        }
        }
         if (compt==3){
                return true;
            }
        //Verification diagonale vers le haut à droite
        for(int i=0;i<=3;i++){
            int compt=0;
            if (CellulesJeu[l+i][c+i]!==Jeton j){
                compt+=1;
                        }
        }
         if (compt==3){
                return true;
            }
                       
        //Verification diagonale vers le bas à droite
        for(int i=0;i<=3;i++){
            int compt=0;
            if (CellulesJeu[l-i][c+i]!==Jeton j){
            compt+=1;
           
               
                        }
        }
         if (compt==3){
                return true;
            }
        //Verification diagonale vers le haut gauche
        for(int i=0;i<=3;i++){
            int compt=0;
            if (CellulesJeu[l+i][c-i]!==Jeton j){
                compt+=1;
                        }
        }
         if (compt==3){
                return true;
            }
        //Verification diagonale vers le haut gauche
        for(int i=0;i<=3;i++){
            int compt=0;
            if (CellulesJeu[l-i][c-i]!==Jeton j){
                compt+=1;
                        }
        }
         if (compt==3){
                return true;
            }
    
}
public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_RED = "\u001B[31m";

System.out.print(ANSI_RED + "RED COLOR" + ANSI_RESET)