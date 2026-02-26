package Algorithms;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Uttam implements Callable<String>{
	

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "You are the nice guys";
	}
}

public class QueenAttack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		Callable<Integer> task = ()->{
			int val = 1;
			for(int i =1 ; i<5;i++) {
				val = val * i;
			}
			return val;
		};
		
		Future<Integer> future =  executor.submit(task);
		System.out.println(future.get());
		executor.shutdown();
		
	}

}
