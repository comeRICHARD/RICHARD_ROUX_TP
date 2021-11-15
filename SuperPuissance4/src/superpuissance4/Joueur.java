package superpuissance4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author richa
 */
public class Joueur {
    String nom;
    String Couleur;
    Jeton ListeJetons []=new Jeton[21];
    int nombreDesintegrateurs;
    int nombreJetonsRestants;
public Joueur(String unnom){
    nom=unnom;
   
}    

public void affecterCouleur(String unecouleur){
    Couleur=unecouleur;
}
public boolean ajouterJeton(Jeton  j ){
   for(int i=0;i<ListeJetons.length;i++){
       if (ListeJetons[i]==null){
           ListeJetons[i]=j;
           return true;  
   }
       
}
   return false;
}

public void ObtenirDesintegrateurs(){
    nombreDesintegrateurs+=1;
}
public boolean utiliserDesintegrateur(){
    if (nombreDesintegrateurs!=0){
        nombreDesintegrateurs-=1;
        return true;
    }
    else{
      return false;  
    }
     
}
}  