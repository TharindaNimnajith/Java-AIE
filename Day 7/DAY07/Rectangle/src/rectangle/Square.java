package rectangle;
    
public class Square extends Rectangle{
    int area;
    public Square(int length){
        this.length=length;
    }
    public void printDetails(){
        super.printDetails();
    }
    public int calArea(){
        area=length*length;
        return area;
    }
    
}
