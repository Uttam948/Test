package NovermberCoding_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employeee{
	
	private String emplDept;
	private String name;
	private int age;
	
	Employeee(String emplDept, String name , int age){
		this.emplDept = emplDept;
		this.name = name;
		this.age = age;
	}
	
	public String getemplDept() {
		return emplDept;
	}
	
	public String getName( ) {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
}

public class Feb10 {
	
	public static void run(String str) {
		System.out.println("Run Code 1");
	}
	
	public static void run(Object obj) {
		System.out.println("Run Code 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employeee> list = new ArrayList<>();
		
		list.add(new Employeee("Mech", "Rahul", 2));
		list.add(new Employeee("Elec", "Rohan", 3));
		list.add(new Employeee("Mech", "Ajay", 4));
		list.add(new Employeee("Elec", "Rohan", 5));
		
		List<Employeee> list1 = list.stream().filter( n -> n.getAge() % 2 == 0).collect(Collectors.toList());
		
		Map<String, List<Employeee>> map = list.stream().collect(Collectors.groupingBy(Employeee :: getemplDept ));
		
		for(Employeee i : list1) {
			
			System.out.println(i.getName());
		}
		
		
		run(null);
		
		
	}

}
