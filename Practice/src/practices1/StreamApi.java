package practices1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Employees{
	
	private int id;
	private String depart;
	private double salary;
	
	public Employees(int id,String depart, double salary) {
		this.id = id;
		this.depart= depart;
		this.salary = salary;
	}
	
	public String getDepart() {
		return depart;
	}
	
	public double getSalary() {
		return salary;
	}
	
}

public class StreamApi {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(23);list.add(24);list.add(21);
		
		//list.stream().filter(p->p % 2 == 0).forEach(System.out::println);
		
		
		List<Integer> evenList = list.stream().filter(p->p < 2)
				.collect(Collectors.toList());
		
		int count = 1;
		List<String> list1 = new ArrayList<>();
		//list1.add("John");
		list1.add("John");
		list1.add("Rohan");
		list1.add("Amit");
		//list1.add("Rohan");
		//list1.add("John");
		
	    long list2 = list1.stream().count();
		
	//	System.out.println(list2);
		
		
		Map<Integer , String> map = new HashMap<>();
		for(String s : list1) {
			map.put(count, s);
			count++;
		}
		
	//	System.out.println(map.get(2));
		

		List<Integer> list3 = new ArrayList<>();
		list3.add(1);
		list3.add(2);
		list3.add(5);
		list3.add(4);
		list3.add(3);
		
		int sum1 = 0;
		
		int max = list3.stream().max(Integer :: compare).get();
		
		int min = list3.stream().min(Integer :: compare).get();
		
		int sum = list3.stream().mapToInt(p->p).sum();
		
		List<Integer> sorted = list3.stream().sorted().collect(Collectors.toList());
		
	//	System.out.println(sorted);
		
		for(int i=0;i<list3.size();i++)
		{
			sum1 = list3.get(i) + sum1;
		//	System.out.println(list3.get(i));
		}
		
		System.out.println(sum1);
		
		
		List<Employees> emp = new ArrayList<>();
		emp.add(new Employees(1, "dev", 343345));
		emp.add(new Employees(2, "dev", 33445));
		emp.add(new Employees(3, "QA", 34345));
		emp.add(new Employees(4, "QA", 34245));
		
		
		Comparator<Employees>  com =(Comparator.comparing(Employees ::getSalary));

	}

}
