package shapedemo;

public class ShapeDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 4);
        r1.calArea();
        r1.calPerimeter();
        r1.printDetails();
        
        Circle c1 = new Circle(7);
        c1.calArea();
        c1.calPerimeter();
        c1.printDetails();
    }
}
