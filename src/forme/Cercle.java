package forme;

/**
 * Classe qui définit un cercle
 */
public class Cercle extends Forme {

    /**
     * Constructeur de la classe Cercle
     * @param x      centre du cercle
     * @param y      point quelconque du cercle
     * @param width  longeur de la fenêtre
     * @param height largeur de la fenêtre
     */
    public Cercle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    /**
     * Applique une homothétie sur un cercle
     * @param width  longeur de la fenêtre
     * @param height largeur de la fenêtre
     */
    @Override
    public void homothetie(int width, int height) {
        System.out.println("Avant homothetie cercle: \nx1: " + this.getX() + ", y1: " + getY() + ", x2: " + this.getWidth() + ", y2: " + getHeight());
        this.setX(this.getX()+50);
        this.setY(this.getY()+50);
        this.setWidth(this.getWidth()-50);
        this.setHeight(this.getHeight()-50);
        System.out.println("Après homothetie cercle: \nx1: " + this.getX() + ", y1: " + getY() + ", x2: " + this.getWidth() + ", y2: " + getHeight());
    }

    /**
     * Applique une translation sur un cercle
     * @param width  longeur de la fenêtre
     * @param height largeur de la fenêtre
     */
    @Override
    public void translation(int width, int height) {
        System.out.println("Avant translation cercle: \nx: " + this.getX() + ", y: " + getY());
        this.setX(this.getX()+50);
        this.setY(this.getY()+50);
        System.out.println("Après translation cercle: \nx: " + this.getX() + ", y: " + getY());
    }

    /**
     * Applique une rotation sur un cercle
     * @param width  longeur de la fenêtre
     * @param height largeur de la fenêtre
     * @param degres degré de rotation du cercle
     * @return null (la rotation sur un cercle n'a aucun intérêt)
     */
    @Override
    public void rotation(int width, int height, int degres) {
        System.out.println("Avant rotation cercle: \nx: " + this.getX() + ", y: " + getY());
        System.out.println("Après rotation cercle: \nx: " + this.getX() + ", y: " + getY());
    }

    /**
     * Applique une symétrie centrale sur un cercle
     * @param width  longeur de la fenêtre
     * @param height largeur de la fenêtre
     */
    @Override
    public void symetrie_centrale(int width, int height) {
        System.out.println("Symétrie centrale effectuée avec succès !");
    }

    /**
     * Applique une symétrie axiale sur un cercle
     * @param width  longeur de la fenêtre
     * @param height largeur de la fenêtre
     */
    @Override
    public void symetrie_axiale(int width, int height) {
        System.out.println("Avant symetrie axiale cercle: \nx1: " + this.getX() + ", y1: " + getY() + ", x2: " + this.getWidth() + ", y2: " + getHeight());
        int x_axe_temp = this.getX() + width/2;
        int distance_x2_de_axe_temp = x_axe_temp - this.getWidth();
        this.setWidth(this.getWidth()+2*distance_x2_de_axe_temp);
        this.setX(this.getX()+2*(width/2));
        System.out.println("Après symetrie axiale cercle: \nx1: " + this.getX() + ", y1: " + getY() + ", x2: " + this.getWidth() + ", y2: " + getHeight());
    }

    /**
     * Calcule le périmètre d'un cercle
     * @return périmètre du cercle
     */
    @Override
    public double perimetre() {
        return Math.PI * getWidth();
    }

    /**
     * Calcule l'aire d'un cercle
     * @return aire du cercle
     */
    @Override
    public double aire() {
        return Math.PI * (getWidth()/2) * (getWidth()/2);
    }
}
