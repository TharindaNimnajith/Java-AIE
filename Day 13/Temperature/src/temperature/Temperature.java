package temperature;

import java.util.Scanner;

public class Temperature {
    private double temperature;
    
    public Temperature() {
        temperature = 0;       
        input();
    }
    
    public void input() {
        Scanner keyboardInput = new Scanner(System.in);
        
        System.out.print("Enter the Temperature: ");
        temperature = keyboardInput.nextDouble();
    }
    
    public Temperature(double temperature) {
        this.temperature = temperature;
    }
    
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    
    public double getTemperature() {
        return temperature;
    }
    
    public boolean isEthylFreezing() {
        if(temperature <= -173)
            return true;
        else
            return false;
    }
    
    public boolean isEthylBoiling() {
        if(temperature >= 172)
            return true;
        else
            return false;
    }
    
    public boolean isOxygenFreezing() {
        if(temperature <= -362)
            return true;
        else
            return false;
    }
    
    public boolean isOxygenBoiling() {
        if(temperature >= -306)
            return true;
        else
            return false;
    }
    
    public boolean isWaterFreezing() {
        if(temperature <= 32)
            return true;
        else
            return false;
    }
    
    public boolean isWaterBoiling() {
        if(temperature >= 212)
            return true;
        else
            return false;
    }
    
    public void display() {
        System.out.println();
        
        if(isEthylFreezing() == true)
            System.out.println("Ethyl Alcohol will Freeze");
        
        if(isEthylBoiling() == true)
            System.out.println("Ethyl Alcohol will Boil");
        
        if(isOxygenFreezing() == true)
            System.out.println("Oxygen will Freeze");
        
        if(isOxygenBoiling() == true)
            System.out.println("Oxygen will Boil");
        
        if(isWaterFreezing() == true)
            System.out.println("Water will Freeze");
        
        if(isWaterBoiling() == true)
            System.out.println("Water will Boil");
        
        System.out.println();
    }
    
    public static void main(String[] args) {
        Temperature temperature1 = new Temperature();                      
        temperature1.display();
    }  
}
