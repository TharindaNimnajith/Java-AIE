package solid;
public class Solid {
    double density;
    double volume;
    double pi=3.14;
    public double Volume(){
        return 0;
    }
    public double mass(){
        double m;
        m=volume*density;
        return m;
    }
    public void display(){
        System.out.println("Volume:"+volume);
        System.out.println("Mass:"+mass());
    }
    public double getRadius(){
        System.out.println("In getRadius Method-in Solid class");
        return 0;
    }
    public static void main(String[] args) {
       //Sphere sp1=new Sphere(50,7850);
        //Sphere sp2=new Sphere(40,7850);
        //Cylinder cl1=new Cylinder(5,100,7850);
        
        //double totVol,totMass;
        
        //totVol=sp1.Volume()+sp2.Volume()+cl1.Volume();
        //totMass=sp1.mass()+sp2.mass()+cl1.mass();
        
        //System.out.println("Total Volume:"+totVol);
        //System.out.println("Total Mass:"+totMass);
        
        Solid[] sl=new Solid[3];
        
        sl[0]=new Sphere(50,7850); 
        sl[1]=new Sphere(40,7850); 
        sl[2]=new Cylinder(5,100,7850);
        
        System.out.println(sl[0].getRadius());
        
        double totVol=0,totMass=0;
 
        for(int i=0;i<3;i++){
            totVol=totVol+sl[i].Volume();
            totMass=totMass+sl[i].mass();
        }
        
        System.out.println("Total Volume:"+totVol);
        System.out.println("Total Mass:"+totMass);        
    }  
}
