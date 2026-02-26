package strategyDesignPatter;

import java.util.WeakHashMap;

public class strategyDesignPatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleVehicle sportVehicle = new SportVehicle();
		SimpleVehicle commercialVehicle = new CommercialVehicle();
		SportBike sportBike = new SportBike();
		
		sportBike.drive();
		commercialVehicle.drive();
		sportVehicle.drive();

		
		
		WeakHashMap<Integer, String> wHash = new WeakHashMap<>();
	}

}
