import Interfaces.Calcul;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Dessin implements Calcul {

    private List<Image> listeImages;

    private int nbAletoire;

    public Dessin() {
        this.listeImages = new ArrayList<Image>();
        this.nbAletoire = (int) Math.round(Math.random() * (8 - 1 + 1) + 1);
        for(int i=0; i<nbAletoire; i++){
            listeImages.add(new Image());
        }
    }

    public List<Image> getListeImages() {
        return listeImages;
    }

    public void setListeImages(List<Image> listeImages) {
        this.listeImages = listeImages;
    }

    public JPanel getDessin(){

        Border blackline = BorderFactory.createLineBorder(Color.black);

        JPanel panelMaster = new JPanel();
        switch (listeImages.size()) {
            case 1:
                panelMaster.setLayout(new GridLayout(1, 1));
                break;
            case 2:
                panelMaster.setLayout(new GridLayout(1, 2));
                break;
            case 3:
                panelMaster.setLayout(new GridLayout(1, 3));
                break;
            case 4:
                panelMaster.setLayout(new GridLayout(2, 2));
                break;
            case 5:
                panelMaster.setLayout(new GridLayout(1, 5));
                break;
            case 6:
                panelMaster.setLayout(new GridLayout(2, 3));
                break;
            case 7:
                panelMaster.setLayout(new GridLayout(1, 7));
                break;
            case 8:
                panelMaster.setLayout(new GridLayout(2,  4));
                break;
            case 9:
                panelMaster.setLayout(new GridLayout(3, 3));
                break;
            default:
                break;
        }

        panelMaster.setBorder(blackline);

        for(int i=0; i<listeImages.size(); i++){
            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());
            panel.setBorder(blackline);
            panel.add(new Image(),BorderLayout.CENTER);
            panelMaster.add(panel);
        }

        return panelMaster;
    }

    @Override
    public double perimetre() {

        double p = 0;

        for(int i=0; i<listeImages.size();i++){
            p += listeImages.get(i).perimetre();
        }
        return p;
    }

    @Override
    public double aire() {

        double a = 0;

        for(int i=0; i<listeImages.size();i++){
            a += listeImages.get(i).aire();
        }
        return a;
    }
}
