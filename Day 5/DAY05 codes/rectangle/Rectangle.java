package rectangle;

public class Rectangle {
    protected int length;
    protected int width;
    protected int area;
    protected int perimeter;
    
    public Rectangle(){
        length=width=area=perimeter=0;
    }public Rectangle(int clength,int cwidth){
        length=clength;
        width=cwidth;
    }
    public void calArea(){
        area=length*width;
    }
    public void calPerimeter(){
        perimeter=2*(length+width);
    }
    public void test(){
        System.out.println("In Rectangle class-Test Method");
    }
    public static void main(String[] args) {
        Square S1=new Square(10);
        S1.calArea();
        S1.calPerimeter();
        
        Rectangle R1=new Rectangle(10,20);
        R1.calArea();
        R1.calPerimeter();
        
        Details d1=new Details();
        d1.print(R1);
    }
    
}
