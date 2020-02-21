package maths;

public class Maths {
    //int x;
    //int y;
    //Each object created from the Maths class have variables named x and y.

    //Similarly, each object created from the Maths class have an object named p1 created from the Print inner class.
    Print p1 = new Print();
    
    //Overloaded Methods
    public int min(int x, int y) {
        if(x > y)
            return y;       
        else 
            return x;
    }
    
    public double min(double x, double y) {
        if(x > y)
            return y;       
        else 
            return x;
    }
    
    public void MIN(int x, int y) {
        int minVal;
        
        if(x > y)
            minVal = y;       
        else 
            minVal = x;
        
        p1.out(minVal);
    }
    
    public void MIN(double x, double y) {
        double minVal;
        
        if(x > y)
            minVal = y;       
        else 
            minVal = x;
        
        p1.out(minVal);
    }
    
    public void print(int x) {
        System.out.println("Integer: " +x);
    }
    
    public void print(String x) {
        System.out.println("String: " +x);
    }
    
    //Inner class
    private class Print {
        public void out(int x) {
            System.out.println("Minimum: " +x);
        }

        public void out(double x) {
            System.out.println("Minimum: " +x);
        }
    }
    
    public static void main(String[] args) {
        Maths m1 = new Maths();
        
        System.out.println("Minimum value = " +m1.min(10, 20));
        System.out.println("Minimum value = " +m1.min(25.8, 17.3));
        System.out.println();
        
        m1.print(5);
        m1.print("Tharinda");
        System.out.println();
        
        //System.out.print
        
        m1.MIN(10, 20);
        m1.MIN(8, 17.3);    
    }
}
