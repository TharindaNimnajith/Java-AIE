package employee;

public class OperationalManager extends Manager {
    
    public OperationalManager(String cname,int cage,int cID,int cbonus){
        name=cname;
        age=cage;
        ID=cID;
        Monthlybonus=cbonus;
    }
    
    public void CalSalary(){
        salary=70000+totalAllowance;
    }
}