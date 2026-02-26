package multithreading;



class Multis implements Runnable{
	
	
	public void run() {
		for(int i =0 ; i< 5;i++) {
			
			try {
				Thread.sleep(1000);
				System.out.println("hello");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	private int count = 0;
	
	public synchronized void increamental() {
		 count++;
	}
	
	public void increamanental() {
		
		synchronized(this) {
			count++;
		}
	}
}

public class UseOfSynchronysation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multis multis = new Multis();
		Thread t = new Thread(multis);
		t.start();
	}

}
