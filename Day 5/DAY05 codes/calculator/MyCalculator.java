package calculator;

public class MyCalculator extends Calculator {
    
    public MyCalculator(){
        System.out.println("Default Constructor-MyCalculator class");
    }
    public int mult(int x,int y){  //multiplication
        ans=x*y;
        return ans;
    }
    
}
