package oopConcept;

public class FinallyOperationCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 3;
		
		try {
			
			if(a<0) {
				
				System.out.println("goods");
			}//else {
				// throw new ArithmeticException("Wrong Value");    
			//} 
		}catch(Exception e) {
			
			System.out.println("exception throw");
			throw new ArithmeticException("Wrong Value");
		}finally {
			
			System.out.println("its always execute");
		}

	}

}

