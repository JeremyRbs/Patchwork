package forme;

public class Polygone extends Forme {

    public Polygone(int[] tab_x, int[] tab_y) {
        super(tab_x, tab_y);
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
