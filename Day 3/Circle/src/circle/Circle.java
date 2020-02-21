package circle;

public class Circle {
    
    double radius;
    double pi = 3.142;
    
    public Circle() {
        radius = 0;
    }
        
    public Circle(double r) {
        radius = r;
    }
        
    public double calcArea() {
        double a = pi * radius * radius;    
        return a;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 7;
        System.out.println("Area = " +c1.calcArea());
        
        Circle c2 = new Circle(14);
        System.out.println("Area = " +c2.calcArea());    
    }
}