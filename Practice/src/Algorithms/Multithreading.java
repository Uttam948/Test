package Algorithms;

class multiplethrea extends Thread{
	
    public void run() {
		
	
	try {
		Thread.sleep(1000);
		System.out.println("thread1");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
}
class multiplethread extends Thread{
	
     public void run() {
		
    	 System.out.println("thread2");
    		try {
    			Thread.sleep(1000);
    			
    		} catch (InterruptedException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
	} 
	
}

public class Multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		for(int i =0 ;i <10 ; i++) {
			multiplethrea Multithreading = new multiplethrea();
		
			Multithreading.start();
			multiplethread Multithreading1 = new multiplethread();
			Multithreading1.start();
			
		}
		

	}

	           
}
