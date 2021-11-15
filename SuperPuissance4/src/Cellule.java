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
    public boolean presenceTrouNoir(){
        if(trounoir==true){
            return true;
        }else{
            return false;
        }
    }
    public boolean Desintegrateur(){
        if(desintegrateur==true){
            return true;
        }else{
            return false;
        }
        
    }
    public String lireCouleurDuJeton(){
        if(jetonCourant==null){          
            return "vide";
        }else{
            return jetonCourant.lireCouleur();
        }
    }
    public boolean recupererDesintegrateur(){
        if(desintegrateur==true){
            desintegrateur=false;
            return true;
        }else{
            return false;
        }
    }
    public boolean activerTrouNoir(){
        if(trounoir==true){
            trounoir=false;
            jetonCourant=null;
            return true;
        }else{
            return false;
        }
    }
}
