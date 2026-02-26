package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class CompletableFutureImpl {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		CompletableFuture<String> com = CompletableFuture.supplyAsync( () ->{
			
			return "This is the implementation of CompletableFuture";
		});

		System.out.println(com.get());
		
		
		List<String> list = Arrays.asList("Uttam", "Amit","Rahul");
		List<String> lit = list.stream().sorted(Comparator.comparing(String :: length)).collect(Collectors.toList());
		
	List<Integer> lti = list.stream().mapToInt(String :: length).boxed().collect(Collectors.toList());
			
		System.out.println(lit);
	}


}
