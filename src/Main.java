import javax.swing.*;
import java.awt.*;

/**
 * Classe main du projet
 */
public class Main {

    public static void main(String[] args) {

        // Récupération de la taille de l'écran et définition de la hauteur et de la largeur
        Dimension tailleEcran = Toolkit.getDefaultToolkit().getScreenSize();
        int width = tailleEcran.width;
        int height = tailleEcran.height;

        // Création et définition de la fenêtre
        JFrame frame = new JFrame();
        frame.setSize(width/2, height/2);
        frame.setTitle("Patchwork");

        // Séparation de la fenêtre en deux parties
        JPanel panelPrincipal = new JPanel(new GridLayout(2,1));
        JPanel panelMenu = new JPanel(new GridLayout(2,1));

        /*
         Séparation et définition de la fenêtre supérieure en deux parties
         */

        // Première sous-partie
        JPanel sousPanelMenu_1 = new JPanel(new BorderLayout());
        JLabel label = new JLabel("PATCHWORK", JLabel.CENTER);
        label.setFont(new Font("Serif", Font.BOLD, 20));
        sousPanelMenu_1.add(label, BorderLayout.CENTER);

        // Deuxième sous-partie
        JPanel sousPanelMenu_2 = new JPanel();
        JButton btn_generer = new JButton( "Générer un dessin");
        JButton btn_homothetie = new JButton("Homothétie");
        JButton btn_translation = new JButton("Translation");
        JButton btn_rotation = new JButton("Rotation");
        JButton btn_symetrie_centrale = new JButton("Symétrie Centrale");
        JButton btn_symetrie_axiale = new JButton("Symetrie Axiale");
        JButton btn_tri_par_perimetre = new JButton("Tri par périmètre");
        JButton btn_tri_par_aire = new JButton("Tri par aire");

        /*
         Définition de la fenêtre inférieure
         */

        // Création d'un dessin
        Dessin dessin = new Dessin();

        // Ajout du panel de menu dans le panel principal
        panelPrincipal.add(panelMenu);

        // Ajout d'un dessin dans le panel principal
        panelPrincipal.add(dessin.changePanelDessin());

        btn_generer.addActionListener(e -> {
            panelPrincipal.remove(dessin.getPanelDessin());
            panelPrincipal.revalidate();
            panelPrincipal.repaint();
            panelPrincipal.add(dessin.changePanelDessin());
        });

        btn_homothetie.addActionListener(e -> {
            panelPrincipal.remove(dessin.getPanelDessin());
            panelPrincipal.add(dessin.getHomothetieDessin());
            panelPrincipal.revalidate();
            panelPrincipal.repaint();
        });

        btn_translation.addActionListener(e -> {
            panelPrincipal.remove(dessin.getPanelDessin());
            panelPrincipal.add(dessin.getTranslationDessin());
            panelPrincipal.revalidate();
            panelPrincipal.repaint();
        });

        btn_rotation.addActionListener(e -> {
            panelPrincipal.remove(dessin.getPanelDessin());
            panelPrincipal.add(dessin.getRotationDessin());
            panelPrincipal.revalidate();
            panelPrincipal.repaint();
        });

        btn_symetrie_centrale.addActionListener(e -> {
            panelPrincipal.remove(dessin.getPanelDessin());
            panelPrincipal.add(dessin.getSymetrieCentraleDessin());
            panelPrincipal.revalidate();
            panelPrincipal.repaint();

        });

        btn_symetrie_axiale.addActionListener(e -> {
            panelPrincipal.remove(dessin.getPanelDessin());
            panelPrincipal.add(dessin.getSymetrieAxialeDessin());
            panelPrincipal.revalidate();
            panelPrincipal.repaint();
        });

        btn_tri_par_perimetre.addActionListener(e -> {
            panelPrincipal.remove(dessin.getPanelDessin());
            panelPrincipal.add(dessin.getTriParPerimetreDessin());
            panelPrincipal.revalidate();
            panelPrincipal.repaint();
        });

        btn_tri_par_aire.addActionListener(e -> {
            panelPrincipal.remove(dessin.getPanelDessin());
            panelPrincipal.add(dessin.getTriParAireDessin());
            panelPrincipal.revalidate();
            panelPrincipal.repaint();
        });

        sousPanelMenu_2.add(btn_generer);
        sousPanelMenu_2.add(btn_homothetie);
        sousPanelMenu_2.add(btn_translation);
        sousPanelMenu_2.add(btn_rotation);
        sousPanelMenu_2.add(btn_symetrie_centrale);
        sousPanelMenu_2.add(btn_symetrie_axiale);
        sousPanelMenu_2.add(btn_tri_par_perimetre);
        sousPanelMenu_2.add(btn_tri_par_aire);

        panelMenu.add(sousPanelMenu_1);
        panelMenu.add(sousPanelMenu_2);
        frame.add(panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}