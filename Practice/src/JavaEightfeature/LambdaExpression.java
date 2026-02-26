 package JavaEightfeature;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class User implements Comparable<User>{
	private String name;
	private int amount;

	
	public User(String name, int amount) {
		super();
		this.name = name;
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public User(String string) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return 0;
	}

		
}
public class LambdaExpression {
	
	public static List<User> user = new ArrayList<>();
	
	static {
		user.add(new User("uttam", 500));
		user.add(new User("Amit", 5000));
		user.add(new User("Rohan", 1000));
		user.add(new User("Rishu", 400));
	}
	
	Comparator<User> com1 = (User o, User i)->{
		
		return 0;
		
	};
	
	Comparable<User> com = (User o)->{
		return 0;
		
	};
	
	
	
	private static LambdaExpression lambdaExpression = new LambdaExpression();
	
	private LambdaExpression() {
		
		System.out.println("Hello World");
	}
	
	

	public static void main(String[] args) {
		int sum = 0;
		
		
		List<User> user = new ArrayList<>();
		
		List<User> user1 = new ArrayList<>();
		
		user.add(new User("uttam", 500));
		user.add(new User("Amit", 5000));
		user.add(new User("Rohan", 1000));
		user.add(new User("Rishus", 400));
		user.add(new User("Rishudd", 500));
		user.add(new User("Rishua", 1000));
		user.add(new User("Rishua", 400));
		
		 Double n1 = user.stream().mapToInt(User :: getAmount).average().getAsDouble();
		 
		 int num = user.stream().mapToInt(User :: getAmount).sum();
		 
		 System.out.println(num);
		
		user1 = user.stream().sorted(Comparator.comparing(User :: getAmount).reversed()).skip(0).collect(Collectors.toList());
		
		Set<Integer> seti = new HashSet<>();
		
		List<User> setu = user.stream().filter(n -> seti.add(n.getAmount())).collect(Collectors.toList());
		
		for(User i : setu) {
			System.out.println(i.getName());
		}
		
		
		
		for(User i : user) {
			
			sum = sum +i.getAmount();
			
		}
		
		
		
		int users = user.stream().mapToInt(p->p.getAmount()).sum();
		
		// TODO Auto-generated method stub
	   List<String> list1 = new ArrayList<>();
	   
        List<Integer> list2 = new Stack<>();   
        
		
        list1.add("Amitaa");
        list1.add("Amita");
        list1.add("Amitaaaaa");
        list1.add("Amitaaa");
        
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        
        //list1.forEach(n -> System.out.println(n));
        
        list2.forEach(n-> {
        	
        	if(n % 2 ==0) {
        		//System.out.println(n);
        	}
        });
        
	Optional<String> st = list1.stream().max(Comparator.comparing(String :: length));
	
	//System.out.println(st);
		//System.out.println("");
		
		List<Integer> list11 = Arrays.asList(1, 3, 5, 7, 9);
		List<Integer> list12 = Arrays.asList(2, 4, 6, 8, 10);
		

		
		Optional<Integer> i = list11.stream().max(Comparator.comparing(Integer :: intValue));
		
	    List<Integer> list15 = Stream.concat
	    		(list11.stream().sorted(), list12.stream().sorted())
	    		.collect(Collectors.toList());
	    
	    
	    Map<Integer , String> map = new HashMap<>();
	    
	    List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", 
                "banana", "apple");
	    
	    Map<String, Long> map1 = words.stream().collect(Collectors.groupingBy(n ->n,
	    		Collectors.counting()));
	    
	    System.out.println(map1);
	}

}
