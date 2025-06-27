
public class Main {
    public static void main(String[] args) {
        GeometricObject c = new Circle(3.5);
        GeometricObject r = new Rectangle(4.0, 5.0);

        System.out.println(c);
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimeter: " + c.getPerimeter());

        System.out.println(r);
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());
    }
}
