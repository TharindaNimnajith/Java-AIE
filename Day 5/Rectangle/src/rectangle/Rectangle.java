package rectangle;

public class Rectangle {
    //int length;
    //int width;
    //int area;
    //int perimeter;
    
    //public int length;
    //public int width;
    //public int area;
    //public int perimeter;
    
    //private int length;
    //private int width;
    //private int area;
    //private int perimeter;
    
    protected int length;
    protected int width;
    protected int area;
    protected int perimeter;
    
    public Rectangle() {
        length = width = area = perimeter = 0;
    }
    
    public Rectangle(int l, int w) {
        length = l;
        width = w;
    }
    
    //private void calArea() {
    //public void calArea() {
    protected void calArea() {
        area = length * width;
    }
    
    //private void calPerimeter() {
    //public void calPerimeter() {
    protected void calPerimeter() {
        perimeter = 2 * (length + width);
    }
    
    /*
    public void printDetails() {
        System.out.println("Length = " +length);
        System.out.println("Width = " +width);
        System.out.println("Area = " +area);
        System.out.println("Perimeter = " +perimeter);
    } 
    */
    
    public void test() {
        System.out.println("In Rectangle Class - Test Method");
    }
    
    public static void main(String[] args) {
        Square s1 = new Square(10);
        s1.calArea();
        s1.calPerimeter();
        //s1.printDetails();
        
        Rectangle r1 = new Rectangle(10, 20);
        r1.calArea();
        r1.calPerimeter();
        
        Details d1 = new Details();
        d1.print(r1);
    }   
}
