import Interfaces.Calcul;
import forme.Forme;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;

public class Dessin implements Calcul {

    private HashSet<Image> listeImages;
    private JPanel panelDessin;

    private final int nbImages = 4;
    private Border blackline = BorderFactory.createLineBorder(Color.black);

    public Dessin() {
        this.listeImages = new HashSet<Image>();
        for(int i=0; i<4; i++){
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

        if(panelDessin != null){
            panelDessin.removeAll();
        }

        for(int i=0; i<nbImages; i++){
            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());
            panel.setBorder(blackline);
            panel.add(new Image(),BorderLayout.CENTER);
            panelDessin.add(panel);
        }

        return panelDessin;
    }

    public void setPanelDessin(JPanel panelDessin) {
        this.panelDessin = panelDessin;
    }

    public void getHomothetieDessin(){

    }
    public void getTranslationDessin(){

        HashSet<Forme> listeTranslationFormes = new HashSet<Forme>();
        HashSet<Image> listeTranslationImages = new HashSet<Image>();

        for(Image image: listeImages){
            for(Forme forme: image.getListeFormes()){
                forme.translation(200,200);
                listeTranslationFormes.add(forme);
            }
            image.setListeFormes(listeTranslationFormes);
            listeTranslationImages.add(image);
            listeTranslationFormes.clear();
        }

        panelDessin.revalidate();
        panelDessin.repaint();

        //panelDessin.add(new Image(listeFormes));
        this.setListeImages(listeTranslationImages);
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
