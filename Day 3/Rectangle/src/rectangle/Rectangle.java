package rectangle;

public class Rectangle {
    //Instant variables (Data Members)
    //Instant variables are created for each and every object
    //Instant variables are declared inside the class, but outside any method, constructor or block
    //Instant variables have default values; for numbers, the default value is 0, for booleans, the default value is false, and etc
    //Instant variables are created when an object is created with the use of the keyword 'new'
	//Instant variables are destroyed when the object is destroyed
    int width;
    int length;
    int c;  //Rectangle class have many copies of the 'c' variable (one 'c' variable per object)

    //Class variables (Static variables)
    //Class variables are declared with the 'static' keyword within a class, but outside of any method, constructor or a block
	//There will be only one copy of the class variable in a class regardless of the number of objects created from it
	//Static variables are created when the program starts
	//Static variables ends when the program ends
	//Static variables have default values as similar to instant variables
    static int count; //Rectangle class has only one 'count' variable regarless of how many objects the Rectangle class has
	//Can create other static variables in using another name
	//For example:-
    //static int counter = 0;

    public void calcArea() {
        //Local variables
        //Local variables are declared within the methods, constructors and blocks
		//Local variables are visible only within the declared method, constructor or the block
		//Local variables does not have default values so must be assigned a value within the method, constructor or block
		//Local variables are created when the method, constructor or the block is entered
		//Local variables are destroyed once the exit of the method, constructor or block
        int area;
        //System.out.println("Area = " +area);
        //Error: The valiable area is not initialized

        area = width * length;
        System.out.println("Area = " +area);
        System.out.println();
    }

    public Rectangle() {
        width = 0;
        length = 0;

        c++;
        System.out.println("C = " +c);

        count++;
        System.out.println("Count = " +count);
    }

    public Rectangle(int l, int w) {  //l & w are local variables
        width = w;
        length = l;

        c++;
        System.out.println("C = " +c);

        count++;
        System.out.println("Count = " +count);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 4;
        r1.width = 2;
        r1.calcArea();

        Rectangle r2 = new Rectangle(10, 3);
        r2.calcArea();

        Rectangle r3 = new Rectangle();
        r3.calcArea();

        Rectangle r4 = new Rectangle(5,5);
        r4.calcArea();
    }
}