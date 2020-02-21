package solid;

public class Cylinder extends Solid {
    double radius, height;
    
    public Cylinder() {
        radius = 0;
        height = 0;
        density = 0;
    }
    
    public Cylinder(double radius, double height, double density) {
        this.radius = radius;
        this.height = height;
        this.density = density;
    }
    
    public double Volume() {
        volume = pi * radius * radius * height; 
        return volume;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getHeight() {
        return height;
    }
}
