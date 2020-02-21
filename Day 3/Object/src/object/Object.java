package object;

public class Object {
    
    private void print() {
        System.out.println("Hello");
    }
    
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        r1.calAvg();
        //r1.print();
        
        Object o = new Object();
        o.print();
        
        Circle c1 = new Circle(2);
        c1.calcArea();
    }   
}
