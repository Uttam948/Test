package practices1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;




interface addtion{
	public int add(int a , int b);
}

interface blockofcode{
	
}

public class LambdaExpression {
	
	
	public static void main(String agr[])
	{
		List<String> lists = new ArrayList<String>();
		
	//	Stream filter = list.stream().filter(p -> p.charAt(0) == 'A');
		
	//	addtion ad = (a,b)->(a+b);
		
		String st = "Uttam";
		char[] s = st.toCharArray();
		
		
		List<Character> lit = Arrays.asList();
		
		lit.stream().distinct().forEach(n->System.out.println(n));
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("1","Amit","2323434",34, "54433"));
		list.add(new Employee("2","Rohan","2323434",54, "4433"));
		list.add(new Employee("3","kishan","2323434",36, "67433"));
		list.add(new Employee("4","Shivani","2323434",56, "7433"));
		list.add(new Employee("5","Uttam","2323434",25, "533"));
		list.add(new Employee("6","Sanjay","2323434",26, "433"));
		
		list = list.stream().filter(p -> p.getAge() > 25).collect(Collectors.toList());
		
		for(Employee e : list) {
			//System.out.println(e.getName() +" " + e.getAge());
		}
		
		
		Map<Integer , Employee> map = new HashMap();
		map.put(1, new Employee("1","Amit","2323434",34, "54433"));
		
	//	Map<String , Employee> mape = map.entrySet().stream().
		//		filter(p->p.getValue())
		
		List<Employee> emp = list.stream().filter(p -> p.getAge() > 20)
				.collect(Collectors.toList());
		
		for(Employee e:emp) {
			//System.out.println(e.getName());
		}
		
		
		
		//System.out.println(emp);
		
		addtion ad = ( a, b) -> {
			return a+b;
		};
		
	  // System.out.println(ad.add(2, 4));
		
		List<Integer> list2 =  Arrays.asList(2,3,5,4,3,3);
		
		
		
		// list2.stream().distinct().forEach( System.out:: println);
		 
		 list2.stream().filter( n-> n %2 ==0).forEach(System.out :: println);
		 
		 
		 
		 
	}
	
	
	
	
	
}
