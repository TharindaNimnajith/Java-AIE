package employee;

public class Salary extends Employee {
    double salary;
    double basicSalary;
    
    public Salary(String name, int id, double basicSalary) {
        super(name, id); 
        //Calling Super class constructor for name & id
        //Equals to -> Employee(name, id)
        //this.name = name;
        //this.id = id;
        
        this.basicSalary = basicSalary;
    }
        
    /**
     *
     */
    @Override
    public void calSalary() {
        salary = basicSalary * 1.2 + 10000;
        super.setSalary(salary);
    }  
}
