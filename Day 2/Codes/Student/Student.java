public class Student {  //Main Class

    //Data Members / Attributes / Properties (Variables)
    String name;
    int age;
    double marks;

    //Main method
    public static void main(String[] args) {
        //Creating an object for the Student class
        Student s1 = new Student();
        Student s2 = new Student("Nuvindu", 21, 101);
        Student s3 = new Student("Pathum", 21);

        //s1.enterDetails("Tharinda", 20, 100);
        //s1.printDetails();

        //s2.enterDetails("Nuvindu", 21, 101);
        //s2.printDetails();

        //s3.printDetails();
    }


    //Other functions (Methods)

    //Constructor
    // A special kind of a method
    //Same name of the Class
    //No return type

/*  public Student() {
        System.out.println();
        System.out.println("Inside the Contructor");
        System.out.println();
    }  */

    public Student() {  //Default Constructor
        //No parameters
        //One per class
        //Initializing the data members
        name = "";
        age = 0;
        marks = 0;

        System.out.println("Inside the Default Constructor");
    }

    public Student(String cname, int cage, double cmarks) {  //Overloaded Constructor 1
        //Any number of overloaded constructors per class
        //Have parameters
        //Assign values for the data members of objects
        name = cname;
        age = cage;
        marks = cmarks;

        System.out.println("Inside the Overloaded Constructor 1");
    }

    public Student(String cname, int cage) {  //Overloaded Constructor 2
        name = cname;
        age = cage;

        System.out.println("Inside the Overloaded Constructor 2");
    }

    public void printDetails() {
        System.out.println();
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Marks: " +marks);
    }

    public void enterDetails(String cname, int cage, double cmarks) {
        name = cname;
        age = cage;
        marks = cmarks;
    }
}