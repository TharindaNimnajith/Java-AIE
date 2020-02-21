package rectangle;

public class Rectangle {
    private int width;
    private int height;
    int area;
    public Rectangle(){
    
    }
    public Rectangle(int width,int height){
        this.width=width;
        this.height=height;
    }
    public void calArea(){
        area=width*height;
    }
    public void printDetails(){
        System.out.println("Width:"+width);
        System.out.println("Height:"+height);
        System.out.println("Area:"+area);
    }
    public void printDetails(int x){
        
    }
    public static void main(String[] args) {
        Rectangle s1=new Square(10);
        s1.calArea();
        s1.printDetails();
        s1.printDetails(10);
    }
    
}
