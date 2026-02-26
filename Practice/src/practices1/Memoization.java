package practices1;

public class Memoization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "PAHNAPLSIIGYIR";
		char ver[] = str.toCharArray();
		char hor[] = str.toCharArray();
       
		factorial(6);
	}
	
	public static int factorial(int n) {
		
		if(n == 1) {
			return 1;
		}
		
		 return n;
	}

}
