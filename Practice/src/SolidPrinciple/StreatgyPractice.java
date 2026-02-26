package SolidPrinciple;


interface vehicleStreagy{
	
	public void drive();
}

class normal implements vehicleStreagy {
	
	@Override
	public void drive() {
		System.out.println("Normal");
	}
}

class Sports implements vehicleStreagy {
	
	@Override
	public void drive() {
		System.out.println("Sprots");
	}
}

class vehicle implements vehicleStreagy{

	vehicleStreagy vehicleStreagy;
	
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}
}

class HayaBussa extends vehicle{
	
	HayaBussa hayaBussa;
	    
}

public class StreatgyPractice {

	public void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
