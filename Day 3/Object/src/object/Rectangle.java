package object;

public class Rectangle {   
    private int length;
    private int width;
    
    public Rectangle() {
        length = 0;
        width = 0;
    }
    
    public Rectangle(int l, int w) {
        length = l;
        width = w;
    }
    
    public void calAvg() {
        int area = length * width;
        System.out.println("Area = " +area);
    }    
}
