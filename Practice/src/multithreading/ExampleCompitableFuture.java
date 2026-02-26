package multithreading;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class ExampleCompitableFuture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Uttam";
		
	Map<Character , Long> map =	str.chars().mapToObj( c -> (char) c).collect(Collectors.groupingBy( Function.identity() , Collectors.counting()));
		System.out.println(map);
	}

	
}
