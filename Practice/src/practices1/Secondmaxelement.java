package practices1;

public class Secondmaxelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		   int []a = new int[]{15,2,12,5,6,3,1,10,17};

		    int max = 0 , secmax = 0 , thirdmax = 0 , forthmax = 0;
		     for(int i =0 ;i<a.length ; i++) {

		    	 	
		    	 
		    	 if( secmax < max  ) {
		    		 
		    	//	 forthmax = thirdmax;
		    		 thirdmax = secmax;
			    	 secmax = max; //15
			    	 
		          }
		  
		    	 if( a[i] > max) {
			    	   max = a[i];  //15,
			     } 
		     
		    
		     
		          
		      
	}
		     
		     System.out.println(max +","+ secmax + ","+thirdmax );

}
}
