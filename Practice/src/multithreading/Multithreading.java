package multithreading;

public class Multithreading implements Runnable{

	
	public static void main(String agr[]) {
		
		Multithreading multi1 = new Multithreading();
		
		
		
		Thread t1 = new Thread(multi1);
		t1.start();
		//t1.run();
	
		Multi multi2 = new Multi();
		multi2.start();
		
		ABC abc = new ABC();
		abc.start();
		abc.run();
		//Thread t3 = new Thread("Thread three is Running----");
		//t3.start();
		
	//	String str = t3.getName();
		
		
		
	//	System.out.println(str);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Thread one is Running....");
		
	}

}

class ABC extends Thread{
	
	@Override
	public void run() {
		System.out.println("this is next thread");
	}
	
}
class Multi extends Thread {
	
	public void run() {
		System.out.println("Thread two is Running.....");
	}
	
}
