package print;

public class Print {    
    //Variable argument type methods
    //Variable length type array
    //Array size not pre-defined   
    public void out(int... num) {
        for(int i = 0; i < num.length; i++)
            System.out.println(num[i]);
        System.out.println();
    }
    
    public void max(int... num) {
        int max = num[0];
        for(int i = 0; i < num.length; i++)
            if(max < num[i])
                max = num[i];
        System.out.println("Maximum: " +max);
    }
    
    public static void main(String[] args) {       
        Print p1 = new Print();
        p1.out(10);
        p1.out(1, 2, 3, 4, 5);
        p1.max(1, -2, 8, 0, 5);
    }   
}
