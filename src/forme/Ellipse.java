package forme;

/**
 * Classe qui définit une ellipse
 */
public class Ellipse extends Forme{

    /**
     * Constructeur de la classe Cercle
     * @param x      centre de l'ellipse
     * @param y      point quelconque de l'ellipse
     * @param width  longeur de la fenêtre
     * @param height largeur de la fenêtre
     */
    public Ellipse(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    /**
     * Calcule le périmètre d'une ellipse
     * @return périmètre de l'ellipse
     */
    @Override
    public double perimetre() {
        return Math.PI * (3*(getWidth()/2)+getHeight()/2) - Math.sqrt((3*(getWidth()/2)+getHeight()/2)*((getWidth()/2) + 3 * (getHeight()/2)));
    }

    /**
     * Calcule l'aire d'une ellipse
     * @return aire de l'ellipse
     */
    @Override
    public double aire() {
        return Math.PI * (getWidth()/2) * (getHeight()/2);
    }
    /**
     * Applique une homothétie sur une ellipse
     * @param width  longeur de la fenêtre
     * @param height largeur de la fenêtre
     */
    @Override
    public void homothetie(int width, int height) {
        System.out.println("Avant homothetie ellipse: \nx1: " + this.getX() + ", y1: " + getY() + ", x2: " + this.getWidth() + ", y2: " + getHeight());
        this.setX(this.getX()+50);
        this.setY(this.getY()+50);
        this.setWidth(this.getWidth()-50);
        this.setHeight(this.getHeight()-50);
        System.out.println("Après homothetie ellipse: \nx1: " + this.getX() + ", y1: " + getY() + ", x2: " + this.getWidth() + ", y2: " + getHeight());
    }

    /**
     * Applique une translation sur une ellipse
     * @param width  longeur de la fenêtre
     * @param height largeur de la fenêtre
     */
    @Override
    public void translation(int width, int height) {
        System.out.println("Avant translation ellipse: \nx: " + this.getX() + ", y: " + getY() + ", x2: " + this.getWidth() + ", y2: " + getHeight());
        this.setX(this.getX()+50);
        this.setY(this.getY()+50);
        System.out.println("Après translation ellipse: \nx: " + this.getX() + ", y: " + getY() + ", x2: " + this.getWidth() + ", y2: " + getHeight());
    }

    /**
     * Applique une rotation sur une ellipse
     * @param width  longeur de la fenêtre
     * @param height largeur de la fenêtre
     * @param degres degré de rotation de l'ellipse
     * @return null (la rotation sur une ellipse n'est pas possible)
     */
    @Override
    public void rotation(int width, int height, int degres) {
        System.out.println("Avant rotation ellipse: \nx: " + this.getX() + ", y: " + getY() + ", x2: " + this.getWidth() + ", y2: " + getHeight());
        int temp = this.getWidth();
        this.setWidth(this.getHeight());
        this.setHeight(temp);
        System.out.println("Après rotation ellipse: \nx: " + this.getX() + ", y: " + getY() + ", x2: " + this.getWidth() + ", y2: " + getHeight());
    }

    /**
     * Applique une symétrie centrale sur une ellipse
     * @param width  longeur de la fenêtre
     * @param height largeur de la fenêtre
     */
    @Override
    public void symetrie_centrale(int width, int height) {
        System.out.println("Symétrie centrale effectuée avec succès !");
    }

    /**
     * Applique une symétrie axiale sur une ellipse
     * @param width  longeur de la fenêtre
     * @param height largeur de la fenêtre
     */
    @Override
    public void symetrie_axiale(int width, int height) {
        System.out.println("Avant symetrie axiale ellipse: \nx1: " + this.getX() + ", y1: " + getY() + ", x2: " + this.getWidth() + ", y2: " + getHeight());
        this.setX(this.getX()+width);
        System.out.println("Après symetrie axiale ellipse: \nx1: " + this.getX() + ", y1: " + getY() + ", x2: " + this.getWidth() + ", y2: " + getHeight());
    }
}
