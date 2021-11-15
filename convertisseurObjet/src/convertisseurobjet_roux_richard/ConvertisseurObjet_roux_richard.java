
package convertisseurobjet_roux_richard;

import convertisseurobjet_roux_richard.Convertisseur;
import java.util.Scanner;

/**
 *
 * @author utilisateur
 */
public class ConvertisseurObjet_roux_richard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Convertisseur temp = new Convertisseur ();
        /* System.out.println(temp.CelciusVersFarenheit(55));
        System.out.println(temp.CelciusVersKelvin(55));
        System.out.println(temp.FarenheitVersCelcius(55));
        System.out.println(temp); */
        
        double valeurreelle;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bonjour, saisissez une valeur :");
        valeurreelle = sc.nextFloat();
        
        int rep;
        do { 
            rep = menu(); 
            switch (rep) {
                case 1:
                    System.out.println(temp.CelciusVersKelvin (valeurreelle));
                    break;
                case 2:
                    System.out.println(temp.KelvinVersCelcius (valeurreelle));
                    break;
                case 3: 
                    System.out.println(temp.FarenheitVersKelvin (valeurreelle));
                    break;
                case 4:
                    System.out.println(temp.CelciusVersFarenheit (valeurreelle));
                    break;
                case 5:
                    System.out.println(temp.KelvinVersFarenheit (valeurreelle));
                    break;
                case 6: 
                    System.out.println(temp.FarenheitVersKelvin (valeurreelle));
                    break;
                
                
                default:
                    System.out.println("Veuillez saisir un chiffre compris entre 1 et 6");
                    break;
            }
        } while (rep != 6); 
    System.out.println(temp);
    }
    
    public static int menu() {
        
        Scanner sc;
        int rep;
        sc = new Scanner(System.in);
        System.out.println("Saisissez la conversion que vous souhaiter effectuer::\n" + "1)De Celcius vers Kelvin\n" + "2)De Kelvin vers Celcius\n" + "3)De Fahrenheit vers Celcius\n" + "4)De Celcius ver Farenheit\n" + "5)De Kelvin vers Farenheit\n" + "6) De Farenheit vers Kelvin\n");
        System.out.println("\n Entrer le nombre :");
       
        
        
        rep = sc.nextInt();
        
        return rep;
    }
}
