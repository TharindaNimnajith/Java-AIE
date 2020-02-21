package rectangle;

import java.io.*;  // Importing the JAVA I/O Module
                   // * for importing ALL the methods 

import java.util.Scanner;  // Importing JAVA Utilities

public class Rectangle {
    int length;
    int width;
    int perimeter;
    int area;
    
    static int count;
    
    // Inner class
    // A member of the super class
    // Members of a class:
    // Inner classes, Methods, Data Memebers, Constructors
    private class OutputData {       
        public void fileWrite() throws IOException {
            File outputFile = new File("RectangleData.txt");
            outputFile.createNewFile();  // Creating the file physically

            // FileWriter writer = new FileWriter(outputFile);
            // 'true' converts from write mode to append mode       
            FileWriter writer = new FileWriter(outputFile, true);

            writer.write("Rectangle: " +count);
            writer.write(" Length: " +length);
            writer.write(" Width: " +width);
            writer.write(" Area: " +area);
            writer.write(" Perimeter: " +perimeter);
            //writer.write('\n');

            writer.close();
        }
        
        public void printDetails() {
            // The method 'println' in sub class 'out' in superclass 'System'
            System.out.println("Length = " +length);
            System.out.println("Width = " +width);
            System.out.println("Area = " + area);
            System.out.println("Perimeter = " +perimeter);
            System.out.println();
        }
    }
    
    public Rectangle() {
        length = 0;
        width = 0;
        area = 0;
        perimeter =0;
        
        count++;
    }
    
    public Rectangle(int l, int w) {
        length = l;
        width = w;
        
        count++;
    }
    
/*  public void setData() throws IOException{               
        InputStreamReader input = new InputStreamReader(System.in);
        // In the InputStreamReader it takes one character as the input
        // If a integer / letter is inputted, the ASCII value is taken
        
        System.out.println("Enter length: ");
        length = input.read();
                
        System.out.println("Enter width: \n");
        width = input.read();
    }  */
    
    public void setData() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the length: ");
        length = input.nextInt();
        
        System.out.print("Enter width: ");
        width = input.nextInt();
    }
    
/*  
    public void fileWrite() throws IOException {
        File outputFile = new File("RectangleData.txt");
        outputFile.createNewFile();  // Creating the file physically

        // FileWriter writer = new FileWriter(outputFile);
        // 'true' converts from write mode to append mode       
        FileWriter writer = new FileWriter(outputFile, true);

        writer.write("Rectangle: " +count);
        writer.write(" Length: " +length);
        writer.write(" Width: " +width);
        writer.write(" Area: " +area);
        writer.write(" Perimeter: " +perimeter);
        //writer.write('\n');

        writer.close();
    }
        
    public void printDetails() {
        // The method 'println' in sub class 'out' in superclass 'System'
        System.out.println("Length = " +length);
        System.out.println("Width = " +width);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " +perimeter);
    }
*/
    
    public int calArea() {
        area = length * width;
        return area;
    }
    
    public int calPerimeter() {
        perimeter = 2 * (length + width);
        return perimeter;
    }
    
    public void output() throws IOException {
        OutputData out = new OutputData();
        out.printDetails();
        out.fileWrite();
    }
    
    public static void main(String[] args) throws IOException {
    // public static void main(String[] args) { 
    // Add 'throws IOException' when using inputs to avoid errors 
    // Exception handling
    
        Rectangle r1 = new Rectangle();
        r1.setData();
        r1.calArea();
        r1.calPerimeter();
        r1.output();
        
        Rectangle r2 = new Rectangle(5, 15);
        r2.calArea();
        r2.calPerimeter();
        r2.output();
        
        Rectangle r3 = new Rectangle(25, 20);
        r3.calArea();
        r3.calPerimeter();
        r3.output();
    }   
}
