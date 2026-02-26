package practices1;

public class Recurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             recurr(5);
	}
	
	static String st = "1";
	
     

	public static int recurr(int n ) {
		
	     if(n == 0) {
	    	 return 1;
	     }
		
	     int b = recurr(n-1);
	     
		if(n > 0) {
			
               
			
			return recurr(n-1);
			
			
		}else {
		
			return n;
		}
	}
}
