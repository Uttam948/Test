package multithreading;


class testThread extends Thread{
	
	public void run() {
	
		for(int i=0;i<5 ; i++) {
			
			try {
				Thread.sleep(300);
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}
	
}


public class MultithreadingTest3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		testThread estThread = new testThread();
		estThread.start();
		///estThread.interrupt();
		//estThread.join();
		
		//System.out.println("The Boys");

	}

}
