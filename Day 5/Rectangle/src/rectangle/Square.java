package rectangle;

public class Square extends Rectangle {
    int length;
    //int length;
    
    public Square() {
        length = 0;
    }
    
    public Square(int l) {
        //length = width = l;
        //length = l;
        //length = w;
        super.length = width = l;
    }
}