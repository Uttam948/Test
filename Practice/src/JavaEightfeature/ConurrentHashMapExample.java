package JavaEightfeature;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConurrentHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer , Integer> map = new ConcurrentHashMap<>();
		
		for(int i =0 ;i<5 ; i++) {
			map.put(i, i*2);
			System.out.println(map);
		}
		for(int j = 0; j<5 ; j++) {
			map.put(j, j*3);
			System.out.println(map);
		}
		
		
	}

}
