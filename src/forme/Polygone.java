package forme;

/**
 * Classe qui définit un polygone
 */
public class Polygone extends Forme {

    private static int somme_x_milieu=0;
    private static int somme_y_milieu=0;
    private static int x_milieu=0;
    private static int y_milieu=0;

    /**
     * Constructeur de la classe Ligne
     * @param tab_x tableau d'abcisses des sommets d'un polygone
     * @param tab_y tableau d'ordonnées des sommets d'un polygone
     */
    public Polygone(int[] tab_x, int[] tab_y) {
        super(tab_x, tab_y);
    }

    /**
     * Calcule le périmètre d'un polygone
     * @return périmètre d'un polygone
     */
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

    /**
     * Calcule l'aire d'un polygone
     * @return aire d'un polygone
     */
    @Override
    public double aire() {
        double apotheme = Math.pow(getTab_x()[1], 2) - 2 * getTab_x()[0] * getTab_x()[1] + Math.pow(getTab_x()[0],2);
        return 1/2 * perimetre() * apotheme;
    }

    /**
     * Applique une homothétie sur un polygone
     * @param width  longeur de la fenêtre
     * @param height largeur de la fenêtre
     */
    @Override
    public void homothetie(int width, int height) {

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

        somme_x_milieu=0;
        somme_y_milieu=0;

        for(Integer entier: this.getTab_x()){
            somme_x_milieu += entier;
            System.out.print("somme_x_milieu " + somme_x_milieu + "\n");
        }
        for(Integer entier: this.getTab_y()){
            somme_y_milieu += entier;
            System.out.print("somme_y_milieu " + somme_y_milieu + "\n");
        }
        x_milieu = somme_x_milieu/this.getTab_x().length;
        y_milieu = somme_y_milieu/this.getTab_y().length;

        i=0;
        for(Integer entier: this.getTab_x()){
            if(x_milieu > entier){
                tab_x_tmp[i] = entier - (x_milieu-entier);
            }
            else{
                tab_x_tmp[i] = entier + (entier-x_milieu);
            }
            i++;

        }
        i=0;
        for(Integer entier: this.getTab_y()){
            if(y_milieu > entier){
                tab_y_tmp[i] = entier - (y_milieu-entier);
            }
            else{
                tab_y_tmp[i] = entier + (entier-y_milieu);
            }
            i++;
        }

        this.setTab_x(tab_x_tmp);
        this.setTab_y(tab_y_tmp);

        System.out.print("Liste des coordonnées après homothétie d'un polygone :\n");
        for(Integer entier: this.getTab_x()){
            System.out.println("x: " + entier);
        }
        for(Integer entier: this.getTab_y()){
            System.out.println("y: " + entier);
        }
    }

    /**
     * Applique une translation sur un polygone
     * @param width  longeur de la fenêtre
     * @param height largeur de la fenêtre
     */
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

    /**
     * Applique une rotation sur un polygone
     * @param width  longeur de la fenêtre
     * @param height largeur de la fenêtre
     * @param degres degré de rotation de la ligne
     */
    @Override
    public void rotation(int width, int height, int degres) {

        int [] tab_x_tmp = new int [this.getTab_x().length];
        int [] tab_y_tmp = new int [this.getTab_y().length];

        System.out.print("Liste des coordonnées avant rotation d'un polygone :\n");
        for(Integer entier: this.getTab_x()){
            System.out.println("x: " + entier);
        }
        for(Integer entier: this.getTab_y()){
            System.out.println("y: " + entier);
        }

        somme_x_milieu=0;
        somme_y_milieu=0;

        for(Integer entier: this.getTab_x()){
            somme_x_milieu += entier;
            System.out.print("somme_x_milieu " + somme_x_milieu + "\n");
        }
        for(Integer entier: this.getTab_y()){
            somme_y_milieu += entier;
            System.out.print("somme_y_milieu " + somme_y_milieu + "\n");
        }
        x_milieu = somme_x_milieu/this.getTab_x().length;
        y_milieu = somme_y_milieu/this.getTab_y().length;

        int i=0;
        for(Integer entier: this.getTab_x()){
            tab_x_tmp[i] = (int) (tab_x_tmp[i]*Math.cos(degres) - tab_y_tmp[i]*Math.sin(degres));
            tab_y_tmp[i] = (int) (tab_x_tmp[i]*Math.cos(degres) + tab_y_tmp[i]*Math.sin(degres));
            i++;
        }

        this.setTab_x(tab_x_tmp);
        this.setTab_y(tab_y_tmp);

        System.out.print("Liste des coordonnées après symétrie centrale d'un polygone :\n");
        for(Integer entier: this.getTab_x()){
            System.out.println("x: " + entier);
        }
        for(Integer entier: this.getTab_y()){
            System.out.println("y: " + entier);
        }
    }

    /**
     * Applique une symétrie centrale sur un polygone
     * @param width  longeur de la fenêtre
     * @param height largeur de la fenêtre
     */
    @Override
    public void symetrie_centrale(int width, int height) {

        int [] tab_x_tmp = new int [this.getTab_x().length];
        int [] tab_y_tmp = new int [this.getTab_y().length];

        int i = 0;

        System.out.print("Liste des coordonnées avant symétrie centrale d'un polygone :\n");
        for(Integer entier: this.getTab_x()){
            System.out.println("x: " + entier);
        }
        for(Integer entier: this.getTab_y()){
            System.out.println("y: " + entier);
        }

        somme_x_milieu=0;
        somme_y_milieu=0;

        for(Integer entier: this.getTab_x()){
            somme_x_milieu += entier;
            System.out.print("somme_x_milieu " + somme_x_milieu + "\n");
        }
        for(Integer entier: this.getTab_y()){
            somme_y_milieu += entier;
            System.out.print("somme_y_milieu " + somme_y_milieu + "\n");
        }
        x_milieu = somme_x_milieu/this.getTab_x().length;
        y_milieu = somme_y_milieu/this.getTab_y().length;

        i=0;
        for(Integer entier: this.getTab_x()){
            if(x_milieu > entier){
                tab_x_tmp[i] = entier + 2*(x_milieu-entier);
            }
            else{
                tab_x_tmp[i] = entier - 2*(entier-x_milieu);
            }
            i++;

        }
        i=0;
        for(Integer entier: this.getTab_y()){
            if(y_milieu > entier){
                tab_y_tmp[i] = entier + 2*(y_milieu-entier);
            }
            else{
                tab_y_tmp[i] = entier - 2*(entier-y_milieu);
            }
            i++;
        }

        this.setTab_x(tab_x_tmp);
        //this.setTab_y(tab_y_tmp);

        System.out.print("Liste des coordonnées après symétrie centrale d'un polygone :\n");
        for(Integer entier: this.getTab_x()){
            System.out.println("x: " + entier);
        }
        for(Integer entier: this.getTab_y()){
            System.out.println("y: " + entier);
        }
    }

    /**
     * Applique une symétrie axiale sur un polygone
     * @param width  longeur de la fenêtre
     * @param height largeur de la fenêtre
     */
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

    /**
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Forme o) {
        return (int) ((int) this.perimetre() - o.perimetre());
    }
}
