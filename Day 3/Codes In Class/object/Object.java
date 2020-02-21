package object;

public class Object {

    private void printDetails(){
        
        System.out.println("OBJECT CLASS");
    
    }
    public static void main(String[] args) {
        
        Rectangle rect1=new Rectangle(10,20);
        rect1.calArea();
        
        Circle cr1=new Circle(20);
        cr1.calArea();
        
    }
    
}
