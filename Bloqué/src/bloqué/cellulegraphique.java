/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloqué;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author richa
 */
public class cellulegraphique extends JButton {
    Carte celluleAssociee;


    
    public cellulegraphique (Carte uneCellule){
        celluleAssociee = uneCellule;
    }
    
    @Override 
    public void paintComponent (Graphics G){
        super.paintComponent(G);
        

        }

    }

            
