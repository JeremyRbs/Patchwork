package forme;

public class Ligne extends Forme {

    public Ligne(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);
    }

    @Override
    public double perimetre() {
        return 0;
    }

    @Override
    public double aire() {
        return 0;
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
