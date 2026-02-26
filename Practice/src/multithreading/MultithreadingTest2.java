package multithreading;


public class MultithreadingTest2 {

	public static void main(String[] args) throws InterruptedException {
	
		
		Thread hi = new Thread() {
			public void run() {
				
				for(int i =0 ;i<5 ; i++) {
				
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				}
			}
		};
		
		Thread uttam = new Thread() {

			public void run() {
				
				for(int i =0 ;i<5 ; i++) {
					
					System.out.println("Uttam");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					}	
		
		}
		};
	    
		hi.start();
		Thread.sleep(500);
		uttam.start();
		
		
        
	}

}
