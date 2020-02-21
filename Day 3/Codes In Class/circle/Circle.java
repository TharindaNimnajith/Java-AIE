package circle;     

public class Circle {
    
    int radius;     //instance variables-data memebers
    static int count=0;   //class(static) variable
    
    public Circle(){
        
        radius=0;   
        count=count+1;
        System.out.println("COUNT:"+count);
        
    }
    public Circle(int pradius){
    
        radius=pradius;
        count=count+1;
        System.out.println("COUNT:"+count);
    
    }
    public void calArea(){
        
        double area;  
        area=3.14*radius*radius;
        System.out.println("Area="+area);
    }

    public static void main(String[] args) {
        
        Circle cr1=new Circle();
        cr1.radius=10;
        cr1.calArea();
        
        Circle cr2=new Circle(20);
        cr2.calArea();
        
        Circle cr3=new Circle();
        Circle cr4=new Circle();
    
    }
    
}
