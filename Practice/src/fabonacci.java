
public class fabonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 System.out.println(fabonacci.f(6));

	}

	public static int f(int n) {
		
		if(n == 1  ) {
			//System.out.println(n);
			return 1;
		}
		if(n==0) {
			return 0;
		}
		
	   int b =  f(n-1)  + f(n-2);
	   System.out.println(b);
	   return b;
		
	         
	         
	}
}
