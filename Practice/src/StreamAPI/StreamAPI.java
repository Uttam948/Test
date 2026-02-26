 package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.text.StyledEditorKit.BoldAction;

public class StreamAPI {	
	public static boolean primeNumber(int n) {
	
		if(n<=1) {
		return false;
		}
		
		for(int i = 2;i<n/2;i++) {
			
			if(n % i ==0) {
				
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Given a list of integers, find out all the even
		//numbers that exist in the list using Stream functions?
		
		List<Integer> list = Arrays.asList(2,3,4,2,4,6,6,8,6,5,4,4,4,4,1,3,3);
		
	  
	    boolean h = list.stream().anyMatch(StreamAPI :: primeNumber);
		
	//	System.out.println(h);
		
		
		
		
		Set<Integer> set = new HashSet<>();
	
	   List<Integer> list2 =  list.stream().filter( n->!set.add(n)).collect(Collectors.toList());	
	   
	   System.out.println(list2);
		
	//  System.out.println(list2);
		
		//list.stream().filter(n ->n%2 ==0).forEach(System.out::println);
		
		//list.stream().filter(n ->n%2 !=0).forEach(System.out::println);
		
		//Convert IntArray into String by Stream API.
		
		//list.stream().map(n -> n+"").forEach(System.out::print);
		
		
		//Given a list of integers, find out all the numbers starting with 1 using Stream functions?
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		
		
		
		//How to find duplicate elements in a given integers list in java using Stream functions?
		
		List<Integer> myList1 = Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		myList1.stream().map(String :: valueOf ).forEach(System.out :: println);
		
		
		int arrint[] = {10,15,8,49,25,98,98,32,15};
		
		// Set<Integer> set = new HashSet<>();
		 
		// myList1.stream().filter(n -> !set.add(n)).forEach(System.out::println);
		 
		 int a = myList1.stream().max(Integer :: compare).get();
		 long b = myList1.stream().count();
		//Concatinate of 2 string
	 	List<Integer> conStream =  Stream.concat(myList1.stream(), myList.stream()).
	 			sorted().collect(Collectors.toList());
	 	
	 	for(Integer i : conStream)
	 	System.out.println(i);
	 	
	 	String str = "uttam";
	 	
	 	char ch[] = str.toCharArray();
	 	
	 	//Map<Character, Long> map= str.chars().mapToObj(c -> (char) c)
	 		//	.collect(Collectors.groupingBy(n->n , Collectors.counting()));
	 	
	 //	System.out.println(map);
	 	
	 //	conStream.forEach(System.out::print);
	 	
	// 	myList1.stream().map(n -> n*n*n).filter(p-> p > 50).forEach(System.out::println);
	 	
	 	
	 	 Arrays.sort(arrint);
	 	 
	 	 Arrays.stream(arrint);
	 	 
	 	 List<String> st = new ArrayList<>();
	 	 
	 	 st.add("uttam");
	 	 
	 	
	 	 st.stream().max(Comparator.comparing(String :: length));
	 	 
	 	 List<Integer> lists = Arrays.asList(2,3,3,3,3,2,1,2,4,5,5,5,5,3);
	 	 
	// 	 Map<Integer , Long> maps = lists.stream().collect(Collectors.groupingBy(n->n , Collectors.counting()));
	 	 
	 ///	 System.out.println(maps);
	 	 
	 //	 long l = maps.values().stream().max(Comparator.naturalOrder()).get();
	 	 
	 //	 int bs = (int)l;
	 	 
	 //	 System.out.println(maps.containsValue(bs));
	 
	 	
	 	
	}
}
