package LowLevelDesignPattern;

interface Animal{
	
	public void eat();
}

class Lion implements Animal{
	
	@Override
	public void eat() {
		System.out.println("Lion eat Meat");
	}
}
class Tiger implements Animal{
	
	@Override
	public void eat() {
		System.out.println("Tiger eat Meat");
	}
}

class Cow implements Animal{
	
	@Override
	public void eat() {
		System.out.println("Cow eat Grass");
	}
}

class Goat implements Animal{
	
	@Override
	public void eat() {
		System.out.println("Goat eat Grass");
	}
}
 
	
	class Carnivorus {
		
		Lion lionEat(String input) {
	        if(input == "Meat") {
	        	return new Lion();
	        }
			return null;
		}
		
		Tiger TigerEat(String input) {
			if(input == "Meat") {
				return new Tiger();
			}
			return null;
		}
		
		
	}
	class Harbivorus {
		
		Cow Coweat(String input) {
			if(input == "Grass") {
				return new Cow();
			}
			return null;
		}
		Goat GoatEat(String input) {
			if(input == "Grass") {
				return new Goat();
			}
			
			return null;
		}
		
	}

	class AnimalDiff{
		
		Carnivorus carnivorus(String input) {
			if(input == "Lion" ||input == "Tiger") {
				return new Carnivorus();
			}
			return null;	
		}
		
		Harbivorus harbivorus(String input) {
			if(input == "Cow" || input == "Goat") {
				return new Harbivorus();
			}
			return null;
		}
		
	}

public class AbstractFactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnimalDiff animalDiff = new AnimalDiff();
		animalDiff.carnivorus("Lion").lionEat("Meat").eat();
		animalDiff.carnivorus("Tiger").TigerEat("Meat").eat();
		animalDiff.harbivorus("Cow").Coweat("Grass").eat();
		animalDiff.harbivorus("Goat").GoatEat("Grass").eat();	    

	}

}
