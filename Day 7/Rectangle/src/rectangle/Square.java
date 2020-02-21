package rectangle;

public class Square extends Rectangle {
    public Square(int length) {
        this.length = length;
    }
    
    public int calArea() {
        //int area = super.calArea();
        //return area;
        return length * length;
    }
            
    public void printDetails() {
        //super.printDetails();
        System.out.println("Length: " +length);
        System.out.println();
    }
}
