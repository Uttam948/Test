package practices1;

public class RecurWindingUnwinding {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		repeat(5);
	}
	
	public static void repeat(int count) throws InterruptedException {
		
		if(count == 0) {
			return;
		}
		Thread t = new Thread();
		System.out.println("Count value " + count);
		t.sleep(1000);
		repeat(count-1);
		t.sleep(1000);
		System.out.println("Count value " + count);
	}

}
