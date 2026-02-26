package NovermberCoding_2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Employee implements Comparable<Employee> {

	 String name;
	 int salary;
	 int age;
	
		
	 Employee(String name , int salary , int age){
		this.salary = salary;
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public int compareTo(Employee obj) {
		// TODO Auto-generated method stub
		return this.salary - obj.salary;
	}


}

class Age implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.age - o2.age;
	}
	
}



public class Jan162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> list = new ArrayList<>();
		
		list.add( new Employee("Raushan" , 1200 , 23));
		list.add( new Employee("Tulika" , 1500 , 29));
		list.add( new Employee("Gaurav" , 1100 , 32));
		list.add( new Employee("Uttam" , 1800 , 31));
		
		
		//this is for comparaTo method;
		Collections.sort(list);
		
		
		//this can be sort by the compara method
		//Collections.sort(list , new Age());
		
         for(Employee i : list) {
        	 System.out.println(i.name +" "+ i.salary +" "+ i.age);
         }
	
		
	}

}
