/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2biererichardroux;

/**
 *
 * @author richa
 */
public class TP2BiereRICHARDROUX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0,"Dubuisson") ;
        /**
        uneBiere.Nom = "Cuvée des trolls";
        uneBiere.degreAlcool = 7.0 ;
        uneBiere.brasserie="Dubuisson";
        uneBiere.ouverte=false;
        uneBiere.lireEtiquette();
        */
        /**
        uneBiere.Nom = "Leffe";
        uneBiere.degreAlcool = 6.6 ;
        uneBiere.brasserie="Abbaye de Leffe";
        uneBiere.ouverte=false;
        uneBiere.lireEtiquette();
        */
        uneBiere.lireEtiquette();
        
        BouteilleBiere uneBiere1 = new BouteilleBiere("Perlembourg",7.9,"Valbonne") ;

        BouteilleBiere uneBiere2 = new BouteilleBiere("86",8.6,"Besancon") ;

        BouteilleBiere uneBiere3 = new BouteilleBiere("Kron",10.0,"Rungis") ;
        
        /**
        uneBiere3.lireEtiquette();
        uneBiere3.Decapsuler();
        */
        /**
        System.out.println(uneBiere) ;
        */
        
        BouteilleBiere uneBiere4 = new BouteilleBiere("Heine",15.0,"Mont blanc");
        uneBiere4.lireEtiquette();
    }
    
}
