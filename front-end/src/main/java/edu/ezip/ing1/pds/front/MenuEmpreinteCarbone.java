package edu.ezip.ing1.pds.front;

import javax.swing.*;
import java.awt.*;

class MenuEmpreinteCarbone{
    //Boutons :
    JButton boutonConfirmer;
    //Constructeur :
    public MenuEmpreinteCarbone(){
        //Paramétrages de base :
        JFrame menuEmpreinteCarbone = new JFrame();
        menuEmpreinteCarbone.setTitle("Home UC2 - Empreinte Carbone");
        menuEmpreinteCarbone.setSize(Template.LONGUEUR, Template.LARGEUR);
        menuEmpreinteCarbone.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuEmpreinteCarbone.setLocationRelativeTo(null);
        menuEmpreinteCarbone.setResizable(false);

        //----------panel header--------------
        Methodes.header(menuEmpreinteCarbone, "Trouvez votre article :", 365);

        //----------panel principal--------------
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(Color.decode(Template.COULEUR_PRINCIPALE));
        menuEmpreinteCarbone.getContentPane().add(BorderLayout.CENTER, mainPanel);

        //----------panel secondaire--------------
        //JPanel secondPanel = new JPanel();
        RoundedPanel secondPanel = new RoundedPanel(60,60);
        secondPanel.setLayout(null);
        secondPanel.setBackground(Color.decode(Template.COUELUR_SECONDAIRE));
        //secondPanel.setSize(new Dimension(30, 100));
        secondPanel.setBounds(100, 100, 800, 350);

        //Ajout du JLabel :
        String titreLabelSecondaire = "Entrez la référence de votre produit pour savoir où il se trouve :";
        JLabel titrePanelSecondaire = new JLabel(titreLabelSecondaire);
        titrePanelSecondaire.setForeground(Color.WHITE);
        titrePanelSecondaire.setFont(new Font("Avenir", Font.BOLD, 22));
        titrePanelSecondaire.setBounds(55, 25, 760, 80);
        secondPanel.add(titrePanelSecondaire);

        //Ajout de la search bar :
        JTextField searchBar = new RoundJTextField(100);
        searchBar.setBounds(80, 150, 650, 40);
        boutonConfirmer = new JButton("Valider");
        boutonConfirmer.setBounds(360,230, 80, 30);
        secondPanel.add(searchBar);
        secondPanel.add(boutonConfirmer);

        mainPanel.add(secondPanel);

        menuEmpreinteCarbone.setVisible(true);
    }
}