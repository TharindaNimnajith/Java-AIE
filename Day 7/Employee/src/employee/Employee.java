package employee;

//Abstract class can't be used to create any objects
//The child class can access everything from the parent class (if permitted)
//Abstraction used for the safety of the methods, data members of the class
//In OOP, Abstraction is a process of hiding the implementationdetails from the 
//user (Only the functionality will be provided to the user)
//In other words, the user will have the information on what the object does, 
//but not how it does it
public abstract class Employee {
    String name;
    private int id;
    //int id;
    double salary;
    
    public Employee() {}
    
    //private Employee(String name, int id) {
    //protected Employee(String name, int id) {
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
    
    public void setSalary(double salary) {
        this.salary = salary;
    }   
        
    //public void calSalary() {}
    
    public abstract void calSalary(); 
    //Abstract method
    //Defining the method in the parent class (for reference)
    //Actual implementation of the method is in the child class
    //Abstract methods can only be defined inside the Abstract classes
    //Body or curly braces are not needed in a abstract method
    
    public static void main(String[] args) {
        //Employee e1 = new Employee("Tharinda", 100);
        
        Salary s1 = new Salary("Tharinda", 100, 40000);
        s1.calSalary();
        s1.printDetails();
        
        Employee e1 = new Salary("Nuvindu", 200, 50000);
        e1.calSalary();
        e1.printDetails();
    }    
}
