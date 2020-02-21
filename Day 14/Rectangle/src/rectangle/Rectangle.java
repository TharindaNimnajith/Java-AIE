package rectangle;

public abstract class Rectangle implements Interface1 {
    static int count = 100; //static variable
    private int width; //instance variable
    protected int length;
    int area;
    
    public int calPerimeter() {
        return 10;
    }
    
    public Rectangle() {
        width = 0;
        length = 0;
    }
    
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    
    public abstract void calculate();
    
/*
    public void calArea() {
        int x; //local variable
        
        area = width * length;
    }
*/
    
    public void calArea() {
        
    }
    
    public void printDetails() {
        System.out.println("Area = " +area);
        System.out.println("Length = " +length);
        System.out.println("Width = " +width);
    }
    
    public static void main(String[] args) {
        //Rectangle r1 = new Rectangle();
        //Rectangle r2 = new Rectangle(10, 5);
        
        //System.out.println("r1.length = " +r1.length);
        //System.out.println("r1.width = " +r1.width);
        
        //System.out.println();
        
        //System.out.println("r2.length = " +r2.length);
        //System.out.println("r2.width = " +r2.width);
        
        //System.out.println();
        
        //r1.count = 200;
        
        //System.out.println("r1.count = " +r1.count);
        //System.out.println("r2.count = " +r2.count);
        
        //System.out.println();
        
        //r1.calArea();
        //r2.calArea();
        
        //r1.printDetails();
        
        //System.out.println();
        
        //r2.printDetails();
        
        //System.out.println();
        
        Square s = new Square(10);
        s.printDetails();
        
        System.out.println();
        
        //final int x = 10;
        
        //can't change the value of x
        //x++;
        //x = x + 10;
        //x = 5;
        //x -= 6;
        
        Rectangle s1 = new Square(10);        
        s1.calArea();
        s1.printDetails();
    }
 }
