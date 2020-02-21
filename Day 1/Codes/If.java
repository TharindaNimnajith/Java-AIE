public class If {
	public static void main (String args[]) {
		int marks = 115;
		char grade = ' ';  // Intialize grade as a blank space

		if(marks >= 0 && marks < 35)
			grade = 'F';
		else if(marks < 55)
			grade = 'S';
		else if(marks < 65) 
			grade = 'C';
		else if(marks < 75)
			grade = 'B';
		else if(marks < 100)
			grade = 'A';

		System.out.println("Grade is: " +grade);
	}
}