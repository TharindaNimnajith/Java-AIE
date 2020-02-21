package shapedemo;

public class Circle implements Shape {
    int radius;
    double area, perimeter;
    static double pi = 3.142;
    
    /**
     *
     */
    @Override
    public void calArea() {
        area = pi * radius * radius;
    }
    
    /**
     *
     */
    @Override
    public void calPerimeter() {
        perimeter = 2 * pi * radius;
    }
    
    /**
     *
     */
    @Override
    public void printDetails() {
        System.out.println("Radius: " +radius);
        System.out.println("Area: " +area);
        System.out.println("Perimeter: " +perimeter);
        System.out.println();
    }
    
    public Circle(int radius) {
        this.radius = radius;
    }
}
