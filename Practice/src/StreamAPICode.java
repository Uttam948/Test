import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;



class Employee{
	
	private String name;
	private int salary;
	private int age;
	private String dept;
	
	Employee(String name , int age , int salary , String dept){
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class StreamAPICode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    String str = "adbaa";
		
		Map<Character , Integer> map = new HashMap<>();
		
		for(int i =0;i < str.length() ; i++) {
			
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(1), (map.get(str.charAt(i)) +1));
			}else {
				map.put(str.charAt(i), 1);
			}
		}
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Uttam", 31 , 10000 , "solar"));
		list.add(new Employee("Amit", 34 , 16000 , "mechincal"));
		list.add(new Employee("Rahul", 36 , 50000 , "mechincal"));
		list.add(new Employee("Kishan", 27 , 4000 , "solar"));
	Employee maxSalary = list.stream().max(Comparator.comparing(Employee :: getSalary)).get();
	
	Map<String, List<Employee>> maxSalary1 = list.stream().max(Comparator.comparing(Employee :: getSalary))
	   .stream().collect(Collectors.groupingBy(Employee :: getDept));
	
	Map<String , Optional<Employee>> map2 = list.stream().collect(Collectors.groupingBy(Employee :: getDept ,
			Collectors.maxBy(Comparator.comparing(Employee :: getSalary))));
	
	for(Map.Entry<String , List<Employee>> i : maxSalary1.entrySet()){
		//System.out.println(i.getKey() +"  "+ i.getValue().get(0));
	}
	
	
	
	for(Map.Entry<String, Optional<Employee>> i : map2.entrySet()) {
		System.out.println(i.getKey() + " =  " + i.getValue().get().getName() + " =  " + i.getValue().get().getSalary());
	}
		map.put('a', 2);
		
		
	}

}
