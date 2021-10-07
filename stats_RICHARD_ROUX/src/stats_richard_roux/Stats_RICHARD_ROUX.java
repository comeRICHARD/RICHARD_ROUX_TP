/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stats_richard_roux;

import java.util.Scanner;

/**
 *
 * @author richa
 */
public class Stats_RICHARD_ROUX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        //Initialisation du tableau
        int tab[]= new int[6];
       
        //On remplit le tableau avec des "0"
        for(int ch:tab){
          tab[ch]=0;
          //System.out.println(tab[ch]);
          ch++;
         
    }
   
    float m;
     int compteur=1;
       
   
     System.out.println("Bonjour, veuillez rentrer un entier");
       
       m =sc.nextFloat();
     
        int p;
        p generateurAleat = new p();
        //Boucle qui permet d'incrémenter une case du tableau en fonction du tirage de l'utilisateur
        do{
        p = generateurAleat.nextInt(6);
        for(int i=0;i<m;i++){
            if(i==p){
                tab[i]+=1;
               
            }
            i++;
            }
        compteur++;
        }while(compteur>=m);
        int cpt=1;
        //Boucle servant à l'affichage du tableau à la fin des tirages
        do {
         System.out.println("face"+cpt +":"+ tab[cpt]);
         cpt++;
                }while(cpt<=5);
        //Boucle des pourcentages
        for(int e=0;e<tab.length;e++){
    System.out.print((tab[1]/p)*100+" ; ");
}
        }
   
   
       
}
        
        

         
        

    

