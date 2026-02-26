package practices1;

public class ExceptionHandlingconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =10;
		
		try {
			
			
			a = a/0;
			  
		}catch(ArithmeticException e) {
			
			System.out.println("what is your name");
		
		}catch(ArrayIndexOutOfBoundsException e ) {
			
			System.out.println("My name is lulu");
		}
		finally{
			
			System.out.println("Finally");
			
		}
	}

}
