package leetCode;

public class DivideAndQuancer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int a = 2147483647;
         int b = -2147483648;
         
       //  System.out.println(b);
		
         int divisor = -1;
         
		int q = 2147483647/divisor ;
		
	//	long n = -2147483648/-1;
		if(q==b && divisor == -1) {
			q = q-1;
		}
		int m = -1/-1;
		
		System.out.println(q);
		
		if(q > a){
            System.out.println(2147483647);
        }else if(q < b){
        	System.out.println(-2147483648);
        }
		
		//System.out.println(m);
	}

}
