package multithreading;


class Hello extends Thread{
	
	public void run() {
		
		for(int i=0;i<5;i++) {
		//	System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
			
		}
		
	}
}

class World implements Runnable{
	
	public void show() {
		
		for(int i=0;i<5;i++) {
			System.out.println("World");
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			System.out.println("World");
		}
		
	}
}


public class MultithreadingTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hello hello = new Hello();
		World world = new World();
		hello.start();
				//world.show();
		
		Runnable runnable = ()->{
			
			for(int i = 0;i<5 ; i++) {
				
				System.out.println(i);
			}
		};
		
		Thread thre = new Thread(runnable);
		
		
		
		thre.start();

	}

	
}
