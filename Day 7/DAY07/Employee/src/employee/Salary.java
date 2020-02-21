package employee;
public class Salary extends Employee{
    double basicSal;
    public Salary(String name,int ID,double basicSal){
        super(name,ID);
        //this.name=name;
        //this.ID=ID;
        this.basicSal=basicSal;
    }
    public void calSalary(){
        salary=basicSal*1.20 +10000;
    }
}
