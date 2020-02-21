package maths;
public class Maths {
    
    Print p1=new Print();
    int x;
    int y;
    
    private class Print{
        
        public void out(int x){
            System.out.println("Minimum:"+x);
        }
        public void out(double x){
            System.out.println("Minimum:"+x);
        }
        
    }
    public void min(int x,int y){
        
        int minVal;
        
        if(x>y){
            minVal=y;
        }else{
            minVal=x;
        }
        p1.out(minVal);
    }
    public void min(double x,double y){
        
        double minVal;
        
        if(x>y){
            minVal=y;
        }else{
            minVal=x;
        }
        p1.out(minVal);
    }    
    public static void main(String[] args) {
        
        Maths m1=new Maths();
        m1.min(10,20);
        m1.min(25.8,17.3);
    }
    
}