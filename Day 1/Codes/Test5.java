public class Test5{
	
	public void findGrade(int marks){
		
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
	
	public static void main(String args[]){
			
			Test5 x = new Test5();
			x.findGrade(80);
					
	}
}