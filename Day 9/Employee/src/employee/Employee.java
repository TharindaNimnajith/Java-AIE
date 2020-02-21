package employee;

public abstract class Employee {
    private String name;
    private int id;
    protected double salary;
    
    public Employee() {
        name = "";
        id = 0;
        salary = 0; 
    }
    
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    public void printDetails() {
        System.out.println("Name: " +name);
        System.out.println("ID: " +id);
        System.out.println("Salary: " +salary);
        System.out.println();
    }
    
    public abstract void calSalary();
    
    public static void main(String[] args) {
        //Employee emp1 = new Employee("Tharinda", 100);
        
        Salary s1 = new Salary("Pasan", 123, 50000.00);
        s1.calSalary();
        s1.printDetails();
        
        Employee s2 = new Salary("Tharinda", 254, 40000.00);
        s2.calSalary();
        s2.printDetails();
    }  
}
