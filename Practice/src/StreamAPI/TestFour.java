package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "uttam";
		
		List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9));
		
		List<Integer> flatend = list.stream().flatMap( List :: stream).collect(Collectors.toList());
		
		System.out.println(flatend);
		
		List<String> list1 = Arrays.asList("Uttam" , "Ram" , "Purushottam", "Ganesh");
		
		List<String> lit = list1.stream().
				sorted(Comparator.comparing(String :: length)).
				collect(Collectors.toList());
		
	 Map<Object, Integer> map1 =  list1.stream().sorted(Comparator.comparing(String :: length)).
		collect(Collectors.toMap( n->n , String :: length ));
	 
		System.out.println(map1);
		
		
		//Map<Character , Long> map= str.chars().
			//	mapToObj(c -> (char) c).
				//collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
	//	System.out.println(map);
	}

}
