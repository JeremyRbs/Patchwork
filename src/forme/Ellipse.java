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
    public double[] homothetie(double[] A, double x, double y) {
        return new double[0];
    }

    @Override
    public double[] translation(double[] A) {
        return new double[0];
    }

    @Override
    public double[] rotation(double[] C, double[] A, double angle) {
        return new double[0];
    }

    @Override
    public double[] symetrie_centrale(double[] A) {
        return new double[0];
    }

    @Override
    public double[] symetrie_axiale(double[] A) {
        return new double[0];
    }
}
