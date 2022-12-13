import Interfaces.Calcul;
import forme.Cercle;
import forme.Ellipse;
import forme.Forme;
import forme.Ligne;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.HashSet;

public class Dessin implements Calcul {

    private HashSet<Image> listeImages;
    private JPanel panelDessin;

    private final int nbImages = 4;
    private int compter = 0;
    private Border blackline = BorderFactory.createLineBorder(Color.black);

    public Dessin() {
        this.listeImages = new HashSet<Image>();
        for(int i=0; i<nbImages; i++){
            listeImages.add(new Image());
        }
        this.panelDessin = new JPanel();
        this.panelDessin.setLayout(new GridLayout(2, 2));
        this.panelDessin.setBorder(this.blackline);
    }

    public Dessin(HashSet<Image> listeImages) {
        this.listeImages = listeImages;
    }

    public HashSet<Image> getListeImages() {
        return listeImages;
    }

    public void setListeImages(HashSet<Image> listeImages) {
        this.listeImages = listeImages;
    }

    public JPanel getPanelDessin() {
        return panelDessin;
    }
    public JPanel changePanelDessin() {

        HashSet<Image> nouvelleListeImages = new HashSet<Image>();

        if(compter != 0){
            System.out.println("\nMODIFICATION\n");
            panelDessin.removeAll();
            for(Image image: listeImages){
                JPanel panel = new JPanel();
                panel.setLayout(new BorderLayout());
                panel.setBorder(blackline);
                Image nouvelleImage = new Image();
                nouvelleListeImages.add(nouvelleImage);
                panel.add(nouvelleImage,BorderLayout.CENTER);
                panelDessin.add(panel);
            }
            this.setListeImages(nouvelleListeImages);
        } else {
            System.out.println("\nCREATION\n");
            for(Image image: listeImages){
                JPanel panel = new JPanel();
                panel.setLayout(new BorderLayout());
                panel.setBorder(blackline);
                panel.add(image,BorderLayout.CENTER);
                panelDessin.add(panel);
            }
        }
        compter++;
        return panelDessin;
    }

    public void setPanelDessin(JPanel panelDessin) {
        this.panelDessin = panelDessin;
    }

    public JPanel getHomothetieDessin(){

        HashSet<Image> nouvelleListeImages = new HashSet<Image>();
        HashSet<Forme> nouvelleListeFormes = new HashSet<Forme>();

        if(panelDessin != null) {
            System.out.println("\nHomothetie\n");
            panelDessin.removeAll();
            for (Image image : listeImages) {
                JPanel panel = new JPanel();
                panel.setLayout(new BorderLayout());
                panel.setBorder(blackline);
                for(Forme forme: image.getListeFormes()){
                    forme.homothetie(200,200);
                    nouvelleListeFormes.add(forme);
                }
                image.setListeFormes(nouvelleListeFormes);
                nouvelleListeFormes = new HashSet<>();
                nouvelleListeImages.add(image);
                panel.add(image, BorderLayout.CENTER);
                panelDessin.add(panel);
            }
            this.setListeImages(nouvelleListeImages);
        }
        return panelDessin;

    }
    public JPanel getTranslationDessin(){

        HashSet<Image> nouvelleListeImages = new HashSet<Image>();
        HashSet<Forme> nouvelleListeFormes = new HashSet<Forme>();

        if(panelDessin != null) {
            System.out.println("\nTRANSLATION\n");
            panelDessin.removeAll();
            for (Image image : listeImages) {
                JPanel panel = new JPanel();
                panel.setLayout(new BorderLayout());
                panel.setBorder(blackline);
                for(Forme forme: image.getListeFormes()){
                    forme.translation(200,200);
                    nouvelleListeFormes.add(forme);
                }
                image.setListeFormes(nouvelleListeFormes);
                nouvelleListeFormes = new HashSet<>();
                nouvelleListeImages.add(image);
                panel.add(image, BorderLayout.CENTER);
                panelDessin.add(panel);
            }
            this.setListeImages(nouvelleListeImages);
        }
        return panelDessin;
    }
    public JPanel getRotationDessin(){

        HashSet<Image> nouvelleListeImages = new HashSet<Image>();
        HashSet<Forme> nouvelleListeFormes = new HashSet<Forme>();

        if(panelDessin != null) {
            System.out.println("\nRotation\n");
            panelDessin.removeAll();
            for (Image image : listeImages) {
                JPanel panel = new JPanel();
                panel.setLayout(new BorderLayout());
                panel.setBorder(blackline);
                for(Forme forme: image.getListeFormes()){
                    forme.rotation(200,200, 45);
                    nouvelleListeFormes.add(forme);
                }
                image.setListeFormes(nouvelleListeFormes);
                nouvelleListeFormes = new HashSet<>();
                nouvelleListeImages.add(image);
                panel.add(image, BorderLayout.CENTER);
                panelDessin.add(panel);
            }
            this.setListeImages(nouvelleListeImages);
        }
        return panelDessin;
    }
    public JPanel getSymetrieCentraleDessin(){

        HashSet<Image> nouvelleListeImages = new HashSet<Image>();
        HashSet<Forme> nouvelleListeFormes = new HashSet<Forme>();

        if(panelDessin != null) {
            System.out.println("\nSymetrie Centrale\n");
            panelDessin.removeAll();
            for (Image image : listeImages) {
                JPanel panel = new JPanel();
                panel.setLayout(new BorderLayout());
                panel.setBorder(blackline);
                for(Forme forme: image.getListeFormes()){
                    forme.symetrie_centrale(200,200);
                    nouvelleListeFormes.add(forme);
                }
                image.setListeFormes(nouvelleListeFormes);
                nouvelleListeFormes = new HashSet<>();
                nouvelleListeImages.add(image);
                panel.add(image, BorderLayout.CENTER);
                panelDessin.add(panel);
            }
            this.setListeImages(nouvelleListeImages);
        }
        return panelDessin;

    }
    public JPanel getSymetrieAxialeDessin(){

        HashSet<Image> nouvelleListeImages = new HashSet<Image>();
        HashSet<Forme> nouvelleListeFormes = new HashSet<Forme>();

        if(panelDessin != null) {
            System.out.println("\nSymétrie Axiale\n");
            panelDessin.removeAll();
            for (Image image : listeImages) {
                JPanel panel = new JPanel();
                panel.setLayout(new BorderLayout());
                panel.setBorder(blackline);
                for(Forme forme: image.getListeFormes()){
                    forme.symetrie_axiale(200,200);
                    nouvelleListeFormes.add(forme);
                }
                image.setListeFormes(nouvelleListeFormes);
                nouvelleListeFormes = new HashSet<>();
                nouvelleListeImages.add(image);
                panel.add(image, BorderLayout.CENTER);
                panelDessin.add(panel);
            }
            this.setListeImages(nouvelleListeImages);
        }
        return panelDessin;

    }
    public JPanel getTriParPerimetreDessin(){

        HashSet<Image> nouvelleListeImages = new HashSet<Image>();
        HashSet<Forme> nouvelleListeFormes = new HashSet<Forme>();

        if(panelDessin != null) {
            System.out.println("\nTri par Perimetre\n");
            panelDessin.removeAll();
            for (Image image : listeImages) {
                JPanel panel = new JPanel();
                panel.setLayout(new BorderLayout());
                panel.setBorder(blackline);
                for(Forme forme: image.getListeFormes()){
                    forme.symetrie_centrale(200,200); // --------------------------- A refaire quand la fonction Tri par Perimetre existera
                    nouvelleListeFormes.add(forme);
                }
                image.setListeFormes(nouvelleListeFormes);
                nouvelleListeFormes = new HashSet<>();
                nouvelleListeImages.add(image);
                panel.add(image, BorderLayout.CENTER);
                panelDessin.add(panel);
            }
            this.setListeImages(nouvelleListeImages);
        }
        return panelDessin;

    }
    public JPanel getTriParAireDessin(){

        HashSet<Image> nouvelleListeImages = new HashSet<Image>();
        HashSet<Forme> nouvelleListeFormes = new HashSet<Forme>();

        if(panelDessin != null) {
            System.out.println("\nTri par aire\n");
            panelDessin.removeAll();
            for (Image image : listeImages) {
                JPanel panel = new JPanel();
                panel.setLayout(new BorderLayout());
                panel.setBorder(blackline);
                for(Forme forme: image.getListeFormes()){
                    forme.symetrie_centrale(200,200); // ------------------------- A faire quand la fonction tri sera faite
                    nouvelleListeFormes.add(forme);
                }
                image.setListeFormes(nouvelleListeFormes);
                nouvelleListeFormes = new HashSet<>();
                nouvelleListeImages.add(image);
                panel.add(image, BorderLayout.CENTER);
                panelDessin.add(panel);
            }
            this.setListeImages(nouvelleListeImages);
        }
        return panelDessin;

    }

    @Override
    public double perimetre() {

        double p = 0;

        for(Image image: listeImages){
            p += image.perimetre();
        }
        System.out.println("Périmètre du dessin: " + p + "\n");
        return p;
    }

    @Override
    public double aire() {

        double a = 0;

        for(Image image: listeImages){
            a += image.aire();
        }
        System.out.println("Aire du dessin: " + a + "\n");
        return a;
    }
}
