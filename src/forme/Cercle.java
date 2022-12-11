package forme;

public class Cercle extends Forme {

    public Cercle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void homothetie(int width, int height) {

    }

    @Override
    public void translation(int width, int height) {
        System.out.println("Avant translation cercle: \nx: " + this.getX() + ", y: " + getY());
        this.setX(this.getX()+50);
        this.setY(this.getY()+50);
        System.out.println("Après translation cercle: \nx: " + this.getX() + ", y: " + getY());
    }

    @Override
    public void rotation(int width, int height) {
        System.out.println("Avant rotation cercle: \nx: " + this.getX() + ", y: " + getY());
        System.out.println("Après rotation cercle: \nx: " + this.getX() + ", y: " + getY());
    }

    @Override
    public void symetrie_centrale(int width, int height) {
        System.out.println("Symétrie centrale effectuée avec succès !");
    }

    @Override
    public void symetrie_axiale(int width, int height) {
        this.setX(this.getX());
        System.out.println("Symétrie centrale effectuée avec succès ! ");
    }

    @Override
    public double perimetre() {
        return Math.PI * getWidth();
    }

    @Override
    public double aire() {
        return Math.PI * (getWidth()/2) * (getWidth()/2);
    }
}
