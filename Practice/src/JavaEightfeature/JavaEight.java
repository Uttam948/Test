package JavaEightfeature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;


class Employee{
	
	
	private int id;
	private String empname;
	private int number;
	
	Employee(int id, String name , int number){
		this.id= id;
		this.empname = name;
		this.number = number;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return empname;
	}
	public void setName(String name) {
		empname = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
}

@FunctionalInterface
interface Employeserver{
	
	public int getName(int a, int b);
	
	static int showResult(int a, int b) {
		
		return a+b;
	}
	
}

public class JavaEight {
	
   public String name() {
	   return "Uttam Singh";
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set = new TreeSet<>();
		Set<Integer> sets = new HashSet<>();
		Map<Integer, String> map = new TreeMap<>();
		
		
		
		Employeserver employeserver = Employeserver::showResult;
		
		System.out.println(employeserver.getName(5, 10));
		
		
		
		List<Employee> employe = new ArrayList<>();
		employe.add( new Employee(1, "Uttam", 234324));
		employe.add( new Employee(2, "Uttam", 234324));
		employe.add( new Employee(3, "Uttam", 234324));
		employe.add( new Employee(4, "Uttam", 234324));
		

		List<Employee> employenew;
	
		List<Integer> employeId;
		List<Employee> employeAcend;
		List<Employee> employedecend;
		
		employenew = employe.stream().filter(n -> n.getId()%2 ==0).collect(Collectors.toList());
		
		for(Employee emp : employenew) {
			System.out.println(emp.getId() +" "+ emp.getName() +" "+ emp.getNumber());
		}
		
		
		
		employeId = employe.stream().filter( n -> n.getId()% 2 == 0)
				.map(Employee::getId).collect(Collectors.toList());
		
		
		employeId = employe.stream().map(Employee :: getId).filter(n -> n%2 ==0)
				.collect(Collectors.toList());
		
	   
		employeAcend = employe.stream().sorted(Comparator.comparing(Employee :: getId))
				.collect(Collectors.toList());
		
		employedecend = employe.stream().
				sorted(Comparator.comparing(Employee :: getId).reversed())
				.collect(Collectors.toList()); 
		
		List<String> list1 = Arrays.asList("cat", "tiger", "dog", "dog", "fox", "cat", "cat", "lion");
		
		
	}
	

}
