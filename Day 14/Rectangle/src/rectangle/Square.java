package rectangle;

public class Square extends Rectangle {
    //int length;
    
    public void calArea() {
        area = length * length;
    }
    
    public Square() {
        
    }
    
    public Square(int length) {
        this.length = length;
        super.length = length;
    }
    
    public void calculate() {
        //
    }
}
