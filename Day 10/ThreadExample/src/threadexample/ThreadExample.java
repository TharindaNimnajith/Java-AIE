package threadexample;

//Multithreading
public class ThreadExample {
    public static void main(String[] args) {
        //Thread t1 = new Thread() {};
        Thread t1;
        t1 = new Thread() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++){
                    System.out.println("Thread 1: i = " +i);
                }
            }
        };
        
        //Thread t2 = new Thread() {};
        Thread t2;
        t2 = new Thread() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++) {
                    System.out.println("Thread 2: i = " +i);
                }
            }
        };
        
        t1.start();
        t2.start();
    }    
}
