package employee;

public class FactoryManager extends Manager {
    
    public FactoryManager(String cname,int cage,int cID,int cbonus){
        name=cname;
        age=cage;
        ID=cID;
        Monthlybonus=cbonus;
    }
    
    public void CalSalary(){
        salary=50000+totalAllowance;
    }
}
