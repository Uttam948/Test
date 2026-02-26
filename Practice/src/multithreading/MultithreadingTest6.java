package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultithreadingTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService executor = Executors.newFixedThreadPool(3);

		Runnable task = () -> {
		    System.out.println("Thread: " + Thread.currentThread().getName());
		};

		executor.submit(task);
		executor.shutdown();

	}
	
	

}
