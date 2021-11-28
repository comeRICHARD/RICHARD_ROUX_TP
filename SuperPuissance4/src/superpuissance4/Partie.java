/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superpuissance4;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author richa
 */
public class Partie
{
    // normalement, toutes ces variables doivent etre "private"
	
	Joueur ListesJoueurs[] = new Joueur[2]; // tu appelles ca liste alors que c'est un tableau. Correct nom serait "joueurs"
	Joueur JoueurCourant; // lower case pour la premiere letre
	Grille grilleJeu       = new Grille();
	
	public void initialiserPartie()
	{
		
		//On commence par vider la grille
		grilleJeu.viderGrille();
		//Cellule[][] CellulesJeu = new Cellule[6][7]; // "cellules" serait un nom plus correct
		
		//Entrée des noms
		Scanner sc = new Scanner(System.in);
		String  nom_j1;
		String  nom_j2;
		
		System.out.println("Joueur 1: Entrez votre nom");
		nom_j1 = sc.nextLine();
		System.out.println("Joueur 2: Entrez votre nom"); // n'oublis as de gerer si les deux rentrent le meme nom
		nom_j2 = sc.nextLine();
		
		Joueur joueur_1 = new Joueur(nom_j1);
		Joueur joueur_2 = new Joueur(nom_j2);
		ListesJoueurs[0] = joueur_1;
		ListesJoueurs[1] = joueur_2;
		
		//Attribution des couleurs
		
		attribuerCouleursAuxJoueurs();
		
		// Attribution des Jetons
		
		for (int i = 0; i < 21; i++)
		{
			ListesJoueurs[0].ajouterJeton(new Jeton(ListesJoueurs[0].Couleur));
			ListesJoueurs[0].nombreJetonsRestants++;
			
			ListesJoueurs[1].ajouterJeton(new Jeton(ListesJoueurs[1].Couleur));
			ListesJoueurs[1].nombreJetonsRestants++;
		}
            
            //Placement des 5 trous noir
                
            Random troualeat=new Random();
            int nbligne=6;
            int nbcolonne=7;
            
            for (int j=0;j<5;j++){
                //do{
                int lignealeat=troualeat.nextInt(nbligne);
                int colonnealeat=troualeat.nextInt(nbcolonne);
                grilleJeu.placerTrouNoir(lignealeat, colonnealeat);
               
            //}
            //while(!grilleJeu.placerTrouNoir(lignealeat, colonnealeat));
            }
                     
                
                
                
		
	}
        
        
	public void attribuerCouleursAuxJoueurs()
	{
	    
		int      n1;
		String[] tableauc = { "Rouge", "Jaune" };
		Random   caleat   = new Random();
		int      valaleat = caleat.nextInt(1);
		n1 = valaleat;
		if (n1 == 0)
		{
			ListesJoueurs[0].Couleur = tableauc[n1];
			ListesJoueurs[1].Couleur = tableauc[1];
			
		}
		else
		{
			ListesJoueurs[0].Couleur = tableauc[n1];
			ListesJoueurs[1].Couleur = tableauc[0];
		}
		
		System.out.println(ListesJoueurs[0].nom + " vous etes de couleur " + ListesJoueurs[0].Couleur);
		System.out.println(ListesJoueurs[1].nom + " vous etes de couleur " + ListesJoueurs[1].Couleur);
		
	}
	
	public void debuterPartie()
	{
		//déclaration des variables
		boolean colonnepleine = true;
		int     num_colonne;
                int num_ligne;
		Scanner sc            = new Scanner(System.in);
                int choixjoueur;
                
		
		initialiserPartie();
		
		JoueurCourant = ListesJoueurs[0];
		System.out.println();
		System.out.println(ListesJoueurs[0].nom + " vous etes le premier à jouer");
		
		
		//Boucle du jeu, il y a 3 possibilités soit joueur 1 gagne, joueur 2 gagne ou joueur 3 gagne
		while (grilleJeu.etreGagnantePourJoueur(ListesJoueurs[0]) != true && grilleJeu.etreGagnantePourJoueur(ListesJoueurs[1]) != true && grilleJeu.etreRemplie() != true)
		{
			grilleJeu.afficherGrilleSurConsole();
                        System.out.println();
                        System.out.println(JoueurCourant.nom + " Que souhaitez vous faire ?");
                        System.out.println("1/Jouer une jeton \n2/Récupérer un jeton");
                        choixjoueur=sc.nextInt();
						
				//déroulement de la partie
			
			if (choixjoueur==1){
			do
			{
				
				//Le joueur renseigne son coup
				System.out.println();
				System.out.println(JoueurCourant.nom + " Entrez un numéro de colonne entre 1 et 7");
				
				// Verification de Coup valide      
				num_colonne = sc.nextInt() - 1;
				
				//message d'erreur si le numéro de colonne n'est pas compris entre 1 et 6
				if (num_colonne < 0 || num_colonne > 6)
				{
					System.out.println("Veuillez entrer un nombre compris entre 1 et 7");
				}
				else
				{
                                    
                                        				
					//message d'erreur si le joueur veut ajouter un jeton alors que la colonne est pleine 
					colonnepleine = grilleJeu.colonneRemplie(num_colonne);
					if (grilleJeu.colonneRemplie(num_colonne) == true)
					{
						System.out.println("La Colonne est pleine, Choisissez une autre");
						
					}
                                    
				}
				
			}
			while (colonnepleine == true || num_colonne < 0 || num_colonne > 6);
			
                        //Dans le cas ou le joueur souhaite ajouter un jeton
                        
                            
			Jeton j = JoueurCourant.ListeJetons[JoueurCourant.nombreJetonsRestants - 1];
			grilleJeu.ajouterJetonDansColonne(j, num_colonne);
                        //On enlève au joueur un jeton 
			JoueurCourant.ListeJetons[JoueurCourant.nombreJetonsRestants - 1] = null;
			JoueurCourant.nombreJetonsRestants--;
                        }
                        //Dans le cas ou le joueur souhaite récupérer un jeton
                        else if(choixjoueur==2){
                            do{
                                
                            
                            System.out.println();
                            System.out.println("Renseignez les coordonnées du Jeton à récupérer");
                            System.out.println("Choix du numéro de ligne");
                            num_ligne=sc.nextInt();
                            System.out.println("Choix du numéro de colonne");
                            num_colonne=sc.nextInt();
                            
                            
                               if (grilleJeu.celluleOccupee(num_ligne, num_colonne)){
                                   
                                   
                               }
                            }while (grilleJeu.celluleOccupee(num_ligne, num_colonne)==false );
                            
                            
                        }
                        
                        
                        
                        
                        
                        
                        
                        
                        
			//Changement de tour des joueurs
			if (JoueurCourant == ListesJoueurs[0])
			{
				JoueurCourant = ListesJoueurs[1];
			}
			else
			{
				JoueurCourant = ListesJoueurs[0];
			}
			System.out.println();
                        System.out.println(JoueurCourant.nom + "C'est à votre tour de jouer");
                        
		}
                //cas ou le joueur 1 gagne
			if (grilleJeu.etreGagnantePourJoueur(ListesJoueurs[0]))
			{
				grilleJeu.afficherGrilleSurConsole();
                                System.out.println();
				System.out.println("C'est le joueur " + ListesJoueurs[0].nom + " qui a gagné");
				
				//cas ou le joueur 2 gagne
				
			}
			else if (grilleJeu.etreGagnantePourJoueur(ListesJoueurs[1]))
			{
				grilleJeu.afficherGrilleSurConsole();
                                System.out.println();
				System.out.println("C'est le joueur " + ListesJoueurs[1].nom + " qui a gagné");
				
				//cas ou la grille est pleine
				
			}
			else if (grilleJeu.etreRemplie())
			{
				grilleJeu.afficherGrilleSurConsole();
                                System.out.println();
				System.out.println("La grille est pleine");
                        }
        }
}
		
	
	

    
    
