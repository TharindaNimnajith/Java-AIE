package calculator;

public class Calculator {
    int ans;
    
    public Calculator() {
        System.out.println("Default Constuctor - Calculator Class");
    }
    
    public int add(int x, int y) {
        ans = x + y;
        return ans;
    }
    
    public int sub(int x, int y) {
        ans = x - y;
        return ans;
    }
    
    public static void main(String[] args) {
        int ans;
        
        Calculator calc = new Calculator();
        ans = calc.add(4, 6);
        System.out.println("Answer = " +ans);
        
        MyCalculator cal = new MyCalculator();
        
        ans = cal.mult(5, 6);
        System.out.println("Answer = " +ans);
        
        ans = cal.add(5, 10);
        System.out.println("Answer = " +ans);
    }    
}
