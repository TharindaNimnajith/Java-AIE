package led;

    public class LED {    
        int pinNo;
        boolean status;
        int[] color;        //do not include size of the array at initilization
    public LED(){
        pinNo=0;
        status=false;
        color[0]=0;
        color[1]=0;
        color[2]=0;
    }
    public void setPinNo(int pinNo){
        this.pinNo=pinNo;
        status=false;
    }
    public void setColor(int red,int green,int blue){
        color[0]=red;
        color[1]=green;
        color[2]=blue;
    }
    public void on(){
        status=true;
    }
    public void off(){
        status=false;
    }
    public static void main(String[] args) {
        LED[] led=new LED[7];       //creating a LED array of 7 LED objects
        //int[] x=new int[3];
        for(int i=0;i<7;i++){       //Initializing each object
            led[i]=new LED();
        }
    
        led[0].setColor(255, 0, 0);
        led[1].setColor(255, 127, 0);
        led[2].setColor(255, 255, 0);
        led[3].setColor(0, 255, 0);
        led[4].setColor(0, 0, 255);
        led[5].setColor(75, 0, 130);
        led[6].setColor(148, 0, 211);
        
        for(int i=0;i<7;i++){
            led[i].on();
        }
        
        for(int i=0;i<7;i++){
            led[i].off();
        }
    }
    
}
