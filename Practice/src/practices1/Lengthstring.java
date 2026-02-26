package practices1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lengthstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("Uttam","Sanjay","Ankit");
		Map<Integer , String> map = new HashMap<>();
		int a[] = new int[list.size()];
		int j=0;
		for(String i:list) {
			
			j = i.length();
			map.put(j, i);
			j++;
		}
		//map.entrySet().stream().sorted().forEach(System.out :: print);
		
		//Arrays.sort(a);
		
		System.out.println(map);
		
		
		

	}

}
