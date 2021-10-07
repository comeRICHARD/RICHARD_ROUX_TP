/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manipnombresint_richard_roux;

import java.util.Scanner;

/**
 *
 * @author richa
 * 04/10/2021
 *                      TP1-SYNTAXE DE BASE
 * 
 * EXO 1 SAISIE ET MANIPULATION
 */
public class ManipNombresint_RICHARD_ROUX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int nombre1;
        int nombre2;
        
        System.out.println("Bonjour, veuillez rentrer deux entiers :");
        System.out.println("Choississez un nombre :");
        nombre1 = sc.nextInt();
        System.out.println("Choississez un nombre :");
        nombre2 = sc.nextInt();
        System.out.println("Voici tes nombres");
        System.out.println(nombre1);
        System.out.println(nombre2);
        int Somme = nombre1 + nombre2;
        int Soustraction = nombre1 - nombre2;
        int Multiplication = nombre1*nombre2;
        System.out.println("Voici la somme de tes nombres" +  Somme );
        System.out.println("Voici la Soustraction de tes nombres" +  Soustraction );
        System.out.println("Voici la Multiplication de tes nombres" + Multiplication );
        int quotient_entier = nombre1/nombre2;
        double reste_div = nombre1%nombre2;
        System.out.println("Voici le quotient entier de tes nombres" + quotient_entier );
        System.out.println("Voici le reste de la div eucli de tes nombres" + reste_div );

    }
    
}
