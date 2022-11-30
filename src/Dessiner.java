import forme.Cercle;
import forme.Ellipse;

import javax.swing.*;
import java.awt.*;

public class Dessiner extends  JComponent {
    private Cercle c;
    private Ellipse e;

    public Dessiner() {
        this.c = new Cercle(10,10,250,250);
        this.e = new Ellipse(50,50,150,250);
    }

    protected void paintComponent(Graphics g){
        g.drawOval(c.getX(),c.getY(),c.getWidth(),c.getHeight());
        //g.drawOval(e.getX(),e.getY(),e.getWidth(),e.getHeight());
    }
}
