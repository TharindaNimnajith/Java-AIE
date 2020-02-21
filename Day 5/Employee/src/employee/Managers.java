package employee;

public class Managers extends Employee {
    static double price = 150.00;
    double monthlyBonus;
    double fuelAllowance; 
    int liters;
    double totalAllowance;
    
    public void calculateFuelAllowance(int pliters) {
        fuelAllowance = pliters * price;
    }
}
