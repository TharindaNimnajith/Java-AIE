package employee;
public class Manager extends Employee{
    
    int Monthlybonus;
    double fuelAllow;
    int liters;
    double totalAllowance;
    
    public void calFuelAllow(int cliters){
        fuelAllow=liters*147;
    }
    public void calTotalAllow(){
        totalAllowance=Monthlybonus+fuelAllow;
    }
}
