package superpuissance4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author richa
 */
public class Joueur
{
    // mets tout en private avec des getter/setter
    
	String nom;
	String Couleur;
	
	// ce serait mieux d'utiliser une ArrayList. Comme ca tu peux faire add et remove dessus
    // comme ca tu peux virer nombreJetonsRestants
    // List<Jeton> jetons = new ArrayList<>();
    // Jeton remove = jetons.remove(0);
    // jetons.size()
    
	Jeton  ListeJetons[] = new Jeton[21]; // jetons serait un meilleur nom 
	int    nombreDesintegrateurs;
	int    nombreJetonsRestants;
	
	public Joueur(String unnom)
	{
		nom = unnom;
	}
	
	// cette methode n'est jamais utilisee
	public void affecterCouleur(String unecouleur)
	{
		Couleur = unecouleur;
	}
	
	// j est reserve pour nommer les variables dans un boucle for. Renomme le en jeton
	public boolean ajouterJeton(Jeton jeton)
	{
	    // avec une liste, tout ce que tu as à faire ici est 
        // jetons.add(j)
        // de plus la methode pourrait etre void plutot que retourner boolean
	    
		for (int i = 0; i < ListeJetons.length; i++)
		{
			if (ListeJetons[i] == null)
			{
				ListeJetons[i] = jeton;
				return true;
			}
			
		}
		return false;
	}
	
	public void ObtenirDesintegrateurs()
	{
		nombreDesintegrateurs += 1;
	}
	
	public boolean utiliserDesintegrateur()
	{
		if (nombreDesintegrateurs != 0)
		{
			nombreDesintegrateurs -= 1;
			return true;
		}
        
        return false;
	}
}  