import Interfaces.Calcul;
import forme.*;

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;

public class Image extends JComponent implements Calcul {

    private HashSet<Forme> listeFormes;
    private int x;
    private int y;
    private int [] tab_x;
    private int [] tab_y;
    private int width;
    private int height;

    private int nbAleatoire;
    private int nbAleatoireTableau;

    public Image() {

        this.listeFormes = new HashSet<Forme>();

        for(int i=0; i<2; i++){

            this.nbAleatoire = (int) Math.round(Math.random() * (4 - 1 + 1) + 1);

            this.x = (int) Math.round(Math.random() * (10 - 0 + 1) + 0);
            this.y = (int) Math.round(Math.random() * (10 - 0 + 1) + 0);
            this.width = (int) Math.round(Math.random() * (50 - 10 + 1) + 10);
            this.height = (int) Math.round(Math.random() * (50 - 10 + 1) + 10);

            switch (nbAleatoire){
                case 1:
                    if(width!=height){
                        this.height = this.width;
                    }
                    listeFormes.add(new Cercle(x, y, width, height));
                    break;
                case 2:
                    listeFormes.add(new Ellipse(x,y,width,height));
                    break;
                case 3:
                    listeFormes.add(new Ligne(x,y,width,height));
                    break;
                case 4:
                    this.nbAleatoireTableau = 3;//(int) Math.round(Math.random() * (8 - 3 + 1) + 3);

                    this.tab_x= new int[nbAleatoireTableau];
                    this.tab_y= new int[nbAleatoireTableau];

                    for(int j=0;j<nbAleatoireTableau; j++){
                        tab_x[j] = (int) Math.round(Math.random() * (50 - 5 + 1) + 5);
                        tab_y[j] = (int) Math.round(Math.random() * (50 - 5 + 1) + 5);
                    }
                    listeFormes.add(new Polygone(tab_x,tab_y));
                    break;
                default:
                    break;
            }
        }
    }

    public Image(HashSet<Forme> listeFormes) {
        this.listeFormes = listeFormes;
    }

    public HashSet<Forme> getListeFormes() {
        return listeFormes;
    }

    public void setListeFormes(HashSet<Forme> listeFormes) {
        this.listeFormes = listeFormes;
    }

    public void paint(Graphics g){

        for(Forme forme: listeFormes) {

            if(forme instanceof Cercle || forme instanceof Ellipse) {
                g.drawOval(forme.getX(), forme.getY(), forme.getWidth(), forme.getHeight());
            }else if(forme instanceof Ligne){
                g.drawLine(forme.getX(), forme.getY(), forme.getWidth(), forme.getHeight());
            }else{
                g.drawPolygon(forme.getTab_x(),forme.getTab_y(),forme.getTab_x().length);
                g.fillPolygon(forme.getTab_x(),forme.getTab_y(),forme.getTab_x().length);
            }
        }
    }

    @Override
    public double perimetre() {

        double p = 0;

        for(Forme forme: listeFormes){
            p += forme.perimetre();
        }
        return p;
    }

    @Override
    public double aire() {

        double a = 0;

        for(Forme forme: listeFormes){
            a += forme.aire();
        }
        return a;
    }
}
