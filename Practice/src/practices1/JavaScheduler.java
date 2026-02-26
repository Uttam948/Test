package practices1;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class JavaScheduler {

	public static class Run implements Runnable{

		@Override
		public void run() {
			System.out.println("Hello world");
			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 var service = Executors.newScheduledThreadPool(1);
		
	//	service.scheduleAtFixedRate(new Run() , 0, 10000, TimeUnit.MILLISECONDS);
		
		
		Stream.of(1,2,3).forEach(System.out :: println);
		
		Stream.generate(()->"hello").limit(3).forEach(System.out :: println);
		
		//List.of{1 , 2}.Stream().forEach(System.out :: println);
		
		

	}

}
