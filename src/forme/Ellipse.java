package forme;

public class Ellipse extends Forme{

    public Ellipse(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public double perimetre() {
        return Math.PI * (3*(getWidth()/2)+getHeight()/2) - Math.sqrt((3*(getWidth()/2)+getHeight()/2)*((getWidth()/2) + 3 * (getHeight()/2)));
    }

    @Override
    public double aire() {
        return Math.PI * (getWidth()/2) * (getHeight()/2);
    }

    @Override
    public void homothetie(int width, int height) {
        System.out.println("Avant homothetie ellipse: \nx1: " + this.getX() + ", y1: " + getY() + ", x2: " + this.getWidth() + ", y2: " + getHeight());
        this.setX(this.getX()+50);
        this.setY(this.getY()+50);
        this.setWidth(this.getWidth()-50);
        this.setHeight(this.getHeight()-50);
        System.out.println("Après homothetie ellipse: \nx1: " + this.getX() + ", y1: " + getY() + ", x2: " + this.getWidth() + ", y2: " + getHeight());
    }


    @Override
    public void translation(int width, int height) {
        System.out.println("Avant translation ellipse: \nx: " + this.getX() + ", y: " + getY());
        this.setX(this.getX()+50);
        this.setY(this.getY()+50);
        System.out.println("Après translation ellipse: \nx: " + this.getX() + ", y: " + getY());
    }

    @Override
    public void rotation(int width, int height, int degres) {

    }

    @Override
    public void symetrie_centrale(int width, int height) {

    }

    @Override
    public void symetrie_axiale(int width, int height) {

    }
}
