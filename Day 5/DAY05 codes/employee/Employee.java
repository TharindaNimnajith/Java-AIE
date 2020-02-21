package employee;
public class Employee {
    String name;
    int age;
    int ID;
    double salary;
  
    public void PrintDetails(){
        System.out.println("Name:"+name);
        System.out.println("ID:"+ID);
        System.out.println("Age:"+age);
        System.out.println("Salary:"+salary);
    }
    
    public static void main(String[] args) {
        labors l1=new labors("John",34,1000,'A',45);
        l1.calOTpayment(120);
        l1.CalSalary();
        l1.PrintDetails();
        
        OperationalManager OM1=new OperationalManager("William",43,1001,25000);
        OM1.calFuelAllow(200);
        OM1.calTotalAllow();
        OM1.CalSalary();
        OM1.PrintDetails();
    }
    
}