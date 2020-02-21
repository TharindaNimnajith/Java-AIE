package rectangle;

import java.io.*;
import java.util.Scanner;

public class Rectangle {
	int length;
	int width;
	int perimeter;
	int area;
	
	static int count;
	
	private class OutputData {
		public void fileWrite() throws IOException {
			File outputFile = new File("Rectangle.txt");
			outputFile.createNewFile();
			
			FileWriter writer = new FileWriter(outputFile, true);
			writer.write(" Rectangle: " +count);
			writer.write(" Length: " +length);
			writer.write(" Width: " +width);
			writer.write(" Area: " +area);
			writer.write(" Perimeter: " +perimeter);
			
			writer.close();
		}
		
		public void printDetails() {
			System.out.println("Length = " +length);
			System.out.println("Width = " +width);
			System.out.println("Area = " +area);
			System.out.println("Perimeter = " +perimeter);
			System.out.println();
		}
	}
	
	public Rectangle() {
		length = 0;
		width = 0;
		area = 0;
		perimeter = 0;
	}
	
	public Rectangle(int l, int w) {
		length = l;
		width = w;
		
		count++;
	}
	
	public int calArea() {
		area = length * width;
		return area;
	}
	
	public int perimeter() {
		perimeter = 2 * (length + width);
		return perimeter;
	}
	
	public void output() throws IOException {
		OutputData out = new OutputData();
		out.printDetails();
		out.fileWrite();
	}
	
	public void setData() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length: ");
		length = input.nextInt();
		
		System.out.print("Enter the width: ");
		width = input.nextInt();
	}
	
	public static void main(String[] args) throws IOException {
		Rectangle r1 = new Rectangle();
		r1.setData();
		r1.calArea();
		r1.calPerimeter();
		r1.output();
	}
}