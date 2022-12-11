package forme;

import java.awt.*;
import java.util.ArrayList;

public class Polygone extends Forme {

    public Polygone(int[] tab_x, int[] tab_y) {
        super(tab_x, tab_y);
    }

    @Override
    public double perimetre() {

        double p = 0;
        double x, y;

        for(int i=0; i<getTab_x().length; i++){
            if(i != getTab_x().length - 1) {
                x = Math.pow(getTab_x()[i+1], 2) - 2 * getTab_x()[i] * getTab_x()[i + 1] + Math.pow(getTab_x()[i],2);
                y = Math.pow(getTab_y()[i+1], 2) - 2 * getTab_y()[i] * getTab_y()[i + 1] + Math.pow(getTab_y()[i],2);
            } else {
                x = Math.pow(getTab_x()[0], 2) - 2 * getTab_x()[i] * getTab_x()[0] + Math.pow(getTab_x()[i],2);
                y = Math.pow(getTab_y()[0], 2) - 2 * getTab_y()[i] * getTab_y()[0] + Math.pow(getTab_y()[i],2);
            }
            p += Math.sqrt(x+y);
        }
        return p;
    }

    @Override
    public double aire() {
        double apotheme = Math.pow(getTab_x()[1], 2) - 2 * getTab_x()[0] * getTab_x()[1] + Math.pow(getTab_x()[0],2);
        return 1/2 * perimetre() * apotheme;
    }

    @Override
    public void homothetie(int width, int height) {
    }

    @Override
    public void translation(int width, int height) {

        ArrayList<Integer> tab_x_tmp = new ArrayList<Integer>();
        ArrayList<Integer> tab_y_tmp = new ArrayList<Integer>();

        System.out.print("Liste des coordonnées avant translation d'un polygone :\n");
        for(Integer entier: this.getTab_x()){
            System.out.println("x: " + entier);
        }
        for(Integer entier: this.getTab_y()){
            System.out.println("y: " + entier);
        }

        for(Integer entier: this.getTab_x()){
            entier += 50;
        }
        for(Integer entier: this.getTab_y()){
            entier += 50;
        }

        System.out.print("Liste des coordonnées après translation d'un polygone :\n");
        for(Integer entier: this.getTab_x()){
            System.out.println("x: " + entier);
        }
        for(Integer entier: this.getTab_y()){
            System.out.println("y: " + entier);
        }
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
