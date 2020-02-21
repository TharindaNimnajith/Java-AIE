package employee;

public class FactoryManager extends Managers {
    static double basicSalary = 50000.00; 
    
    public FactoryManager(String pname, int page, int pID, double pmonthlyBonus) {
        name = pname;
        age = page;
        ID = pID;
        monthlyBonus = pmonthlyBonus;
    }
    
    public void calculateTotalAllowance() {
        totalAllowance = monthlyBonus + fuelAllowance;
    }
    
    public void calculateSalary() {
        salary = basicSalary + totalAllowance;
    }
}
