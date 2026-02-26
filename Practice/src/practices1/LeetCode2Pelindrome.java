package practices1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeetCode2Pelindrome {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		LeetCode2Pelindrome leet = new LeetCode2Pelindrome();
		leet.isPalindrome(a);
		
	}
		public boolean isPalindrome(int x) {
		int a= 0;
        boolean m = false;;
         int count = 0 , k = 0;
        List<Integer> list = new ArrayList<>();
       
         if(x==0 && x<10){
             m = true;
         }else if(x < 0 || x == 10){
             m = false;
         }else{
         while(x>0)  {
          a = x%10;
            x = x/10;
       list.add(a);
         }
 
      int j = list.size()-1;
		 k = (list.size())/2;
		
		for(int i=0 ; i<k ; i++) {
			if(list.get(i)== list.get(j)) {
				count ++;
				
			} 
				  if(k != j) 
				  {
					  j--; 
					  }
		}
		if(count == k) {
			m = true;
		}else{
         m = false;
     }
         }  
         return m;
  }

	
}
