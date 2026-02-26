import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class TestOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int arr[] = {1,2,1,2,4,3,2,1,5};
		 int max = 0;
		 
		
	
		 Map<Integer , Integer> map = new HashMap<>();
		 
		 for(int i : arr) {
			 
			// map.put(i, map.getOrDefault(i, 0)+1);
			 int count = map.getOrDefault(i, 0)+1;
			 map.put(i, count);
			 
			 if(count > max) {
				 max = count;
			 }
			 
		
		 }
		 System.out.println(max);
	}
	
	 public static int getValue(Object ojb , int v) {
		
		 return 0;
	 }

}
