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
            compter++;
        } else {
            System.out.println("\nCREATION\n");
            for(Image image: listeImages){
                JPanel panel = new JPanel();
                panel.setLayout(new BorderLayout());
                panel.setBorder(blackline);
                panel.add(image,BorderLayout.CENTER);
                panelDessin.add(panel);
            }
            compter++;
        }
        return panelDessin;
    }

    public void setPanelDessin(JPanel panelDessin) {
        this.panelDessin = panelDessin;
    }

    public void getHomothetieDessin(){

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
                nouvelleListeImages.add(image);
                panel.add(image, BorderLayout.CENTER);
                panelDessin.add(panel);
            }
            this.setListeImages(nouvelleListeImages);
        }
        return panelDessin;
    }
    public void getRotationDessin(){

    }
    public void getSymetrieCentraleDessin(){

    }
    public void getSymetrieAxialeDessin(){

    }
    public void getTriParPerimetreDessin(){

    }
    public void getTriParAireDessin(){

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
