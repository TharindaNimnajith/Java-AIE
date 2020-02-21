package print;

public class Print {
    
    public void max(int... num){
        int max;
        max=num[0];
        for(int i=1;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println("Maximum Value:"+max);
    } 
    public static void main(String[] args) {
        Print p1=new Print();
        p1.max(10,20,30,40,200,195);
    }
    
}
