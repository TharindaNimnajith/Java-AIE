package solid;

public class Sphere extends Solid {
    double radius;
    
    public Sphere() {
        volume = 0;
        density = 0;
    }
    
    public Sphere(double radius, double density) {
        this.radius = radius;
        this.density = density;
    }
    
    public double Volume() {
        volume = 4 * pi * radius * radius * radius / 3;
        return volume;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
}
