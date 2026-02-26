package multithreading;

public class MultiThreadingTest4 {

	public static class Test2 implements Runnable{

		boolean flage = false;
		
		public synchronized void threaStopped() {
			flage = true;
		}
		
		public synchronized boolean IsthreadStopped() {
			return this.flage;
		}
		
		
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Thread Started");
		while(!IsthreadStopped()) {
			
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("....");
				
			}
		System.out.println("Thread End");
		}
			
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Test2 test2 = new Test2();
		Thread t1 = new Thread(test2);
		t1.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Request to stopping");
		test2.threaStopped();
		
	}

}
