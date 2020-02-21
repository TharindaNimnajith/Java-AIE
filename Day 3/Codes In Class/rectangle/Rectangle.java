package rectangle;

public class Rectangle {

    int width;          //data members
    int length;
    
    public void calArea(){      //method
        
        int area;
        area= width*length;
        
        System.out.println("Area="+area);
    
    }
    
    public Rectangle()   {         //constructor (default constructor)
        
        System.out.println("In Default Constructor");
    
    }
    public Rectangle(int pwidth,int plength){
        
        System.out.println("In overloaded Constructor");
        
        width=pwidth;
        length=plength;
    
    }
    
    public static void main(String[] args) {
        
        Rectangle rect1=new Rectangle();    //creating a object of Rectangle class
        rect1.length=10;
        rect1.width=20;
        rect1.calArea();
        
        //Rectangle rect2=new Rectangle(5,10);      
        //rect2.calArea();
        
    }
    
}