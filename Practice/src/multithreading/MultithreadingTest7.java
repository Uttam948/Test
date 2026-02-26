package multithreading;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Uttam{
	
	public void getDetails() {
		//System.out.println("this is my name");
	}
}

class Uttam2{
	
	Uttam uttam;
	
	public void start(Uttam utam) {
		this.uttam = utam;
	}
	
	public void print() {
		uttam.getDetails();
	}
}
class Thread1 implements Runnable {
	
	public void run() {
		
	
			
		 try {
			Thread.sleep(1000);
			Map<Integer , String> map = new HashMap<>();
			for(int i =0 ;i<10 ; i++){
				map.put(i, "Thread"+i);
			}
			//System.out.println("Thread1");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}
}


class Thread2 implements Runnable {
	
	public void run() {
		
	
			
		 try {
			Thread.sleep(500);
			Map<Integer , String> map = new HashMap<>();
			for(int i =0 ;i<10 ; i++){
				map.put(i, "Thread"+i);
			}
		//	System.out.println("Thread1");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}
}

public class MultithreadingTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		
	//	thread1.start();
	//	thread2.start();
		
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		Uttam utam = new Uttam();
		
		Uttam2 uut = new Uttam2();
		uut.start(utam);
		uut.print();
		
		int val =(int) Math.round((double) 9/2);
		
		int arr[]  = {1,2,3,4,5,6};
		int arr1[] = new int[arr.length];
		int k = 3;
		k = k % arr.length;
		int j = 0;
		for(int i = k ; i< arr.length; i++) {
			arr1[j] = arr1[i];
			j++;  
		}
	}

}
