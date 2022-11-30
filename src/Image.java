import Interfaces.Calcul;
import forme.*;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Image extends JComponent implements Calcul {

    private List<Forme> listeFormes;
    private int x;
    private int y;
    private int [] tab_x;
    private int [] tab_y;
    private int width;
    private int height;

    private int nbAleatoire;
    private int nbAleatoireTableau;

    public Image() {

        this.listeFormes = new ArrayList<Forme>();

        for(int i=0; i<4; i++){

            this.nbAleatoire = (int) Math.round(Math.random() * (4 - 1 + 1) + 1);

            this.x = (int) Math.round(Math.random() * (100 - 0 + 1) + 0);
            this.y = (int) Math.round(Math.random() * (100 - 0 + 1) + 0);
            this.width = (int) Math.round(Math.random() * (250 - 50 + 1) + 50);
            this.height = (int) Math.round(Math.random() * (250 - 50 + 1) + 50);

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
                    this.nbAleatoireTableau = (int) Math.round(Math.random() * (8 - 3 + 1) + 3);

                    this.tab_x= new int[nbAleatoireTableau];
                    this.tab_y= new int[nbAleatoireTableau];

                    for(int j=0;j<nbAleatoireTableau; j++){
                        tab_x[j] = (int) Math.round(Math.random() * (150 - 5 + 1) + 5);
                        tab_y[j] = (int) Math.round(Math.random() * (150 - 5 + 1) + 5);
                    }
                    listeFormes.add(new Polygone(tab_x,tab_y));
                    break;
                default:
                    break;
            }
        }
    }

    public List<Forme> getListeFormes() {
        return listeFormes;
    }

    public void setListeFormes(List<Forme> listeFormes) {
        this.listeFormes = listeFormes;
    }

    public void paint(Graphics g){

        for(int i=0; i<listeFormes.size(); i++) {

            if(listeFormes.get(i) instanceof Cercle || listeFormes.get(i) instanceof Ellipse) {
                g.drawOval(listeFormes.get(i).getX(), listeFormes.get(i).getY(), listeFormes.get(i).getWidth(), listeFormes.get(i).getHeight());
            }else if(listeFormes.get(i) instanceof Ligne){
                g.drawLine(listeFormes.get(i).getX(), listeFormes.get(i).getY(), listeFormes.get(i).getWidth(), listeFormes.get(i).getHeight());
            }else{
                g.drawPolygon(listeFormes.get(i).getTab_x(),listeFormes.get(i).getTab_y(),listeFormes.get(i).getTab_x().length);
                g.fillPolygon(listeFormes.get(i).getTab_x(),listeFormes.get(i).getTab_y(),listeFormes.get(i).getTab_x().length);
            }
        }
    }

    @Override
    public double perimetre() {

        double p = 0;

        for(int i=0; i<listeFormes.size();i++){
            p += listeFormes.get(i).perimetre();
        }
        return p;
    }

    @Override
    public double aire() {

        double a = 0;

        for(int i=0; i<listeFormes.size();i++){
            a += listeFormes.get(i).aire();
        }
        return a;
    }
}
