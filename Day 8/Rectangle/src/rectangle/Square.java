package rectangle;

public class Square extends Rectangle {
    int length;
    
    public Square(int length) {
        //
        //this.length = length;
        
        //super.length = length;
        //super.width = length;
        
        super(length, length);
        
        this.length = length;
    }

    
    //Method Overriding
    
    /**
     *
     */
    @Override
    public void calArea() {
        area = length * length;
    }
    
    /**
     *
     */
    @Override
    public void printDetails() {
        System.out.println("Length: " +length);
        System.out.println("Area: " +area);
        System.out.println();
    }
    
    public void printDetails(int x) {
        System.out.println("Length: " +length);
        System.out.println("Area: " +area);
        System.out.println();
    }
}
