package object;

public class Circle {
    
    int radius;
    
    public Circle(){
    
        radius=0;
    }
    public Circle(int pradius){
    
        radius=pradius;
    
    }
    public void calArea(){
    
        double area=3.14*radius*radius;
        System.out.println("Area:"+area);
    }
    
}
