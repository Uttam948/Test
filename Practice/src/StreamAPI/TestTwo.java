package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Person{
	
	private String Name;
	private int age;
	Person(String name , int age){
		this.Name = name;
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public int getAge() {
		return age;
	}
}

public class TestTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> strings = Arrays
	              .asList("apple", "banana", "cherry", "date", "grapefruit");
		
		
		String str = strings.stream().max(Comparator.comparingInt(String :: length)).get();
		
		String strs = "UUttamm";
		
	Map<Character , Long>
	map =	strs.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
		System.out.println(map);
		System.out.println(str);
		
		for(Map.Entry<Character, Long> m : map.entrySet()) {
			
		    if(m.getValue() == 2) {
		    	System.out.println(m.getKey());
		    }
		}
		List<Integer> list1 = Arrays.asList(1,2,2,3,4,5);
		List<Integer> list3 = Arrays.asList(1,2,3,4,5);
		Stream.concat(list1.stream(), list3.stream()).sorted().forEach(System.out :: print);
		
		List<Person> persons = Arrays.asList(
			    new Person("Alice", 25),
			    new Person("Bob", 30),
			    new Person("Charlie", 35)
			);
		
	Person m = persons.stream().min(Comparator.comparingInt(Person :: getAge)).get();
	List<Person> li = persons.stream().sorted(Comparator.comparingInt(Person :: getAge))
			.collect(Collectors.toList());
	 
	//System.out.println(m.getAge());
	
	for(Person i : li) {
		System.out.println(i.getName());
	}
	
	}

}
