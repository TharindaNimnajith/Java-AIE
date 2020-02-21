package object;

public class Circle {   
    double radius;
    
    public Circle() {
        radius = 0;
    }
        
    public Circle(double r) {
        radius = r;
    }
        
    public void calcArea() {
        double a = 3.14 * radius * radius;    
        System.out.println("Area = " +a);
    }
}