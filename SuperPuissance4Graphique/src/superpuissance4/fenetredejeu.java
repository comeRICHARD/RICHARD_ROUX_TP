/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package superpuissance4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author richa
 */
public class fenetredejeu extends javax.swing.JFrame {

    /**
     * Creates new form fenetredejeu
     */
    Joueur ListesJoueurs[] = new Joueur[2]; // tu appelles ca liste alors que c'est un tableau. Correct nom serait "joueurs"
    Joueur JoueurCourant; // lower case pour la premiere letre
    Grille grilleJeu       = new Grille();
    public fenetredejeu() {
        initComponents();
        Panneau_info_joueur.setVisible(false);
        Panneau_info_partie.setVisible(false);
        for (int i=5 ; i>=0 ; i--){
            for (int j=0 ; j<7 ; j++){
                cellulegraphique cellGraph = new cellulegraphique(grilleJeu.cellulesJeu[i][j]);
                j1_nom.add(cellGraph);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        j1_nom = new javax.swing.JPanel();
        Panneau_creation_partie = new javax.swing.JPanel();
        nom_joueur1 = new javax.swing.JLabel();
        nom_joueur2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        btn_start = new javax.swing.JButton();
        Panneau_info_joueur = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        j2_couleur = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        j2_desintegrateur = new javax.swing.JLabel();
        j2_nom = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        j1_couleur1 = new javax.swing.JLabel();
        j1_desintegrateur1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        j1_nom2 = new javax.swing.JLabel();
        Panneau_info_partie = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcourant = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btn_col0 = new javax.swing.JButton();
        btn_col1 = new javax.swing.JButton();
        btn_col2 = new javax.swing.JButton();
        btn_col3 = new javax.swing.JButton();
        btn_col4 = new javax.swing.JButton();
        btn_col5 = new javax.swing.JButton();
        btn_col6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        j1_nom.setBackground(new java.awt.Color(255, 255, 255));
        j1_nom.setLayout(new java.awt.GridLayout(6, 7));
        getContentPane().add(j1_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 672, 576));

        Panneau_creation_partie.setBackground(new java.awt.Color(102, 255, 255));
        Panneau_creation_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nom_joueur1.setText("Nom joueur 1 :");
        Panneau_creation_partie.add(nom_joueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        nom_joueur2.setText("Nom joueur 2 :");
        Panneau_creation_partie.add(nom_joueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        Panneau_creation_partie.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 80, -1));
        Panneau_creation_partie.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 80, -1));

        btn_start.setText("Commencer partie");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        Panneau_creation_partie.add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        getContentPane().add(Panneau_creation_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 290, 130));

        Panneau_info_joueur.setBackground(new java.awt.Color(102, 255, 255));
        Panneau_info_joueur.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("couleur :");
        Panneau_info_joueur.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel3.setText("desintegrateurs :");
        Panneau_info_joueur.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        j2_couleur.setText("couleurjoueur2");
        Panneau_info_joueur.add(j2_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        jLabel5.setText("joueur 2 :");
        Panneau_info_joueur.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        j2_desintegrateur.setText("desintegrateurjoueur2");
        Panneau_info_joueur.add(j2_desintegrateur, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        j2_nom.setText("nomjoueur2");
        Panneau_info_joueur.add(j2_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));
        Panneau_info_joueur.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 250, -1));

        jLabel4.setText("couleur :");
        Panneau_info_joueur.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel6.setText("desintegrateurs :");
        Panneau_info_joueur.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        j1_couleur1.setText("couleurjoueur1");
        Panneau_info_joueur.add(j1_couleur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        j1_desintegrateur1.setText("desintegrateurjoueur1");
        Panneau_info_joueur.add(j1_desintegrateur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        jLabel8.setText("INFO JOUEUR :");
        Panneau_info_joueur.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel9.setText("joueur 1 :");
        Panneau_info_joueur.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        j1_nom2.setText("nomjoueur1");
        Panneau_info_joueur.add(j1_nom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        getContentPane().add(Panneau_info_joueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, 290, 300));

        Panneau_info_partie.setBackground(new java.awt.Color(102, 255, 255));
        Panneau_info_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("INFO JEU :");
        Panneau_info_partie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel7.setText("joueurcourant");
        Panneau_info_partie.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jcourant.setText("nomjoueurcourant");
        Panneau_info_partie.add(jcourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        Panneau_info_partie.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 56, 280, 60));

        getContentPane().add(Panneau_info_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, 290, 120));

        btn_col0.setText("1");
        getContentPane().add(btn_col0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        btn_col1.setText("2");
        getContentPane().add(btn_col1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 20, -1, -1));

        btn_col2.setText("3");
        btn_col2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col2, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 20, -1, -1));

        btn_col3.setText("4");
        btn_col3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col3, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 20, -1, -1));

        btn_col4.setText("5");
        getContentPane().add(btn_col4, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 20, -1, -1));

        btn_col5.setText("6");
        btn_col5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        btn_col6.setText("7");
        getContentPane().add(btn_col6, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 20, -1, -1));

        setBounds(0, 0, 1044, 701);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_col2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col2ActionPerformed

    private void btn_col3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col3ActionPerformed

    private void btn_col5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col5ActionPerformed

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        Panneau_info_joueur.setVisible(true);
        Panneau_info_partie.setVisible(true);
        initialiserPartie();
        j1_nom.repaint();
        btn_start.setEnabled(false);
    }//GEN-LAST:event_btn_startActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fenetredejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetredejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetredejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetredejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetredejeu().setVisible(true);
            }
        });
    }

    
    public void attribuerCouleursAuxJoueurs()
	{
	    // tu devrais utiliser un enum pour ROUGE-JAUNE
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
    
    public void initialiserPartie(){
    //On commence par vider la grille
		grilleJeu.viderGrille();
		//Cellule[][] CellulesJeu = new Cellule[6][7]; // "cellules" serait un nom plus correct
		
		//Entrée des noms
		
		String  nom_j1;
		String  nom_j2;
		

		String nomjoueur1  = nom_joueur1.getText();
		Joueur J1 = new Joueur(nomjoueur1);
                String nomjoueur2  = nom_joueur2.getText();
		Joueur J2 = new Joueur(nomjoueur2);
		
		ListesJoueurs[0] = J1;
		ListesJoueurs[1] = J2;
		
		//Attribution des couleurs
		
		attribuerCouleursAuxJoueurs();
                
                j1_nom2.setText(nomjoueur1);
                j2_nom.setText(nomjoueur2);
                j1_couleur1.setText(J1.Couleur);
                j2_couleur.setText(J2.Couleur);
                j1_desintegrateur1.setText(J1.nombreDesintegrateurs+"");
                j2_desintegrateur.setText(J2.nombreDesintegrateurs+"");

		
		// Attribution des Jetons
		
		for (int i = 0; i < 21; i++)
		{
			ListesJoueurs[0].ajouterJeton(new Jeton(ListesJoueurs[0].Couleur));
			ListesJoueurs[0].nombreJetonsRestants++;
			
			ListesJoueurs[1].ajouterJeton(new Jeton(ListesJoueurs[1].Couleur));
			ListesJoueurs[1].nombreJetonsRestants++;
		}
            
            //Placement des 5 trous noir
        Random r = new Random();
        boolean le_premier = r.nextBoolean();
        if (le_premier) {
            JoueurCourant = ListesJoueurs[0];
        } else {
            JoueurCourant = ListesJoueurs[1];
        }
            
            Random troualeat=new Random();
            int nbligne=6;
            int nbcolonne=7;
            
            jcourant.setText(JoueurCourant.nom);
            for (int nbrtrounoir=0;nbrtrounoir<5;){
                //do{
                int lignealeat=troualeat.nextInt(nbligne);
                int colonnealeat=troualeat.nextInt(nbcolonne);
                if(grilleJeu.placerTrouNoir(lignealeat, colonnealeat)){
                    nbrtrounoir++;
                }
               
            //}
            //while(!grilleJeu.placerTrouNoir(lignealeat, colonnealeat));
            }
                     
                
                
                
		
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panneau_creation_partie;
    private javax.swing.JPanel Panneau_info_joueur;
    private javax.swing.JPanel Panneau_info_partie;
    private javax.swing.JButton btn_col0;
    private javax.swing.JButton btn_col1;
    private javax.swing.JButton btn_col2;
    private javax.swing.JButton btn_col3;
    private javax.swing.JButton btn_col4;
    private javax.swing.JButton btn_col5;
    private javax.swing.JButton btn_col6;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel j1_couleur1;
    private javax.swing.JLabel j1_desintegrateur1;
    private javax.swing.JPanel j1_nom;
    private javax.swing.JLabel j1_nom2;
    private javax.swing.JLabel j2_couleur;
    private javax.swing.JLabel j2_desintegrateur;
    private javax.swing.JLabel j2_nom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel jcourant;
    private javax.swing.JLabel nom_joueur1;
    private javax.swing.JLabel nom_joueur2;
    // End of variables declaration//GEN-END:variables
}
