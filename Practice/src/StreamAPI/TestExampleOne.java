package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;


class Persons{
	
	String name;
	int age;
	double salary;
	
	Persons(String name , int age , double salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public int getAge() {
		return this.age;
	}
	public double getSalary() {
		return this.salary;
	}
}

public class TestExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Persons> list = Arrays.asList(new Persons("Uttam", 10, 101000),
				 new Persons("Amit", 20, 101002),
				 new Persons("Uttam", 30, 101000));
		
		Persons str = list.stream().max(Comparator.comparing(Persons :: getSalary)).orElse(null);
		
		double dv = list.stream().mapToDouble(Persons :: getSalary).max().orElse(0);
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		int []arr1 =  Arrays.stream(arr).filter( n -> n % 2 ==0 ).toArray();
		
		System.out.println(Arrays.toString(arr1));
		
		System.out.println(str.getSalary());
		
		
		
	Double d =	list.stream().mapToInt(Persons :: getAge).average().orElse(0);
	
	System.out.println(d);

	}

}
