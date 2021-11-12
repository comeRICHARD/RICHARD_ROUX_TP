/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_richard_roux;

/**
 *
 * @author richa
 */
public class BouteilleBiere  {
    String Nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    
    
    
public BouteilleBiere (String unNom, double unDegre, String unebrasserie) {
    Nom = unNom;
    degreAlcool = unDegre;
    brasserie = unebrasserie;
    ouverte = false;
}
public void lireEtiquette() {
        System.out.println("Bouteille de " + Nom +" (" + degreAlcool +
        " degres) \nBrasserie : " + brasserie ) ;
        

}
public boolean Decapsuler(){
    if (ouverte == false){
        ouverte=true;
        }
      else {
        System.out.println("erreur:bierre deja ouverte");
        ouverte=false;
    
        
               
    }
        
    return ouverte;   
}
@Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = Nom + " (" + degreAlcool + " degrés)";

if (ouverte == true ) chaine_a_retourner += "oui" ;
else chaine_a_retourner += "non" ;
return chaine_a_retourner ;
}
}
