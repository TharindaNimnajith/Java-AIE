public class Array {
	
	public static void main (String args[]) {

		/* 

			In C Programming Language:

			int array[]

		*/	

		int[] array = {10, 20, 30, 40, 50};

		for(int x: array) {  // x in array

			System.out.println(x);

		}

		System.out.println();


		// Another Method:

		for(int i = 0; i < 5; i++) {

			System.out.println(array[i]);

		}

		System.out.println();


		// String Array:

		String[] names = {"Tharinda", "Thisura", "Pasan"};

		for(String y: names) {

			System.out.println(y);

		} 

	}

}