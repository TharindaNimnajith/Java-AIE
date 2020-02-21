package calculator;

//public class MyCalculator {

//Calculator - Parent / Super / Base class
//MyCalculator - Child / Sub / Derived class
//MyCalculator class inherits the data memebers, methods, constuctors 
//of the Calculator class
public class MyCalculator extends Calculator {
    //int ans;
    
    public MyCalculator() {
        System.out.println("Default Constructor - MyCalculator Class");
    }
    
    public int mult(int x, int y) {
        ans = x * y;
        return ans;
    }
}
