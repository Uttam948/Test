package multithreading;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

class ExceptionHandler{
	
    
}

public class MultithreadingTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer , String> map = new HashMap<>();
		Map<Integer , String> hashTable = new Hashtable<>();
		Map<Integer , String> consurrentMap = new ConcurrentHashMap<>();
		ConcurrentMap<Integer , String> consurrenMap = new ConcurrentHashMap<>();
		
		consurrenMap.put(1, "Uttam");
		Object obj = consurrenMap.get(1);
		consurrenMap.put(2, "Rahul");
		String str = consurrenMap.get(2);
	
		Iterator<Integer> iterate = consurrenMap.keySet().iterator();
		
		while(iterate.hasNext()) {
			
		}
		
		if(!consurrenMap.containsKey(1)) {
			consurrenMap.put(3, "Rahul2");
		}
		
		consurrenMap.putIfAbsent(1, "uttam");
		
		System.out.println(obj);
		
		
	}

}
