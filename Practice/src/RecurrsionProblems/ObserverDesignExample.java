package RecurrsionProblems;

interface Observer{
	
	public int Data(int value);
	
	public void update();
}

class B {
	
	int b;
	
	Observer observer;
	B(int b){
		this.b = b;
	}
	
}

class A implements Observer{

	int a;
	
	A(int a){
		this.a = a;
	}
	
	@Override
	public int Data(int value) {
		// TODO Auto-generated method stub
		return a+value;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
			
	}
	
}

public class ObserverDesignExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
