
public class HackerrankNon_Divisible_Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {19,10,12,10,24,25,22};
		int k = 4;
		int reminder[] = new int[k];
		
		for(int i = 0; i<arr.length ; i ++) {
			reminder[arr[i] % k]++;
		}
           int count = 0;
		  if (reminder[0] > 0) {
			  count++;
		  }
		for(int  i =1 ; i<= k/2 ; i++) {
			
			if(i == k-i) {
				count++;
			}else {
				
				count = count + Math.max(reminder[i], reminder[k-i]);
			}
			
		}
		
		System.out.println(count);

	}

}
