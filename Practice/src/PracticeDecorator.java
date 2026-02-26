



interface BasePizza{
	
	public int cost();
}

class farmdelite implements BasePizza{
	
	@Override
	public int cost() {
		return 100;
	}
}

class Normal implements BasePizza{
	
	@Override
	public int cost() {
		return 100;
	}
}

class PizzaDecorator implements BasePizza{

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 0;
	}
}

class Masroom extends PizzaDecorator{
	
	BasePizza basePizza;
	
	public Masroom (BasePizza basePizza) {
		this.basePizza = basePizza;
	}
	
	public int cost(){
		return basePizza.cost()+10;
	}
}
public class PracticeDecorator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
