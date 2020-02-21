package led;

public class LED {
    static int SIZE1 = 3;
    static int SIZE2 = 7;
    static int i;

    int pinNo;
    boolean status;
    
    //int[] colour = new int[SIZE1];
    int[] colour; //Size is not declared in JAVA arrays at initialization

    public LED() {
        pinNo = 0;
        status = false;

        for(i = 0; i < SIZE1; i++)
            colour[i] = 0;
    }

    public void setPinNo(int pinNo) {
        this.pinNo = pinNo;
        //this.pinNo -> instance variable
        //pinNo -> local variable

        status = false;
    }

    /*
    public void setColour(int[] colour) {                
        for(i = 0; i < SIZE1; i++)
            this.colour[i] = colour[i];
    }
    */
    
    public void setColour(int red, int green, int blue) {                
        colour[0] = red;
        colour[1] = green;
        colour[2] = blue;
    }
    
    public void on() {
        status = true;
    }

    public void off() {
        status = false;
    }

    public static void main(String[] args) {
        LED[] led = new LED[SIZE2];  //Array of objects (7 objects)
        //int[] x = new int[3]; -> x is an integer array with 3 elements
        
        for(i = 0; i < SIZE2; i++) {
            led[i] = new LED();  //Initializing each object in the object array
            led[i].setPinNo(i + 1);
        }
        
        led[0].setColour(255, 0, 0);
        led[1].setColour(255, 127, 0);
        led[2].setColour(255, 255, 0);
        led[3].setColour(0, 255, 0);
        led[4].setColour(0, 0, 255);
        led[5].setColour(75, 0, 130);
        led[6].setColour(148, 0, 211);
        
        for(i = 0; i < SIZE2; i++)
            led[i].on();
        
        for(i = 0; i < SIZE2; i++)
            led[i].off();
    }
}    
