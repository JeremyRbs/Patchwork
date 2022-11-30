import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Dimension tailleEcran = Toolkit.getDefaultToolkit().getScreenSize();

        int width = tailleEcran.width;
        int height = tailleEcran.height;

        JFrame frame = new JFrame();

        frame.setSize(width/2, height/2);
        frame.setTitle("Patchwork");
        Dessin d = new Dessin();
        frame.add(d.getDessin());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}