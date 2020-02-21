package employee;

public class Salary extends Employee {
    double basicSal;
    
    public Salary(String name, int id, double basicSal) {
        super(name, id);
        this.basicSal = basicSal;
    }
    
    public void calSalary() {
        salary = basicSal * 1.20 + 10000.00;
    }
}
