package soliddemo;

//All the methods defined in the Solid interface must be implemented here
//Other methods can also be implemented other than the methods in the interface
public class Cube implements Solid {
    double length, volume, mass, density;
    
    public Cube(double length) {
        this.length = length;
    }
    
    public double calVolume() {
        volume = length * length * length;
        return volume;
    }
    
    public double calMass() {
        mass = volume * density;
        return mass;
    }
    
    public void printDetails() {
        System.out.println("Length: " +length);
        System.out.println("Volume: " +volume);
        System.out.println("Density: " +density);
        System.out.println("Mass: " +mass);
        System.out.println();
    }
    
    public void setDensity(double density) {
        this.density = density;
    }
}
