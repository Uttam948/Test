package practices1;

public class NumberPelindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 34534;
		int a =0; 
		while(num != 0) {
			
			int b = num% 10 ; 
			 num = num /10 ;
			 
			  a = a*10 + b;
			  
			  System.out.println(b);
			 
		}
		
		System.out.println(a);
		
	}

}
