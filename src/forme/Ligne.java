package forme;

import java.awt.*;

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
    public void homothetie(int width, int height) {

    }

    @Override
    public void translation(int width, int height) {
        System.out.println("Avant translation ligne: \nx1: " + this.getX() + ", y1: " + getY() + ", x2: " + this.getWidth() + ", y2: " + getHeight());
        this.setX(this.getX()+50);
        this.setY(this.getY()+50);
        this.setWidth(this.getWidth()+50);
        this.setHeight(this.getHeight()+50);
        System.out.println("Après translation ligne: \nx1: " + this.getX() + ", y1: " + getY() + ", x2: " + this.getWidth() + ", y2: " + getHeight());
    }

    @Override
    public void rotation(int width, int height) {
    }

    @Override
    public void symetrie_centrale(int width, int height) {

    }

    @Override
    public void symetrie_axiale(int width, int height) {

    }
}
