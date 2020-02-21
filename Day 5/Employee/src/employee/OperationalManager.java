package employee;

public class OperationalManager extends Managers {
    static double basicSalary = 70000.00;
    
    public OperationalManager(String pname, int page, int pID, double pmonthlyBonus) {
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
