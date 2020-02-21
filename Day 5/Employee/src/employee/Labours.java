package employee;

public class Labours extends Employee {
    static double basicSalary = 20000.00;
    int OThours;
    double OTpayment;
    double OTrate;
    char shift;
    
    public Labours(String pname, int page, int pID, char pshift, int pOThours) {
        name = pname;
        age = page;
        ID = pID;
        shift = pshift;
        OThours = pOThours;
    }
    
    public void calculateOTpayement(double pOTrate) {
        OTrate = pOTrate;
        OTpayment = OThours * OTrate;
    }
    
    public void calculateSalary() {
        salary = basicSalary + OTpayment; 
    }
}
