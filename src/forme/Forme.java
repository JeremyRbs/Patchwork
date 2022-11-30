package forme;

import Interfaces.Calcul;

import javax.swing.*;

public abstract class Forme implements Calcul {

    private int x;
    private int y;
    private int width;
    private int height;

    private int [] tab_x;
    private int [] tab_y;

    public Forme(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Forme(int[] tab_x, int[] tab_y) {
        this.tab_x = tab_x;
        this.tab_y = tab_y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int[] getTab_x() {
        return tab_x;
    }

    public void setTab_x(int[] tab_x) {
        this.tab_x = tab_x;
    }

    public int[] getTab_y() {
        return tab_y;
    }

    public void setTab_y(int[] tab_y) {
        this.tab_y = tab_y;
    }

    /**
     * Transformation géométrique par agrandissement ou réduction
     * @param A
     * @param x
     * @param y
     * @return tableau de doubles
     */
    public abstract double [] homothetie(double A[], double x, double y);

    /**
     * Dans le plan cartésien,
     * une matrice de transformation est une matrice qui permet,
     * à partir des coordonnées d'un point initial représentées par une matrice colonne,
     * de trouver celles de son image par une transformation géométrique donnée.
     * @param A
     * @return tableau de doubles
     */
    public abstract double [] translation (double A[]);

    /**
     * En mathématiques, une matrice orthogonale de déterminant 1
     * @param C
     * @param A
     * @param angle
     * @return tableau de doubles
     */
    public abstract double [] rotation(double C[], double A[], double angle);

    /**
     * Fait tourner les figures de 180°
     * @param A
     * @return tableau de doubles
     */
    public abstract double [] symetrie_centrale(double A[]);

    /**
     * Transformation géométrique du plan qui modélise un « pliage » ou un « effet miroir »
     * @param A
     * @return tableau de doubles
     */
    public abstract double [] symetrie_axiale(double A[]);


}
