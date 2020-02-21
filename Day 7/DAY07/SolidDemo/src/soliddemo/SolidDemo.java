package soliddemo;

public class SolidDemo {

    public static void main(String[] args) {
        Cube cb1=new Cube(10);
        cb1.setDensity(200);
        cb1.calVolume();
        cb1.calMass();
        cb1.printDetails();
    }
    
    
}
