package soliddemo;

public class Cube implements Solid {
    
    double length;
    double volume;
    double mass;
    double density;
    
    public Cube(double length){
        this.length=length;
    }
    public double calVolume(){
        volume=length*length*length;
        return volume;
    }
    public double calMass(){
        mass=volume*density;
        return mass;
    }
    public void printDetails(){
        System.out.println("Length:"+length);
        System.out.println("Volume:"+volume);
        System.out.println("Mass:"+mass);
    }
    public void setDensity(double density){
        this.density=density;
    }
}
