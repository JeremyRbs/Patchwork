package forme;

import Interfaces.Calcul;

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
     */
    public abstract void homothetie(int width, int height);

    /**
     * Dans le plan cartésien,
     * une matrice de transformation est une matrice qui permet,
     * à partir des coordonnées d'un point initial représentées par une matrice colonne,
     * de trouver celles de son image par une transformation géométrique donnée.
     */
    public abstract void translation (int width, int height);

    /**
     * En mathématiques, une matrice orthogonale de déterminant 1
     */
    public abstract void rotation(int width, int height);

    /**
     * Fait tourner les figures de 180°
     */
    public abstract void symetrie_centrale(int width, int height);

    /**
     * Transformation géométrique du plan qui modélise un « pliage » ou un « effet miroir »
     */
    public abstract void symetrie_axiale(int width, int height);

}
