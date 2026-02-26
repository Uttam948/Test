import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PatternOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 10;
		
		for(int i =0 ;i<5 ; i++) {
			
			for(int j = 0;j <= i ; j++) {
				//System.out.print("*");
			}
			for(int m = 6; m<=10 ; m++) {
				if(k <= m) {
					//System.out.print("*");
				}else {
					//System.out.print("   ");
				}
			}
			k--;
		//	System.out.println();
		}
		List<Integer> list = Arrays.asList(1,2,3);
		System.out.println(reverseOrder(list , 2));
	}
	
	public static List<Integer> reverseOrder(List<Integer> a , int k) {
		
		 List<Integer> list = new ArrayList<>();
	       List<Integer> list1 = new ArrayList<>();
	       List<Integer> list2 = new ArrayList<>();    
	       k = k % a.size();
	       
	       for(int i =a.size()-1 ;i >= a.size()-k ; i--){
	        list.add(a.get(i));
	       }
	       for(int i = 0 ; i< a.size()-k ; i++){
	        list1.add(a.get(i));
	       }
	       for( int i = list.size()-1 ; i >=0 ; i--){
	        list2.add(list.get(i));
	       }
	       for(Integer i : list1){
	        list2.add(i);
	       }
	      
	       return list2;
	}

}
