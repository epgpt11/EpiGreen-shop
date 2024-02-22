package edu.ezip.ing1.pds.front;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

//Classe qui contient des méthodes pour initialiser les principaux élémenst des frames.
class Methodes{
    public static void header(JFrame frame, String titre, int x){
        //----------panel header : Logo + label titre--------------
        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(null);
        JLabel titreLabel = new JLabel(titre);
        titreLabel.setBounds(x, 13, 500, 50);
        ImageIcon logo = new ImageIcon("logo.png");
        JLabel logoLabel = new JLabel(logo);
        logoLabel.setBounds(10,8,70,70);
        headerPanel.add(logoLabel);

        titreLabel.setFont(new Font("Avenir", Font.BOLD, 24));
        titreLabel.setBorder(new EmptyBorder(25, 20, 0, 0));
        headerPanel.setBackground(Color.decode(Template.COULEUR_HEADER));
        headerPanel.setPreferredSize(new Dimension(Template.LONGUEUR,Template.HAUTEUR_HEADER));
        //headerPanel.add(logo);
        headerPanel.add(titreLabel);
        frame.getContentPane().add(BorderLayout.NORTH,headerPanel);
        //-----------------------------------------------
    }
}