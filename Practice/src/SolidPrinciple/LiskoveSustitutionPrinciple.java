package SolidPrinciple;


class BaseCar{
	
	

	public void baseEngine() {
		
		System.out.println("BaseEngine");
	}
	
	public int add() {
		
		return 5+5;
	}
}
class SportsCar extends BaseCar{
	
	@Override
	 public void baseEngine() {
		
		System.out.println("BaseEngine");
		System.out.println("SprotsCar +  nitro");
	}
	
	
	@Override
	public int add() {
		
		return 10+ 10;
	}
	
}

public class LiskoveSustitutionPrinciple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SportsCar sportsCar = new SportsCar();
		System.out.println(sportsCar.add());

	}

}
