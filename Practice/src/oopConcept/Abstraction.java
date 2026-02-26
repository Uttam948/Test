package oopConcept;

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		B b = new B()	;
		
		
		System.out.println(b.add(3, 4));
		
	}
}

interface D{
	public void add();
}

	abstract class A{
		
		abstract int add(int a, int b);
		
		public void show() {
			System.out.println("show");
		}
	}
	
	class B extends A{
		
		
		public int add(int a, int b) {
			
			int c = a +b;
			return c;
		}
	}

