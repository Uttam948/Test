package multithreading;

public class MultithreadingByRunable {

	public static void main(String[] args) {
		

	     Runnable runnable1 = ()->{
	    	 
	    	 for(int i =0 ; i<5 ; i ++) {
	    	 
	    	 System.out.println("This example for Runnable");
	    	 
	    	 try { Thread.sleep(500); }catch (InterruptedException e){e.printStackTrace();}
				
	    	 }
	    	 
	     };
	     
	     Runnable runnable2 = ()-> {
	    	 
	    	 for(int i =0 ;i<5 ;i++) {
	    		 
	    		 System.out.println("This example for second Runnable");
	    		 
	    		 try { Thread.sleep(500); }catch (InterruptedException e){e.printStackTrace();}
	    	 }
	    	 
	     };
	     
	     Runnable runnable3 = ()->{
	    	System.out.println("Sab thik"); 
	     };
	     
	     Thread thread1 = new Thread(runnable1);
	     Thread thread2 = new Thread(runnable2);
	     Thread thread3 = new Thread(runnable3);
	     thread1.start();
	     try {Thread.sleep(100);}catch(InterruptedException e) {e.printStackTrace();};
	     thread2.start();
	     thread3.start();
	    	 
	     
	}

}
