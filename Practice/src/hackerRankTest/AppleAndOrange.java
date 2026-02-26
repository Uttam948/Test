package hackerRankTest;

import java.util.ArrayList;
import java.util.List;

public class AppleAndOrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		
         list.add(2);
         
         List<Integer> list2 = new ArrayList<>();
         list2.add(-2);
		

		
		AppleAndOrange.countApplesAndOranges(2, 3, 1, 5,  list , list2 );
		
		
		 
		
	}
	
	 public static void countApplesAndOranges
	 (int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges)
	 {
		 
		 long counta = 0 ,  countb = 0; 
		    
         
         
         for (Integer k : apples) {
  
            int v = k + a;
            
           
            if(v >= s && v<= t ){
                counta++;
            }
       }

      for (Integer j : oranges) {
  
          int w = j + b;
          
          if(w >= s && w <= t ){
                countb++;
            }
       } 
       
       System.out.println(counta);
       System.out.print(countb);
       
          
     
}

	 }


