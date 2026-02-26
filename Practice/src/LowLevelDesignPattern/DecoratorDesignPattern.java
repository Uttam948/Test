package LowLevelDesignPattern;

abstract class BasePizza{
	
	public abstract int cost ();
}

class FarmarDelite extends BasePizza{
	
	@Override
	public int cost() {
		return 100;
	}
}
class NormalDelite extends BasePizza{
	
	@Override
	public int cost() {
		return 90;
	}
}
//Because your decorators like ExtraChess and Mashroom 
//already extend BasePizza, and that’s the only thing 
//that really matters for the Decorator Design 
//Pattern to work — i.e., they must be of the 
//same type as the thing they're decorating (BasePizza).
abstract class AddTopins extends BasePizza{
	
}

/*
 * This gives a named hierarchy level to distinguish between:
 * 
 * The core components (like FarmarDelite, NormalDelite)
 * 
 * And the decorators (like ExtraChess, Mashroom)
 * 
 * Makes code easier to understand and extend in larger systems
 * 
 * ✅ Summary: With AddTopins Without AddTopins Adds semantic clarity Still
 * compiles and works Good for scaling Simpler for small projects Helps
 * categorize decorators Might confuse roles in complex code
 * 
 * So: ✅ You can remove AddTopins and the code will still run correctly. But 🟡
 * keeping it improves design clarity when your system grows.
 * 
 */
class ExtraChess extends AddTopins{
	
	BasePizza basepizza;
	
	public ExtraChess (BasePizza pizza) {
		this.basepizza = pizza;
	}
	
	@Override
	public int cost() {
		return this.basepizza.cost() + 40;
	}
}

class Mashroom extends AddTopins{
	
	BasePizza basepizza;
	public Mashroom(BasePizza pizza) {
		this.basepizza = pizza;
	}
	
	@Override
	public int cost() {
		return this.basepizza.cost() + 50;
	} 
}
public class DecoratorDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasePizza basePizza = new ExtraChess(new Mashroom( new NormalDelite()));
		

		BasePizza basePizza1 = new ExtraChess( new NormalDelite());
		

		System.out.println(basePizza1.cost());
		
		System.out.println(basePizza.cost());
		
	}

}
