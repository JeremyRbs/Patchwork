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
        System.out.println("Avant homothetie polygone: \nx1: " + this.getX() + ", y1: " + getY() + ", x2: " + this.getWidth() + ", y2: " + getHeight());
        for(int i=0; i<getTab_x().length; i++){
            this.setX(this.getX()+50);
        }
        this.setY(this.getY()+50);
        this.setWidth(this.getWidth()-50);
        this.setHeight(this.getHeight()-50);
        System.out.println("Après homothetie polygone: \nx1: " + this.getX() + ", y1: " + getY() + ", x2: " + this.getWidth() + ", y2: " + getHeight());
    }


    @Override
    public void translation(int width, int height) {

        int [] tab_x_tmp = new int [this.getTab_x().length];
        int [] tab_y_tmp = new int [this.getTab_y().length];

        int i = 0;

        System.out.print("Liste des coordonnées avant translation d'un polygone :\n");
        for(Integer entier: this.getTab_x()){
            System.out.println("x: " + entier);
        }
        for(Integer entier: this.getTab_y()){
            System.out.println("y: " + entier);
        }

        for(Integer entier: this.getTab_x()){
            entier += 50;
            tab_x_tmp[i] = entier;
            i++;
        }
        i=0;
        for(Integer entier: this.getTab_y()){
            entier += 50;
            tab_y_tmp[i] = entier;
            i++;
        }
        i=0;

        this.setTab_x(tab_x_tmp);
        this.setTab_y(tab_y_tmp);

        System.out.print("Liste des coordonnées après translation d'un polygone :\n");
        for(Integer entier: this.getTab_x()){
            System.out.println("x: " + entier);
        }
        for(Integer entier: this.getTab_y()){
            System.out.println("y: " + entier);
        }
    }

    @Override
    public void rotation(int width, int height, int degres) {

    }

    @Override
    public void symetrie_centrale(int width, int height) {

    }

    @Override
    public void symetrie_axiale(int width, int height) {
        int [] tab_x_tmp = new int [this.getTab_x().length];
        int [] tab_y_tmp = new int [this.getTab_y().length];

        int i = 0;

        System.out.print("Liste des coordonnées avant symétrie axiale d'un polygone :\n");
        for(Integer entier: this.getTab_x()){
            System.out.println("x: " + entier);
        }
        for(Integer entier: this.getTab_y()){
            System.out.println("y: " + entier);
        }

        int[] temp = this.getTab_x();
        int x_axe_temp = temp[0] + width/2;
        int distance_x2_de_axe_temp = x_axe_temp - this.getWidth();
        for(Integer entier: this.getTab_x()){
            if(i==0){
                entier = entier + 2*width/2;
            }
            else{
                entier = entier + 2*(x_axe_temp-entier);
            }
            tab_x_tmp[i] = entier;
            i++;
        }

        this.setTab_x(tab_x_tmp);
        //this.setTab_y(tab_y_tmp);

        System.out.print("Liste des coordonnées après symétrie axiale d'un polygone :\n");
        for(Integer entier: this.getTab_x()){
            System.out.println("x: " + entier);
        }
        for(Integer entier: this.getTab_y()){
            System.out.println("y: " + entier);
        }
    }
}
