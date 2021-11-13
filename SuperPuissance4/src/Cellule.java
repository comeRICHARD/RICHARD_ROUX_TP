/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author richa
 */
public class Cellule{
        Jeton jetonCourant ; 
        boolean trounoir ; 
        boolean desintegrateur;
    
    public Cellule(){
      jetonCourant =null;
      trounoir = false;
      desintegrateur = false;
         
    }
    public boolean affecterJeton (Jeton j){
        if (jetonCourant==null){
            jetonCourant=j;
            return true;
        }else{
            return false;
            
        }
    }
    public void recupererJeton(){
        return;
    }
    
    public boolean supprimerJeton(){
        if (jetonCourant!= null){
            jetonCourant=null;
            return true;
        }else{
            return false;
        }    
    }
    public boolean placerTrouNoir(){
        if (trounoir == false){
            trounoir=true;
            return true;
        }else{
            return false;
        }
    }
    public boolean placerDesintegrateur(){
        if(desintegrateur == false){
            desintegrateur=true;
            return true;
        }else{
            return false;
        }
    }
    public void lireCouleurDuJeton(){
        
        return ;
    }
}
