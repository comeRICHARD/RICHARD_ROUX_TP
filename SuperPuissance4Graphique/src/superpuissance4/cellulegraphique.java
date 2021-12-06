/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superpuissance4;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author richa
 */
public class cellulegraphique extends JButton {
    Cellule celluleAssociee;
    ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/images/celluleVide.png"));
    ImageIcon img_desint = new javax.swing.ImageIcon(getClass().getResource("/images/desintegrateur.png"));
    ImageIcon img_jetonJaune = new javax.swing.ImageIcon(getClass().getResource("/images/jetonJaune.png"));
    ImageIcon img_jetonRouge = new javax.swing.ImageIcon(getClass().getResource("/images/jetonRouge.png"));
    ImageIcon img_trouNoir = new javax.swing.ImageIcon(getClass().getResource("/images/trouNoir.png"));


    
    public cellulegraphique (Cellule uneCellule){
        celluleAssociee = uneCellule;
    }
    
    @Override 
    public void paintComponent (Graphics G){
        super.paintComponent(G);
        if (celluleAssociee.presenceTrouNoir()){
                    setIcon(img_trouNoir); 

        }else if (celluleAssociee.Desintegrateur()){
                    setIcon(img_desint); 
            
        }else {
            String couleur_jeton = celluleAssociee.lireCouleurDuJeton();
            switch (couleur_jeton){
                case "Jaune" :
                    setIcon(img_jetonJaune); 

                    break;
                case "Rouge":
                    setIcon(img_jetonRouge); 

                    break;
                case "vide":
                    setIcon(img_vide); 

                    break;
            }
            

        }

    }
}
            
