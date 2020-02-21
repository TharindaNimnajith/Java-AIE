package rectangle;

public class Details {
        
    public void print(Rectangle rect){
        System.out.println("Length:"+rect.length);
        System.out.println("Width:"+rect.width);
        System.out.println("Area:"+rect.area);
        System.out.println("Perimeter:"+rect.perimeter);
        
        rect.test();
    }
}
