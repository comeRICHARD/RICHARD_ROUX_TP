package superpuissance4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author richa
 */
public class Grille
{
    public static final int NOMBRE_DE_LIGNES = 6;
    public static final int NOMBRE_DE_COLONNES = 7;
    
    // cellules serait un meilleur nom
    private Cellule[][] cellulesJeu = new Cellule[NOMBRE_DE_LIGNES][NOMBRE_DE_COLONNES]; // variables commencent toujours par une minuscule
	
	public Grille()
	{
		for (int i = 0; i < NOMBRE_DE_LIGNES; i++)
		{
			for (int j = 0; j < NOMBRE_DE_COLONNES; j++)
			{
				cellulesJeu[i][j] = new Cellule();
			}
		}
	}
	
	public boolean etreRemplie()
	{
		for (int i = 0; i < NOMBRE_DE_LIGNES; i++)
		{
			for (int j = 0; j < NOMBRE_DE_COLONNES; j++)
			{
				if (cellulesJeu[i][j].jetonCourant == null)
				{
					return false;
				}
			}
		}
		
		return true;
	}
	
	public boolean Colonneremplie(int numColonne){
	
		if (cellulesJeu[5][numColonne].jetonCourant!=null){
                return true;
            }else{
                return false;
            }
	}
	
	public boolean ajouterJetonDansColonne(Jeton j, int num_colonne) // c'est mieux de nommer numColonne
	{
		int k = 0;
		if (Colonneremplie(num_colonne)) 
		{
			return false;
		}
		
		while (cellulesJeu[k][num_colonne].jetonCourant != null)
		{
			k++;
		}
		cellulesJeu[k][num_colonne].affecterJeton(j);
		
		if (cellulesJeu[k][num_colonne].Desintegrateur())
		{
			cellulesJeu[k][num_colonne].recupererDesintegrateur();
			//jetonCourant.nombreDesintegrateurs++;
		}
		
		if (cellulesJeu[k][num_colonne].presenceTrouNoir())
		{
			cellulesJeu[k][num_colonne].activerTrouNoir();
		}
		
		return true;
	}
	
	public void viderGrille()
	{
		for (int i = 0; i < NOMBRE_DE_LIGNES; i++)
		{
			for (int j = 0; j < NOMBRE_DE_COLONNES; j++)
			{
				cellulesJeu[i][j].jetonCourant = null;
			}
		}
	}
	
	public void afficherGrilleSurConsole()
	{
		for (int i = 5; i >= 0; i--)
		{
			System.out.println();
			for (int j = 0; j < NOMBRE_DE_COLONNES; j++)
			{
				
				if (celluleOccupee(i, j))
				{// Cas ou il y a un jeton dans la cellule
					if (lireCouleurDuJeton(i, j) == "Rouge")
					{
						System.out.print("\u001B[31m  0  ");
                                                //On print un O rouge
					}
					else
					{
						System.out.print("\u001B[33m  0  ");
                                                //On print un O en jaune
					}
					
				}
				else if (cellulesJeu[i][j].Desintegrateur())
				{// Si il y a la présence d'un désintégrateur
					if (cellulesJeu[i][j].presenceTrouNoir())
					{
						System.out.print("\u001B[0m | T | "); //On mets le trou noir devant le désintegrateur 
					}
					else
					{
						System.out.print("\u001B[0m | D | ");// On affiche le désintégrateurs
					}
				}
				
				else if (cellulesJeu[i][j].presenceTrouNoir() )
				{
					System.out.print("\u001B[0m | T | ");
				}
				else
				{
					System.out.print("| _ |");
				}
			}
		}
	}
	
	public boolean celluleOccupee(int num_ligne, int num_colone)
	{
		return cellulesJeu[num_ligne][num_colone].jetonCourant != null;
	}
	
	public String lireCouleurDuJeton(int num_ligne, int num_colone)
	{
		return cellulesJeu[num_ligne][num_colone].lireCouleurDuJeton();
	}
	
	public boolean etreGagnantePourJoueur(Joueur joueur)
	{
		String Cj = joueur.Couleur; // lower case pour la premiere lettre de la variable
		
		//Verifiaction des lignes
		for (int i = 0; i <= 5; i++)
		{
			for (int j = 0; j <= 3; j++)
			{
			    // source d'erreur. tu utilises == pour comparer des string alors qu'il faut utiliser stringA.equals(stringB)
			    
				if (cellulesJeu[i][j] != null && cellulesJeu[i][j].lireCouleurDuJeton().equals(Cj)
					&& cellulesJeu[i][j + 1] != null && cellulesJeu[i][j + 1].lireCouleurDuJeton().equals(Cj)
					&& cellulesJeu[i][j + 2] != null && cellulesJeu[i][j + 2].lireCouleurDuJeton().equals(Cj)
					&& cellulesJeu[i][j + 3] != null && cellulesJeu[i][j + 3].lireCouleurDuJeton().equals(Cj))
				{
					return true;
				}
				
			}
			
		}
		//Verification des colonnes
		for (int i = 0; i <= 2; i++)
			for (int j = 0; j <= 6; j++)
			{
				if (cellulesJeu[i][j] != null && cellulesJeu[i][j].lireCouleurDuJeton().equals(Cj)
					&& cellulesJeu[i+1][j] != null && cellulesJeu[i+1][j].lireCouleurDuJeton().equals(Cj)
					&& cellulesJeu[i+2][j] != null && cellulesJeu[i+2][j].lireCouleurDuJeton().equals(Cj)
					&& cellulesJeu[i+3][j] != null && cellulesJeu[i+3][j].lireCouleurDuJeton() .equals(Cj))
				{
					return true;
				}
				
			}
		
		//Verification des diagonales vers le haut
		for (int i = 0; i <= 2; i++)
		{
			for (int j = 0; j <= 3; j++)
			{
				if (cellulesJeu[i][j] != null && cellulesJeu[i][j].lireCouleurDuJeton() .equals(Cj)
					&& cellulesJeu[i+1][j+1] != null && cellulesJeu[i+1][j + 1].lireCouleurDuJeton() .equals(Cj)
					&& cellulesJeu[i+2][j+2] != null && cellulesJeu[i+2][j + 2].lireCouleurDuJeton().equals(Cj)
					&& cellulesJeu[i+3][j+3] != null && cellulesJeu[i+3][j + 3].lireCouleurDuJeton() .equals(Cj))
				{
					return true;
				}
				
			}
		}
		
		//Verification des diagonales vers le bas
		for (int i = 3; i <= 5; i++)
		{
			for (int j = 0; j <= 3; j++)
			{
				if (cellulesJeu[i][j] != null && cellulesJeu[i][j].lireCouleurDuJeton() == Cj
					&& cellulesJeu[i-1][j + 1] != null && cellulesJeu[i-1][j + 1].lireCouleurDuJeton() .equals(Cj)
					&& cellulesJeu[i-2][j + 2] != null && cellulesJeu[i-2][j + 2].lireCouleurDuJeton().equals(Cj)
					&& cellulesJeu[i-3][j + 3] != null && cellulesJeu[i-3][j + 3].lireCouleurDuJeton() .equals(Cj))
				{
					return true;
				}
			}
			
		}
		return false;
	}
	
	public Boolean supprimerJeton(int num_ligne, int num_colonne)
	{
		if (cellulesJeu[num_ligne][num_colonne].jetonCourant == null)
		{
		   
			return false;
		}
        
        cellulesJeu[num_ligne][num_colonne].jetonCourant = null;
        return true;
	}
	
	public boolean colonneRemplie(int num_colonne)
	{
	    // tout ca peut etre remplace par 
        // return cellulesJeu[5][num_colonne].jetonCourant != null
		
		if (cellulesJeu[5][num_colonne].jetonCourant == null)
			return false;
		
		return true;
	}
	
	public void tasserGrille(int num_colonne)
	{
		for (int i = 0; i < NOMBRE_DE_COLONNES; i++)
		{
			for (int j = 0; j < NOMBRE_DE_LIGNES; i++)
			{
				if (i == 5)
				{
					cellulesJeu[i][num_colonne].jetonCourant = null;
				}
				else
				{
					if (cellulesJeu[i][num_colonne].jetonCourant == null)
					{
						cellulesJeu[i][num_colonne].jetonCourant = cellulesJeu[i + 1][num_colonne].jetonCourant;
						cellulesJeu[i + 1][num_colonne].jetonCourant = null;
					}
				}
			}
		}
	}
}
       
       
           
        
           
        
