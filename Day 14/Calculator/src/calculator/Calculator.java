package calculator;

public class Calculator {
    public int add(int x, int y) {
        return x + y;
    }
    
    public int add(int x, int y, int z) {
        return x + y + z;
    }
    
    public static void main(String[] args) {
        Calculator c = new Calculator();
        
        System.out.println(c.add(10, 20));
        System.out.println(c.add(10, 20, 30));        
    }  
}