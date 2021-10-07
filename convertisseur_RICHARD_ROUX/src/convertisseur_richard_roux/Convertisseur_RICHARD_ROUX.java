/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertisseur_richard_roux;

import java.util.Scanner;

/**
 *
 * @author richa
 *                        TP1
 * 
 * EXERCICE 2
 */                       

 
public class Convertisseur_RICHARD_ROUX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bonjour, Entrer une valeurs réelle:");
        double reponse = sc.nextFloat(); //On enregistre la réponse de l'utilisatuer et on la stock dans une variable
        //*System.out.println(reponse);
        System.out.println("Saisissez la conversion que vous souhaiter effectuer::\n" + "1)De Celcius vers Kelvin\n" + "2)De Kelvin vers Celcius\n" + "3)De Fahrenheit vers Celcius\n" + "4)De Celcius ver Farenheit\n" + "5)De Kelvin vers Farenheit\n" + "6) De Farenheit vers Kelvin\n");
        System.out.println("\n Entrer le nombre :");
        int indice = sc.nextInt(); //variable qui stock le choix de l'utilisateur parmis les propositions
        do {
            if (indice < (1) || indice > (6)) {
                System.out.print("Veuillez saisir un chiffre compris entre 1 et 6");
                System.out.println("\n Entrer le nombre :");
                indice = sc.nextInt();
            }
        } while (indice < (1) || indice > (6)); // Boucle qui redemande la saisie tant que l'utilisateur ne rentre pas un chiffre entre 1 et 6

        switch (indice) { // traitement des différentes conversions en fonction du choix de l'utilisateur avec appelle aux différentes fonctions
            case 1:
                double tempCelcius = reponse;
                double res = CelciusVersKelvin(tempCelcius);
                System.out.print((reponse)+" Celcius est égal à "+ (res)+ " Kelvin");
                break;
            case 2:
                double tempKelvin=reponse;
                 res= KelvinVersCelcius(tempKelvin);
                System.out.print((reponse)+" Kelvin est égal à "+ (res)+ " Celcius");
                break;
            case 3:
                double tempF=reponse;
                 res=FarenheitVersClecius(tempF);
                System.out.print((reponse)+" Farenheit est égal à"+ (res)+ " Celcius");
                break;
            case 4:
                 tempCelcius=reponse;
                res= CelciusVersFarenheit (tempCelcius);
                System.out.print((reponse)+" Celcius est égal à "+ (res)+ " Farenheit");
                break;
            case 5:
                tempKelvin=reponse;
                res= KelvinVersFarenheit (  tempKelvin);
                System.out.print((reponse)+" Kelvin est égal à "+ (res)+ " Farenheit");
                break;
            case 6:
                tempF=reponse;
                res= FarenheitVersKelvin ( tempF);
                System.out.print((reponse)+" Farenheit est égal à "+ (res)+ " Kelvin");
                break;
               
       
         /**
     * float convertisseur=(float) (reponse+273.15);
        System.out.print(convertisseur);**/
    }
    }
   
 public static double  CelciusVersKelvin ( double  tempCelcius) {
 double  tempKelvin=(double )(tempCelcius+273.15);
 return tempKelvin;
 
 }

 public static double   KelvinVersCelcius ( double  tempKelvin) {
double  tempC=(double ) (tempKelvin-273.15);
return tempC;
}
 public static double   FarenheitVersClecius( double  tempF) {
double  tempC=(tempF-32)*5/9;
return tempC;
}
 public static double  CelciusVersFarenheit  ( double  tempCelcius) {
double  tempF=(tempCelcius*9/5)+32;
return tempF;
}

 
public static double  KelvinVersFarenheit  ( double  tempKelvin) {
double tempF=( CelciusVersFarenheit(KelvinVersCelcius( tempKelvin))); // appelle à une double fonction
return tempF;
   

}
public static double  FarenheitVersKelvin  ( double  tempF) {
double tempKelvin=CelciusVersKelvin( FarenheitVersClecius( tempF));
return tempKelvin;


}
}
    
