public class Functions {
	public void findGrade(int marks) {
		char grade = ' ';

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

	public static void main(String args[]) {
		Functions f = new Functions();
		f.findGrade(73);
	}
}