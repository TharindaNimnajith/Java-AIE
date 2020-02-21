package calculator;
public class Calculator {
    
    int ans;        //instance variable
    
    public Calculator(){
        System.out.println("Default Constructor-Calculator Class");
    }
    public int add(int x,int y){
        ans=x+y;
        return ans;
    }
    public int sub(int x,int y){
        ans=x-y;
        return ans;
    }
    public static void main(String[] args) {
        MyCalculator cal1=new MyCalculator();
        int ans=cal1.mult(5,10);
        System.out.println("Answer:"+ans);
    }  
}
