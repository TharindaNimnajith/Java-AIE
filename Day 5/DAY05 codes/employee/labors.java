package employee;
public class labors extends Employee {
    int OThours;
    double OTpayment;
    double OTrate;
    char shift;
    
    public labors(String cname,int cage,int cID,char cshift,int cOThours){
        name=cname;
        age=cage;
        ID=cID;
        shift=cshift;
        OThours=cOThours;
    }
    public void calOTpayment(double cOTrate){
        OTrate=cOTrate;
        OTpayment=OThours*OTrate;
    }
    
    public void CalSalary(){
        salary=20000+OTpayment;
    }
    
}
