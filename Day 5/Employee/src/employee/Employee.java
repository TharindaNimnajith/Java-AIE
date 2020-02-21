package employee;

public class Employee {
    String name;
    int age;
    int ID;
    double salary;

    public void printDetails() {
        System.out.println("Name: " +name);
        System.out.println("ID: " +ID);
        System.out.println("Salary: " +salary);
        System.out.println();
    }
    
    public static void main(String[] args) {
        Labours l1 = new Labours("Tharinda", 20, 111, 'A', 10);        
        l1.calculateOTpayement(150.00);
        l1.calculateSalary();
        l1.printDetails();
        
        FactoryManager f1 = new FactoryManager("Thisura", 21, 123, 5000.00);
        f1.calculateFuelAllowance(20);
        f1.calculateTotalAllowance();
        f1.calculateSalary();
        f1.printDetails(); 
        
        OperationalManager o1 = new OperationalManager("Pasan", 22, 245, 10000.00);
        o1.calculateFuelAllowance(10);
        o1.calculateTotalAllowance();
        o1.calculateSalary();
        o1.printDetails();       
    }   
}
