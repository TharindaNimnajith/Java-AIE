package rectangle;

public class Rectangle {
    int length;
    int width;
    
    public Rectangle() {}
    
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width; 
    }
    
    /*
    public void printDetails() {
        System.out.println("Length: " +length);
        System.out.println("Width: " +width);
        System.out.println();
    }
    */
    
    public void printDetails() {
        System.out.println("Length: " +length);
        System.out.println("Width: " +width);
        System.out.println();
    }
    
    //private int calArea() {
    public int calArea() {
        return 0;
    }
    
    public static void main(String[] args) {
        //Creating a Super class object and calling the Super class constructor
        Rectangle r1 = new Rectangle(20, 10);
        r1.printDetails();
        
        //Creating a Sub class object and calling the Sub class constructor
        Square s1 = new Square(40);
        s1.printDetails();
        
        //Creating a Super class object and calling the Sub class constructor
        //The function called by the object must be defined in the Super class
        //as well with the same return type and function name, but the 
        //function body can be different (overridng functions)
        //Default constructor of the Super class must be declared as well when
        //creating a child class object using the parent class (Calling the 
        //child class constructor for the parent class object)
        Rectangle r2 = new Square(30);
        r2.printDetails();
        
        //Creating a Square objects array and calling Square constructors
        Square[] s2 = new Square[2];
        s2[0] = new Square(10);
        s2[0].printDetails();
        s2[1] = new Square(20);
        s2[1].printDetails();
        
        //Creating a Rectangle objects array 
        Rectangle[] r3 = new Rectangle[2];
        
        //and calling the parent class constructor(Rectangle)
        r3[0] = new Rectangle(5, 6);
        r3[0].printDetails();
        
        //and calling the child clsss constructor(Square)
        r3[1] = new Square(3);       
        r3[1].printDetails();
        
        int area = s1.calArea();
        int a = r1.calArea();
        
        System.out.println(r2.calArea());
    }   
}
