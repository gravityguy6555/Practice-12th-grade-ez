/**
 * Exemple de classe où le constructeur spécifique s'occupe de détails
 * importants, alors sa réutilisation dans le constructeur général fait 
 * plus de sens
 */
public class Square {

    private double side;
    private double area;
    private double perimeter;

    /** Constructeur général */
    Square(){
        this(1); // valeur par défaut
    }
    
    /** Constructeur spécifique */
    Square(double side) {
        // utilise le mutateur qui contient tout le code
        // de validation et de mise à jour
        setSide(side);
    }

    /**
     * Mutateur pour l'attribut side
     */
    public void setSide(double side){
        if (side < 0) {
            return;
        }

        this.side = side;
        // initialiser automatiquement les valeurs qui
        // dépendent de la longueur de côté
        calculateArea();
        calculatePerimeter();
    }

    public double getSide() {
        return side;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    /**
     * Méthode d'appui, qui fait du travail interne pour
     * la classe
     */
    private void calculateArea(){
        area = side*side;
    }

    /**
     * Méthode d'appui, qui fait du travail interne pour
     * la classe
     */
    private void calculatePerimeter(){
        perimeter = 4*side;
    }

    /**
     * 
     * @param targetArea l'aire voulue
     * @return la longueur de côté qui donne l'aire ou -1 si l'aire est moins que 0
     */
    public static double setSideByArea(double targetArea){
        if (targetArea < 0) {
            System.out.println("L'aire doit être positif.");
            return -1;
        }

        return Math.sqrt(targetArea);
    }

    @Override
    public String toString() {
        return "Carré : c=" + side + ", A="+area+", P="+perimeter;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other){
            return true;
        }

        if (!(other instanceof Square)){
            return false;
        }

        Square o = (Square)other;

        return this.side == o.side;
    }
    
}