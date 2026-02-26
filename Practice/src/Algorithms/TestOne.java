package Algorithms;


interface A{
	
	default void addtwoelemnt(){
		System.out.println("this is interface of A");
	}
}

interface B{
	
	default void addtwoelemnt() {
		
		System.out.println("this is interface of B");
	}
}

interface C{
	
}

abstract class Used{
	
	abstract protected void showone();
	
	
}
class G extends Used{
	
	@Override
	public void showone() {
		System.out.println("this is orverriden method");
	}
}
interface PrivateMethodUsed{
	
	static void google() {
	 String st = syahello();
		
		System.out.println(st+":  Google");
		
	}
	
	default void yahoo() {
		
          String st = syahello();
		
		System.out.println(st+":  yahoo");
	}
	
	static String syahello() {
		
		return "hello";
	}
}

public class TestOne implements A,B{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	B b = new TestOne();
	//	b.subtwoelement();
		
		PrivateMethodUsed.google();
		
		Runnable ruunable = ()->{
			
		};
		
		G g = new G();
		g.showone();
		 
		
		
		
		TestOne testOne= new TestOne();
		//testOne.addtwoelemnt();
		//show(2,3,5,5);
		//show(5,6,4);

	}
	
	public static void show(int...number ) {
		
		for(int num : number) {
			System.out.print(num);
		}
		System.out.println();
	}

	@Override
	public void addtwoelemnt() {
		// TODO Auto-generated method stub
		B.super.addtwoelemnt();
	}

}
