package strategyDesignPatter;

public class CommercialVehicle  implements SimpleVehicle{

	@Override
	public void drive() {
		System.out.println("Commercial Vehicle is normal Vehicle");
	}

}
