package strategyDesignPatter;

public class Vehicle {
	
	SimpleVehicle simpleVehicle;
	
	Vehicle(SimpleVehicle obj){
		
		this.simpleVehicle = obj;
	}

	public void drive() {
		simpleVehicle.drive();
		
	}
}
