import Interfaces.Calcul;
import forme.Forme;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * Classe qui implémente les méthodes d'un dessin
 */
public class Dessin implements Calcul {

    private HashSet<Image> listeImages;
    private JPanel panelDessin;

    private final int nbImages = 4;
    private int compter = 0;
    private final Border blackline = BorderFactory.createLineBorder(Color.black);

    /**
     * Constructeur de la classe Dessin
     */
    public Dessin() {
        this.listeImages = new HashSet<Image>();
        for(int i=0; i<nbImages; i++){
            listeImages.add(new Image());
        }
        this.panelDessin = new JPanel();
        this.panelDessin.setLayout(new GridLayout(2, 2));
        this.panelDessin.setBorder(this.blackline);
    }

    /**
     * Constructeur de la classe Dessin
     * @param listeImages liste d'images
     */
    public Dessin(HashSet<Image> listeImages) {
        this.listeImages = listeImages;
    }

    /**
     * Récupère une liste d'images
     * @return listeImages une liste d'images
     */
    public HashSet<Image> getListeImages() {
        return listeImages;
    }

    /**
     * Modifie une liste d'images
     * @param listeImages liste d'images
     */
    public void setListeImages(HashSet<Image> listeImages) {
        this.listeImages = listeImages;
    }

    /**
     * Récupère un panel de dessin
     * @return un panel de dessin
     */
    public JPanel getPanelDessin() {
        return panelDessin;
    }

    /**
     * Initialise un nouveau panel
     * @return un panel
     */
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

    /**
     * Modifie un panel
     * @param panelDessin panel de dessin
     */
    public void setPanelDessin(JPanel panelDessin) {
        this.panelDessin = panelDessin;
    }

    /**
     * Applique l'homothétie sur le dessin
     */
    public void getHomothetieDessin(){
        if(panelDessin != null) {
            System.out.println("\nHomothetie\n");
            for (Image image : listeImages) {
                for(Forme forme: image.getListeFormes()){
                    forme.homothetie(200,200);
                }
            }
            panelDessin.revalidate();
            panelDessin.repaint();
        }
    }

    /**
     * Applique la translation sur le dessin
     */
    public void getTranslationDessin(){
        if(panelDessin != null) {
            System.out.println("\nTranslation\n");
            for (Image image : listeImages) {
                for(Forme forme: image.getListeFormes()){
                    forme.translation(200,200);
                }
            }
        }
        panelDessin.revalidate();
        panelDessin.repaint();
    }

    /**
     * Applique la rotation sur le dessin
     */
    public void getRotationDessin(){
        if(panelDessin != null) {
            System.out.println("\nRotation\n");
            for (Image image : listeImages) {
                for(Forme forme: image.getListeFormes()){
                    forme.rotation(200,200, 10);
                }
            }
        }
        panelDessin.revalidate();
        panelDessin.repaint();
    }

    /**
     * Applique la symétrie centrale sur le dessin
     */
    public void getSymetrieCentraleDessin(){
        if(panelDessin != null) {
            System.out.println("\nSymetrie Centrale\n");
            for (Image image : listeImages) {
                for(Forme forme: image.getListeFormes()){
                    forme.symetrie_centrale(200,200);
                }
            }
        }
        panelDessin.revalidate();
        panelDessin.repaint();
    }

    /**
     * Applique la symétrie axiale sur le dessin
     */
    public void getSymetrieAxialeDessin(){
        if(panelDessin != null) {
            System.out.println("\nSymétrie Axiale\n");
            for (Image image : listeImages) {
                for(Forme forme: image.getListeFormes()){
                    forme.symetrie_axiale(200,200);
                }
            }
        }
        panelDessin.revalidate();
        panelDessin.repaint();
    }

    /**
     * Applique le tri par périmètre sur le dessin
     */
    public void getTriParPerimetreDessin(){
        TreeSet tree = new TreeSet(listeImages);
        if(panelDessin != null) {
            System.out.println("\nTri par perimetre\n");
            tree.stream().sorted(Comparator.comparingDouble(Image::perimetre)).collect(Collectors.toCollection(TreeSet::new));
        }
        HashSet liste = new HashSet(tree);
        for(Object image: tree){
            System.out.println(image);
        }
        this.setListeImages(liste);
        panelDessin.revalidate();
        panelDessin.repaint();
    }

    /**
     * Applique le tri par aire sur le dessin
     */
    public void getTriParAireDessin(){
        if(panelDessin != null) {
            System.out.println("\nTri par aire\n");
            for (Image image : listeImages) {
                TreeSet tree = new TreeSet(listeImages);
                tree.stream().sorted(Comparator.comparingDouble(Image::aire)).collect(Collectors.toCollection(TreeSet::new));
            }
        }
        /*
        HashSet liste = new HashSet(tree);
        for(Image image: listeImages){
            System.out.println(image.toString());
            System.out.println(image.aire());
        }
        this.setListeImages(liste);
        */
        panelDessin.revalidate();
        panelDessin.repaint();
    }

    /**
     * Permet de copier l'image 1 et de remplacer l'image 4 par cette copie
     */
    public void getCopieImage(){
        if(panelDessin != null) {
            System.out.println("\nCopie de l'image en cours ...\n");
            List<Image> liste = new ArrayList<>(listeImages);
            HashSet<Forme> nouvelleListeFormes = new HashSet<Forme>();
            for(Forme forme: liste.get(0).getListeFormes()){
                nouvelleListeFormes.add(forme);
            }
            liste.get(3).setListeFormes(nouvelleListeFormes);
            System.out.println("\nCopie de l'image 1 sur l'image 4 effectuée !\n");
        }
        panelDessin.revalidate();
        panelDessin.repaint();
    }

    /**
     * Permet de copier-coller le dessin actuel sur lui-même
     */
    public void getCopieDessin(){
        if(panelDessin != null) {
            System.out.println("\nCopie du dessin en cours ...\n");
            this.setPanelDessin(this.getPanelDessin());
            System.out.println("\nCopie du dessin sur le dessin lui-même !\n");
        }
        panelDessin.revalidate();
        panelDessin.repaint();
    }

    /**
     * Calcule la somme des périmètres d'une liste d'images
     * @return  somme des périmètres d'une liste d'images
     */
    @Override
    public double perimetre() {

        double p = 0;

        for(Image image: listeImages){
            p += image.perimetre();
        }
        System.out.println("Périmètre du dessin: " + p + "\n");
        return p;
    }

    /**
     * Calcule la somme des aires d'une liste d'images
     * @return  somme des aires des formes d'une liste d'images
     */
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