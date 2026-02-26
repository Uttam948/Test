package JavaEightfeature;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPIQandA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(4,5,3,7,8,9,1,2,4,3,5);
		
		String str = "Uttam";
		
	//	Map<Character , Long> ma =  str.chars().mapToObj(c -> (char) c).
			//	collect(Collectors.groupingBy(n -> n , Collectors.counting()));
		
		//System.out.println(ma);
		
		List<Integer> list1 = list.stream().distinct().collect(Collectors.toList());
		
	   //  Map<Boolean, List<Integer>> map = list.stream().collect(Collectors.partitioningBy(n->n%2==0));
	     
	     list.stream().forEach(System.out :: print);
	     
	     System.out.println();
	    
	     list.stream().forEach(System.out :: print);

	}

}
