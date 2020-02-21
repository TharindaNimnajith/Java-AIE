package circle;

public class Circle {
    int radius;
    double area;
    double perimeter;
    
    static int count;
    static double pi = 3.142;
    
    private class Print {  //Inner Class
        public void printDetails() {
            System.out.println("In print details");
        }                       
    }
    
    public Circle() {
        radius = 0;
        area = 0;
        perimeter = 0;
        
        Print p = new Print();
        p.printDetails();
    }
    
    public Circle(int r) {
        radius = r;
    }
    
    public void calArea() {
        area = pi * radius * radius;
    }
    
    public void calPerimeter() {
        perimeter = 2 * pi * radius;
    }
    
    //Print p1 = new Print();
    
    public static void main(String[] args) {
        Circle c = new Circle();
        //c.p1.printDetails();
    }    
}