package solid;

public class Solid {
    double density, volume;
    static double pi = 3.14;
    
    public Solid() {
        density = 0;
    }
    
    public double Volume() {
        return 0;
    }
    
    public double mass() {
        return density * volume;
    }
    
    public void display() {
        System.out.println("Volume = " +volume);
        System.out.println("Mass = " +mass());
        System.out.println();
    }
    
    public double getRadius() {
        System.out.println("In getRadius function in Solid class");
        return 0;
    }
    
    public static void main(String[] args) {
        /*
        Sphere Sphere1 = new Sphere(50, 7850);
        Sphere Sphere2 = new Sphere(40, 7850);
        Cylinder Cylinder1 = new Cylinder(5, 100, 7850);
        
        Sphere1.display();
        Sphere2.display();
        Cylinder1.display();
        
        double totV = Sphere1.Volume() + Sphere2.Volume() + Cylinder1.Volume();
        double totM = Sphere1.mass() + Sphere2.mass() + Cylinder1.mass();
        
        System.out.println("Total Volume = " +totV);
        System.out.println("Total Mass = " +totM);
        */
        
        Solid[] solid = new Solid[3];
        solid[0] = new Sphere(50, 7850);
        solid[1] = new Sphere(40, 7850);
        solid[2] = new Cylinder(5, 100, 7850);
        
        double totV = 0, totM = 0;
        
        for(int i = 0; i < 3; i++) {           
            totV += solid[i].Volume();
            totM += solid[i].mass();
        }
        
        System.out.println(solid[0].getRadius());
        
        //System.out.println("Total Volume = " +totV);
        //System.out.println("Total Mass = " +totM);
    }    
}
