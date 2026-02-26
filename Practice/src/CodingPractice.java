import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CodingPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              String str = "Uttam";
              
            
             // Map<Character , Long> map = str.chars().mapToObj(c -> (char) c).
             // collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
              
              List<String> list = new ArrayList<>();
              
              list.add("Amit");
              list.add("Uttam");
              
              List<Integer> list3 = Arrays.asList(10,15,8,49,25,98,32,32,2,2,2,15);
              
              Set<Integer> set = new HashSet<>();
              list3.stream().filter( n -> !set.add(n)).forEach(System.out :: print);
              
              Map<Integer , Integer> map = new HashMap<>();
              
              for(Integer i : list3) {
            	  
            	  if(map.containsKey(i)) {
            		  map.put(i, map.put(i,0)+1);
            	  }else {
            		  map.put(i, 1);
            	  }
              }
              System.out.println(map);
              
             List<String> list2 = list.stream().sorted(Comparator.comparing(String :: length)).collect(Collectors.toList());
             
             List<Integer> list4 =  list3.stream().distinct().collect(Collectors.toList());
             
             List<Integer>  list5 = list3.stream().filter(n -> n %2 ==0 ).collect(Collectors.toList());
             
         //    System.out.println(list5);
             for(Map.Entry<Integer,Integer> i : map.entrySet()) {
            	 
            	 if(i.getKey()==  map.get(i.getKey())) {
            		 
            	 }
             }
	}

}

