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
   
   

   
    public  Grille(){
      for(int i=0 ; i<6 ; i++){
          for(int j=0 ; j<7 ; j++){
              CellulesJeu[i][j] = new Cellule();
          }
      }
    }
    public boolean etreRemplie(){
        for (int i=0 ; i<6 ; i++ ){
            for (int j=0 ; j<7 ; j++){
                if (CellulesJeu[i][j].jetonCourant==null){
                    return false;
               
                   
                }
               
            }
        }
        return true;
    }
    public boolean Colonneremplie(int num_colonne){
        for (int i =0 ; i<6 ; i++){
            if(CellulesJeu[i][num_colonne]!=null){
                return true;
           
            }
        }
        return false;
    }

    public boolean ajouterJetonDansColonne(Jeton j,int num_colonne){
        int k = 0;
           if (Colonneremplie(num_colonne)==true){
               return false;
           }
           
           while (CellulesJeu[k][num_colonne].jetonCourant != null) {
            k++;
           }
           CellulesJeu[k][num_colonne].affecterJeton(j);
           
            if (CellulesJeu[k][num_colonne].Desintegrateur()) {
            CellulesJeu[k][num_colonne].recupererDesintegrateur();
            //jetonCourant.nombreDesintegrateurs++;
            }
           
             
            if (CellulesJeu[k][num_colonne].presenceTrouNoir()) {
            CellulesJeu[k][num_colonne].activerTrouNoir();
            }
       
                       
               
       
        return true;
}
   
         
   
   
    public void viderGrille(){
        for (int i=0 ; i<6 ; i++ ){
            for (int j=0 ; j<7 ; j++){
                CellulesJeu[i][j].jetonCourant=null;
            }
        }
    }
    public void afficherGrilleSurConsole(){
        for(int i=5;i>=0;i--){
            System.out.println(); 
            for(int j=0;j<7;j++){
                
                if (celluleOccupee(i,j)==true){// Cas ou il y a un jeton dans la cellule
                      if (lireCouleurDuJeton(i,j)=="Rouge") {

                    System.out.print("\u001B[31m  0  "); //On print un O rouge

                }else {

                   System.out.print("\u001B[33m  0  "); //On print un O en jaune

                

                }
                    
                }
                else if (CellulesJeu[i][j].Desintegrateur()==true){// Si il y a la présence d'un désintégrateur
                    if (CellulesJeu[i][j].presenceTrouNoir()==true){
                        System.out.print("\u001B[0m | T | "); //On mets le trou noir devant le désintegrateur 
                    }else{
                         System.out.print("\u001B[0m | D | ");// On affiche le désintégrateurs
                    }
                }
                    
                  
                else if(CellulesJeu[i][j].presenceTrouNoir()==true){
                      System.out.print("\u001B[0m | T | ");
                            
                    
                }else{
                       System.out.print("| _ |");
                       }                  
                
                
                  

                
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
    public String lireCouleurDuJeton(int num_ligne, int num_colone){
        return CellulesJeu[num_ligne][num_colone].lireCouleurDuJeton();
       
       
    }
    public boolean etreGagnantePourJoueur(Joueur joueur ){
      String Cj=joueur.Couleur;
       
        //Verifiaction des lignes
        for (int i=0;i<=5;i++){
            for (int j=0;j<=3;j++){
                if(CellulesJeu[i][j]!=null && CellulesJeu[i][j].lireCouleurDuJeton()==Cj
                        && CellulesJeu[i+1][j+1]!=null && CellulesJeu[i][j+1].lireCouleurDuJeton()==Cj
                        && CellulesJeu[i+2][j+2]!=null &&CellulesJeu[i][j+2].lireCouleurDuJeton()==Cj
                        && CellulesJeu[i+3][j+3]!=null && CellulesJeu[i][j+3].lireCouleurDuJeton()==Cj){
                    return true;
                }
               
               
            }
           
           
        }
        //Verification des colonnes
        for(int i=0;i<=2;i++)
            for (int j=0;j<=6;j++){
                if(CellulesJeu[i][j]!=null && CellulesJeu[i][j].lireCouleurDuJeton()==Cj
                        && CellulesJeu[i][j+1]!=null && CellulesJeu[i][j+1].lireCouleurDuJeton()==Cj
                        && CellulesJeu[i][j+2]!=null && CellulesJeu[i][j+2].lireCouleurDuJeton()==Cj
                        && CellulesJeu[i][j+3]!=null && CellulesJeu[i][j+3].lireCouleurDuJeton()==Cj){
                    return true;
                }
               
            }
       
        //Verification des diagonales vers le haut
        for(int i=0;i<=2;i++){
            for (int j=0;j<=3;j++){
                if(CellulesJeu[i][j]!=null && CellulesJeu[i][j].lireCouleurDuJeton()==Cj
                        && CellulesJeu[i][j+1]!=null && CellulesJeu[i][j+1].lireCouleurDuJeton()==Cj
                        && CellulesJeu[i][j+2]!=null && CellulesJeu[i][j+2].lireCouleurDuJeton()==Cj
                        && CellulesJeu[i][j+3]!=null && CellulesJeu[i][j+3].lireCouleurDuJeton()==Cj){
                    return true;
                }
               
               
            }
        }
       
        //Verification des diagonales vers le bas
        for(int i=3;i<=5;i++){
            for (int j=0;j<=3;j++){
                if(CellulesJeu[i][j]!=null && CellulesJeu[i][j].lireCouleurDuJeton()==Cj
                        && CellulesJeu[i][j+1]!=null && CellulesJeu[i][j+1].lireCouleurDuJeton()==Cj
                        && CellulesJeu[i][j+2]!=null && CellulesJeu[i][j+2].lireCouleurDuJeton()==Cj
                        && CellulesJeu[i][j+3]!=null && CellulesJeu[i][j+3].lireCouleurDuJeton()==Cj){
                    return true;
                }
            }
               
            }
        return false;
    }
       public Boolean supprimerJeton(int num_ligne,int num_colonne){
           if(CellulesJeu[num_ligne][num_colonne].jetonCourant==null ){
               return false;
       }else{
                CellulesJeu[num_ligne][num_colonne].jetonCourant=null;
                return true;}
               
               
   
           
       }
       public boolean colonneRemplie(int num_colonne){
           
               if (CellulesJeu[5][num_colonne].jetonCourant==null){
                   return false;
                   
               }else{
           
           return true;
 
       }
       }



       public void tasserGrille(int num_colonne){
           for (int i=0 ; i<7 ; i++){
               for(int j=0 ; j<6 ; i++){
                   if (i == 5) {
                CellulesJeu[i][num_colonne].jetonCourant = null;
            } else {
                if (CellulesJeu[i][num_colonne].jetonCourant  == null) {
                  CellulesJeu[i][num_colonne].jetonCourant = CellulesJeu[i + 1][num_colonne].jetonCourant;
                  CellulesJeu[i + 1][num_colonne].jetonCourant=null;
                }
            }
               }
           }
       }
}
       
           
        
           
        
