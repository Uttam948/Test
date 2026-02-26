package LowLevelDesignPattern;


class Adding{
	
	public void add() {
		System.out.println("Hello");
	}
}
class Substracting{
	
	public void substract () {
		System.out.println("World");
		}
	}

class ImplementFacade{
	
	
	
	Substracting substracting = new Substracting();
	Adding adding = new Adding();

	
	public void addtwoclass() {
		
	substracting.substract();
	adding.add();
		
		
	}
}

public class FacadeDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ImplementFacade implementFacade = new ImplementFacade();
		implementFacade.addtwoclass();
		

	}

}
