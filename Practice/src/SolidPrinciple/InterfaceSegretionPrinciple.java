package SolidPrinciple;

interface Animal{
	
	public void Meat();
}

interface petAnimals extends Animal{
	
	public void grass();
}

class grome implements Animal{

	@Override
	public void Meat() {
		// TODO Auto-generated method stub
		
	}

//	@Override
	//public void grass() {
		// TODO Auto-generated method stub
		
	//}
}

abstract class petAnimal implements petAnimals {

	@Override
	public void grass() {
		// TODO Auto-generated method stub
		
	}

}
abstract class WildAnimal implements petAnimals{


	public void meat() {
		// TODO Auto-generated method stub
		
	}
	
}




public class InterfaceSegretionPrinciple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
