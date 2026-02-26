package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@FunctionalInterface
interface Practices{
	
	public void Animal();
	
	default int add(int a, int b) {
		return a+b;
	}
	
	static double addition(int a , int b) {
		return (double) a+b;
	}
}

public class TestFunctionalInterface implements Practices{

	public static void printElement(int i) {
		System.out.println(i*10);
		
	}
	
	public int add() {
		return 10;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestFunctionalInterface etstFunctionalInterface = new TestFunctionalInterface();
		etstFunctionalInterface.Animal();
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		
		List<String> list1 = Arrays.asList("weew","sdff","dffdf");
		
		List<List<String>> lists = new ArrayList<>();
		lists.add(list1);
		
		
		String st = "Uttamtskdkdhfksdhkj";
		
	  Map<Character , Long> maps=st.chars().mapToObj(n->(char) n).collect(Collectors.groupingBy(n->n , Collectors.counting()));
	  
	System.out.println(maps);
		
		List<String> listn = lists.stream().flatMap(n->n.stream()).collect(Collectors.toList());
		
	//	list.forEach(TestFunctionalInterface :: printElement);
		System.out.println(listn);
	
	}

	@Override
	public void Animal() {
		// TODO Auto-generated method stub
		
		System.out.println(Practices.addition(10, 20));
	}

}
