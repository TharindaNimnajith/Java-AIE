package library;

public class Employees extends Members {
    double salary, basicSal, bonus;
    
    public Employees() {
        super();
        salary = 0;
    }
    
    public Employees(String name, int id, double basicSal, double bonus) {
        super(name, id);
        this.basicSal = basicSal;
        this.bonus = bonus;
    }
    
    public void calSalary() {
        salary = basicSal + basicSal * bonus;
    }
}
