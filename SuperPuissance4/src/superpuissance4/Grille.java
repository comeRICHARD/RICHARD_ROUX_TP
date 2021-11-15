package superpuissance4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author richa
 */
public class Grille {
    Cellule[][] CellulesJeu = new Cellule[6][7];
    
    

    
    public void Grille(){
        
    }
    public boolean ajouterJetonDansColonne(Jeton j,int num_colonne){
        for(int i=5;i<0;i--){
           
            if (CellulesJeu[i][num_colonne]==null){
               
                return true;
                   
               
            }
           
        }
        return false; 
    }
    public boolean etreRemplie(){
        for (int i=0 ; i<7 ; i++ ){
            for (int j=0 ; j<6 ; j++){
                if (CellulesJeu!=null){
                    return false;
                
                    
                }
                
            }
        }
        return true;
    }
    
    public void viderGrille(){
        for (int i=0 ; i<7 ; i++ ){
            for (int j=0 ; j<6 ; j++){
                CellulesJeu[i][j]=null;
            }
        }
    }
    public void afficherGrilleSurConsole(){
        for(int i=0;i<6;i++){
            for(int j=0;j<7;j++){
                
                    System.out.print(CellulesJeu[i][j].lireCouleurDuJeton());
                
        }
    }
    }
    
    public boolean celluleOccupee(int num_ligne, int num_colone){
        if(CellulesJeu[num_ligne][num_colone]!=null){
            return true;
        }else{
            return false;
        }
        
    }
    public void lireCouleurDuJeton(int num_ligne, int num_colone){
        CellulesJeu[num_ligne][num_colone].lireCouleurDuJeton();
        
        
    }
    public boolean etreGagnantePourJoueur(Joueur joueur ){
      String Cj=joueur.Couleur;
       
        //Verifiaction des lignes 
        for (int i=0;i<=5;i++){
            for (int j=0;j<=3;j++){
                if(CellulesJeu[i][j].lireCouleurDuJeton()==Cj && CellulesJeu[i][j+1].lireCouleurDuJeton()==Cj && CellulesJeu[i][j+2].lireCouleurDuJeton()==Cj && CellulesJeu[i][j+3].lireCouleurDuJeton()==Cj){
                    return true;
                } 
                
                
            }
            
           
        }
        //Verification des colonnes
        for(int i=0;i<=2;i++)
            for (int j=0;j<=6;j++){
                if(CellulesJeu[i][j].lireCouleurDuJeton()==Cj && CellulesJeu[i][j+1].lireCouleurDuJeton()==Cj && CellulesJeu[i][j+2].lireCouleurDuJeton()==Cj && CellulesJeu[i][j+3].lireCouleurDuJeton()==Cj){
                    return true;
                }
                
            }
        
        //Verification des diagonales vers le haut
        for(int i=0;i<=2;i++){
            for (int j=0;j<=3;j++){
                if(CellulesJeu[i][j].lireCouleurDuJeton()==Cj && CellulesJeu[i][j+1].lireCouleurDuJeton()==Cj && CellulesJeu[i][j+2].lireCouleurDuJeton()==Cj && CellulesJeu[i][j+3].lireCouleurDuJeton()==Cj){
                    return true;
                }
                
                
            }
        }
        
        //Verification des diagonales vers le bas
        for(int i=3;i<=5;i++){
            for (int j=0;j<=3;j++){
                if(CellulesJeu[i][j].lireCouleurDuJeton()==Cj && CellulesJeu[i][j+1].lireCouleurDuJeton()==Cj && CellulesJeu[i][j+2].lireCouleurDuJeton()==Cj && CellulesJeu[i][j+3].lireCouleurDuJeton()==Cj){
                    return true;
                }
            }
                
            }
        return false;
    }
        
        
        
        
            
        
        
          
     
       
           
        }
           
        