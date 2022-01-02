
package Bloqué;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author richa
 */
public class Bloqué_Graphique {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bloqué_Graphique");
        frame.setPreferredSize(new Dimension(800 , 800));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLayout(new FlowLayout(FlowLayout.RIGHT));
        //frame.setLayout(new GridLayout(2 ,2)); 
        frame.setLayout(new BorderLayout());
        
        
        
        JPanel centerPanel = new JPanel(new GridLayout(2, 1)); 
        centerPanel.setBorder(BorderFactory.createTitledBorder("Bloqué"));
        centerPanel.setBackground(Color.lightGray);
        frame.add(centerPanel , BorderLayout.CENTER);
        
        JPanel GrillePanel = new JPanel();
        GrillePanel.setBorder(BorderFactory.createTitledBorder("Grille"));
        GrillePanel.setBackground(Color.green);
        centerPanel.add(GrillePanel);
        
        
        JButton button1 = new JButton("START");
        button1.setPreferredSize(new Dimension (200 , 100));

        ActionListener monListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            JButton sourceButton = (JButton) e.getSource();
            sourceButton.setBackground(Color.blue);
            GrillePanel.remove(button1);
            frame.repaint();
            
            // GrillePanel.revalidate();
            
    }
        };
        button1.addActionListener(monListener);       
        GrillePanel.add(button1);
        
       
        
        
        
        
        frame.pack();     
        frame.setVisible(true);
        
        
    }
    
}
