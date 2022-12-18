package forme;

import Interfaces.Calcul;

/**
 * Classe abstraite pour initialiser une forme
 */
public abstract class Forme implements Calcul, Comparable<Forme> {

    private int x;
    private int y;
    private int width;
    private int height;

    private int [] tab_x;
    private int [] tab_y;

    /**
     * Constructeur de la classe Forme
     * @param x      abscisse d'un point 1
     * @param y      ordonnée d'un point 2
     * @param width  abscisse d'un point 1
     * @param height ordonnée d'un point 2
     */
    public Forme(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /**
     * Constructeur de la classe Forme
     * @param tab_x  tableau d'abscisses
     * @param tab_y  tableau d'ordonnées
     */
    public Forme(int[] tab_x, int[] tab_y) {
        this.tab_x = tab_x;
        this.tab_y = tab_y;
    }

    /**
     * Récupère la valeur de l'abscisse du point 1
     * @return abcisse du point 1
     */
    public int getX() {
        return x;
    }

    /**
     * Modifie la valeur de l'abscisse du point 1
     * @param x abcisse du point 1
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Récupère la valeur de l'ordonnée du point 1
     * @return ordonnée du point 1
     */
    public int getY() {
        return y;
    }

    /**
     * Modifie la valeur de l'ordonnée du point 1
     * @param y ordonnée du point 1
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Récupère la valeur de l'abscisse du point 2
     * @return abscisse du point 2
     */
    public int getWidth() {
        return width;
    }

    /**
     * Modifie la valeur de l'abscisse du point 2
     *  @param width abscisse du point 2
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Récupère la valeur de l'ordonnée du point 2
     * @return ordonnée du point 2
     */
    public int getHeight() {
        return height;
    }

    /**
     * Modifie la valeur de l'ordonnée du point 2
     * @param height ordonnée du point 2
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Récupère la valeur des abscisses des sommets
     * @return tableau contenant les abscisses de sommets
     */
    public int[] getTab_x() {
        return tab_x;
    }

    /**
     * Modifie la valeur des abscisses des sommets
     * @param tab_x  tableau contenant les abscisses de sommets
     */
    public void setTab_x(int[] tab_x) {
        this.tab_x = tab_x;
    }

    /**
     * Récupère la valeur des ordonnées des sommets
     * @return tableau contenant les ordonnées de sommets
     */
    public int[] getTab_y() {
        return tab_y;
    }

    /**
     * Modifie la valeur des ordonnées des sommets
     * @param tab_y  tableau contenant les ordonnées de sommets
     */
    public void setTab_y(int[] tab_y) {
        this.tab_y = tab_y;
    }

    /**
     * Transformation géométrique par agrandissement ou réduction
     * Applique donc une homothétie sur une forme
     * @param width  longeur de la fenêtre
     * @param height largeur de la fenêtre
     */
    public abstract void homothetie(int width, int height);

    /**
     * Dans le plan cartésien,
     * une matrice de transformation est une matrice qui permet,
     * à partir des coordonnées d'un point initial représentées par une matrice colonne,
     * de trouver celles de son image par une transformation géométrique donnée.
     * Applique donc une translation sur une forme
     * @param width  longeur de la fenêtre
     * @param height largeur de la fenêtre
     */
    public abstract void translation (int width, int height);

    /**
     * Applique une rotation sur une forme
     * @param width  longeur de la fenêtre
     * @param height largeur de la fenêtre
     * @param degres degré de rotation
     */
    public abstract void rotation(int width, int height, int degres);

    /**
     * Applique une rotation de 180 degrés sur une forme
     * @param width  longeur de la fenêtre
     * @param height largeur de la fenêtre
     */
    public abstract void symetrie_centrale(int width, int height);

    /**
     * Transformation géométrique du plan qui modélise un « pliage » ou un « effet miroir »
     * @param width  longeur de la fenêtre
     * @param height largeur de la fenêtre
     */
    public abstract void symetrie_axiale(int width, int height);

}