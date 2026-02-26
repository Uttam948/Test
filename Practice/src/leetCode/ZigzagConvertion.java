package leetCode;

public class ZigzagConvertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	int arr[] = new int[6+1];
		
	//	System.out.println(fabonacci(6));
		fabtopdown(5);
		
	}
     static int i =0;
	public static int fabonacci(int n ) {
		
	      if(n == 1) {
	    	  return 1;
	      }
	      if(n == 0) {
	    	  return 0;
	      }
	      // n =2
	      int a = fabonacci(n-1) + fabonacci(n-2);
	      
	     // System.out.println(a);
	      return a;
	}
	
	public static int fabtopdown(int n ) {
		
		int a= 0, b = 1;
		int c = 0;
		
		while(n > 0) {
				
			c = a + b;
			a = b;
			b = c ;
			n--;
			
		}
		System.out.println(c);
		return c;
	     
	}
}
