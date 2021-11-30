package superpuissance4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author richa
 */
public class Cellule
{
	// les parametres devraient etre private
	Jeton   jetonCourant;
	boolean trounoir       = false; 
	boolean desintegrateur = false;
	
	
	
	public boolean affecterJeton(Jeton j)
	{
		if (jetonCourant == null)
		{
			jetonCourant = j;
			return true;
		}
		
		return false;
	}
	
	public Jeton recupererJeton()
	{
		Jeton recupj = jetonCourant;
		jetonCourant = null;
		return recupj;
	}
	
	public boolean supprimerJeton()
	{
		if (jetonCourant != null)
		{
			jetonCourant = null;
			return true;
		}
        
        return false;
	}
	
	public boolean placerTrouNoir()
	{
		if (!trounoir) 
		{
			trounoir = true;
			return true;
		}
        
        return false;
	}
	
	public boolean placerDesintegrateur()
	{
		if (desintegrateur == false)
		{
			desintegrateur = true;
			return true;
		}
        
        return false;
	}
	
	
	public boolean presenceTrouNoir()
	{
		return trounoir;
	}
	
	
	public boolean Desintegrateur()
	{
		return desintegrateur;
	}
	
	public String lireCouleurDuJeton()
	{
		if (jetonCourant == null)
		{
			return "vide";
		}
        
        return jetonCourant.lireCouleur();
	}
	
	public boolean recupererDesintegrateur()
	{
	    
		if (desintegrateur)
		{
			desintegrateur = false;
			return true;
		}
        
        return false;
	}
	
	public boolean activerTrouNoir()
	{
		if (trounoir == true)
		{
			trounoir = false;
			jetonCourant = null;
			return true;
		}
        
        return false;
	}
        
        /*public boolean aUnJeton(int num_ligne , int num_colonne){
            if(celluleJeu.){
                return true;
            }
            return false;

}*/
}
