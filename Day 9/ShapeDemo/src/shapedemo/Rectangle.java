package shapedemo;

public class Rectangle implements Shape {
    int length, width, area, perimeter;
    
    /**
     *
     */
    @Override
    public void calArea() {
        area = length * width;
    }
    
    /**
     *
     */
    @Override
    public void calPerimeter() {
        perimeter = 2 * (length + width);
    }
    
    /**
     *
     */
    @Override
    public void printDetails() {
        System.out.println("Length: " +length);
        System.out.println("Width: " +width);
        System.out.println("Area: " +area);
        System.out.println("Perimeter: " +perimeter);
        System.out.println();
    }
    
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
}
