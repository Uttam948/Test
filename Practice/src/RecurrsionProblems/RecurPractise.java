package RecurrsionProblems;

import java.util.List;

public class RecurPractise {

	public static void main(String[] args) {
		
		int i = 13 , j = 45 , k = 3;
		
        int count = 0;
        for(int l = i ; l <= j ; l++){
            int sum = 0;
            int val= l;
            while(val > 0){
                int mod = val % 10;
                val = val /10;
                sum = sum * 10 + mod;
               // System.out.println(sum);
            }
            if(sum > l){
                if((sum - l) % k ==0){
                    count++;
                }
            }else{
                if((l-sum)% k ==0){
                    count++;
                }
            }
            
           
        }
        
        System.out.println(count);
        
		
	}
	
}
