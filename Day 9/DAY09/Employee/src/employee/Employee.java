package employee;
public abstract class Employee {
    
    private String name;
    private int ID;
    double salary;
    
    public Employee(){
    
    }
    public Employee(String name,int ID){
        this.name=name;
        this.ID=ID;
    }
    public void printDetails(){
        System.out.println("Name:"+name);
        System.out.println("ID:"+ID);
        System.out.println("Salary:"+salary);
    }
    public abstract void calSalary();
    
    public static void main(String[] args) {
        //Employee emp1=new Employee("John",1234);
        Employee s1=new Salary("John",1234,50000);
        s1.calSalary();
        s1.printDetails();
    }
    
    
}
