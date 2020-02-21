package object;

public class Rectangle {
    
    private int width;
    private int length;
    
    public Rectangle(){
        
        width=0;
        length=0;
    
    }
    public Rectangle(int plength,int pwidth){
    
        length=plength;
        width=pwidth;
        
    }
    public void calArea(){
    
        int area;
        area=length*width;
        
        System.out.println("Area:"+area);
    
    }
    
    
}