package forme;

import java.awt.*;
import java.security.InvalidParameterException;

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
        System.out.println("Avant homothetie ligne: \nx1: " + this.getX() + ", y1: " + getY() + ", x2: " + this.getWidth() + ", y2: " + getHeight());
        this.setX(this.getX()+50);
        this.setY(this.getY()+50);
        this.setWidth(this.getWidth()-50);
        this.setHeight(this.getHeight()-50);
        System.out.println("Après homothetie ligne: \nx1: " + this.getX() + ", y1: " + getY() + ", x2: " + this.getWidth() + ", y2: " + getHeight());
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
    public void rotation(int width, int height, int degres) {
        System.out.println("Avant rotation ligne: \nx1: " + this.getX() + ", y1: " + getY() + ", x2: " + this.getWidth() + ", y2: " + getHeight());
        int xM, yM, x, y;

        if(degres<0 || degres > 360){
            throw new InvalidParameterException("Mauvais choix d'angle");
        }

        this.setWidth((int) (this.getWidth()*Math.cos(degres) - this.getHeight()*Math.sin(degres)));
        this.setHeight((int) (this.getWidth()*Math.cos(degres)+this.getHeight()*Math.sin(degres)));

        System.out.println("Après rotation ligne: \nx1: " + this.getX() + ", y1: " + getY() + ", x2: " + this.getWidth() + ", y2: " + getHeight());
    }

    @Override
    public void symetrie_centrale(int width, int height) {
        System.out.println("Avant symetrie centrale ligne: \nx1: " + this.getX() + ", y1: " + getY() + ", x2: " + this.getWidth() + ", y2: " + getHeight());

        int distance_x=this.getWidth()+100;
        /*
        int distance= (int) Point2D.distance(this.getX(), this.getWidth(), this.getY(), this.getHeight());
        int distance_y=this.getHeight()+distance/2;

        this.setX(distance_x-this.getX());
        this.setY(distance_y-this.getY());
        this.setWidth(distance_x-getWidth());
        this.setHeight(distance_y-getHeight());

        System.out.println("Après symetrie centrale ligne: \nx1: " + this.getX() + ", y1: " + getY() + ", x2: " + this.getWidth() + ", y2: " + getHeight());
        */
    }

    @Override
    public void symetrie_axiale(int width, int height) {
        System.out.println("Avant symetrie axiale ligne: \nx1: " + this.getX() + ", y1: " + getY() + ", x2: " + this.getWidth() + ", y2: " + getHeight());
        int x_axe_temp = this.getX() + width/2;
        int distance_x2_de_axe_temp = x_axe_temp - this.getWidth();
        this.setWidth(this.getWidth()+2*distance_x2_de_axe_temp);
        this.setX(this.getX()+2*(width/2));
        System.out.println("Après symetrie axiale ligne: \nx1: " + this.getX() + ", y1: " + getY() + ", x2: " + this.getWidth() + ", y2: " + getHeight());
    }
}
