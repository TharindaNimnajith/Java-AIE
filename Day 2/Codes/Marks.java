public class Marks {
    String name;
    int s1, s2, s3;
    double avg;

    public static void main(String args[]) {
        Marks m1 = new Marks("Tharinda", 85, 86, 87);
        m1.calAvg();
    }

    public Marks() {
        name = "";
        s1 = 0;
        s2 = 0;
        s3 = 0;
        avg = 0;
    }

    public Marks(String cname, int mark1, int mark2, int mark3) {
        name = cname;
        s1 = mark1;
        s2 = mark2;
        s3 = mark3;
    }

    public void calAvg() {
        avg = (s1 + s2 + s3) / 3.0;
        System.out.println("Average: " +avg);
    }
}