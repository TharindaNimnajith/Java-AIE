package rectangle;

public class Square extends Rectangle {
    int length;
    public Square(){
        length=0;
    }
    public Square(int clength){
        super.length=clength;
        width=clength;
    }
}
