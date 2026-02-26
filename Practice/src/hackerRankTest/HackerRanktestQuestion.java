package hackerRankTest;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.io.*;


class Worker implements Runnable{

	AtomicInteger c = new AtomicInteger(0);
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

public class HackerRanktestQuestion {

	public static void main(String[] agrs) {
		
		ExecutorService Service = Executors.newFixedThreadPool(10);
		
		IntStream.range(0, 10).forEach(e -> Service.submit(new Worker()));
		
		for(int i =0 ; i < 10 ;  i++) {
			Service.submit(new Worker());
		}
		
		for(int i=0 ; i<10 ; i++) {
			Worker owrker = new Worker();
			
			Thread thread = new Thread(owrker , i + "");
			
			thread.start();
			
		}
		
		ExecutorService service = Executors.newSingleThreadExecutor();
		IntStream.range(0, 10).forEach(e -> service.submit(new Worker()));
	
	}
	}


