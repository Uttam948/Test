package practices1;

public class KnapSack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value[] = {3,2,4,5,1};
		int weight[] = {40,20,10,30,50};
		
		int k = 60;
		int max = 0;
		for(int i =0 ;i < value.length ; i++) {
			
			int sumw = 0 , vsum= 0;
			for(int j = i; j< weight.length ; j++) {
				
				sumw = sumw + weight[j];
			    if(sumw <= k && weight[j] <= k) {
			    	 
			    	vsum = vsum + value[j];
			    }
			    
			    if(max< vsum) {
			    	max = vsum;
			    }
			    
				
			}
		}
		
		System.out.println(max);
		
	}
}
