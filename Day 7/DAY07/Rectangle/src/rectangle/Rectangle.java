package rectangle;

public class Rectangle {
    
    int length;
    int width;
    
    public Rectangle(){
        
    }
    public Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    public void printDetails(){
        System.out.println("Length:"+length);
        System.out.println("Width:"+width);
    }
    public int calArea(){
        return 0;
    }
    public static void main(String[] args) {
        
        Rectangle S1=new Square(40);
        System.out.println(S1.calArea());
        S1.printDetails();
        
    }
    
}
