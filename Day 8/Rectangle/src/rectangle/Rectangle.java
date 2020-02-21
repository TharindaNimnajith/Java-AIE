package rectangle;

public class Rectangle {
    //int length, width, area;
    private int length, width;
    int area;
    
    public Rectangle() {
        length = 0;
        width = 0;
        area = 0;
    }
    
    //private Rectangle(int length, int width) {
    //public Rectangle(int length, int width) {
    protected Rectangle(int length, int width) {
        this.width = width;
        this.length = length;
    }
    
    public void calArea() {
        area = length * width;
    }
    
    public void printDetails() {
        System.out.println("Length: " +length);
        System.out.println("Width: " +width);
        System.out.println("Area: " +area);
        System.out.println();
    }
    
    public void printDetails(int x) {
        //
    }

        
    public static void main(String[] args) {
        Square s1 = new Square(10);
        s1.calArea();
        s1.printDetails();
        
        Rectangle r1 = new Rectangle(5, 2);
        r1.calArea();
        r1.printDetails();
        
        Rectangle r2 = new Square(5);
        r2.calArea();
        r2.printDetails();
              
        //Polymorphism / Overriding methods
        Rectangle s = new Square(10);
        s.calArea();
        s.printDetails();
        s.printDetails(10);
    }
}
