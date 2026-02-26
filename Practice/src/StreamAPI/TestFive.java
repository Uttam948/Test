package StreamAPI;

public class TestFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}

class A{
	
	public int add(int a, int b) {
		return a+b;
	}
}

class B extends A{
	
	public int add(float a, float b) {
		
		return (int) (a+b);
	}
}