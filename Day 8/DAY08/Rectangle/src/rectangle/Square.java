package rectangle;

public class Square extends Rectangle {
    int height;
    public Square(int height){
        //super.height=height;
        //super.width=height;
        super(height,height);
        this.height=height;     
    }
    public void printDetails(){
        System.out.println("Height:"+height);
    }
    public void printDetails(int x){
        System.out.println("X:"+x);
    }
}
