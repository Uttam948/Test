package leetCode;

public class DistinctElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a = {1,1,2};
		int []b = {0,0,1,1,1,2,2,3,3,4};
		int first = b[0];
		int last  = b[b.length-1];
		
		//System.out.println();
		
		 int count = 0;
	       for(int i =first ; i<= last ; i++){

	              b[i] = i;
	                count++;
	                System.out.println(b[i]);

	       }
	       

	}

}
