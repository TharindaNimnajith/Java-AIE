public class Test4{
	
	public static void main(String args[]){
	
		int marks= 80;
		char grade=' ' ;
		
		if(marks>0&&marks<35){
			grade='F';
		
		}else if(marks<45){
			grade='S';
		
		}else if(marks<65){
			grade='C';
			
		}else if(marks<75){
			grade='B';
		
		}else if(marks<=100){
			grade='A';
	
		}
	
		System.out.println("Your Grade:"+grade);
			
	}	
}