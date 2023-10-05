public class GeoApp {
    public static void main(String[] args) {
        Square s1 = new Square(2);
        Square s2 = new Square(2);
        double side = Square.setSideByArea(-48);
        Square s3 = new Square(side);
        
        System.out.println(s3.getArea());

        System.out.println(s1.equals(s2));
        s2.setSide(3);
        System.out.println(s1.equals(s2));
    }
}