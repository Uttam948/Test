package JavaPatternProgram;

public class PatternTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    System.out.println("Diamond");
	    
	    int n=9;
	    int v = 0;
	    
	    if(n % 2 ==0) {
	    	v = n/2;
	    }else {
	    	v = n/2 +1;
	    }
	    
	    for(int i =0 ;i<v;i++) {
	    	
	    	for(int j=0 ; j<=n ; j++) {
	    		
	    		if(j >= v-i && j <= v+i) {
	    			System.out.print("*");
	    		}else {
	    			System.out.print(" ");
	    		}
	    		
	    	}
	    	System.out.println();
	    	
	    }
	}

}
