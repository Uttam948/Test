package LowLevelDesignPattern;


class Sporty implements Stretegy{
	@Override
	public void drive() {
	   
		System.out.println("Sports Drive Capabilities");
		
	}
}

class NormalV implements Stretegy{

	@Override
	public void drive() {
		System.out.println("Normal Drive Capabilities");
		
	}
	
	
}


interface Stretegy{
	
    public void drive();
	
}

class Vehicle1{
	
	Stretegy stretegy;
	
	Vehicle1 (Stretegy stretegy){
	this.stretegy = stretegy;
    }
	
	public void drive() {
		stretegy.drive();
	}
}

class SX extends Vehicle1{

	SX(Stretegy stretegy) {
		super(stretegy);
		// TODO Auto-generated constructor stub
	}
	
	SX(){
		super(new NormalV());
	}
}

class OffRoadY extends Vehicle1{

	OffRoadY() {
		super(new Sporty());
		// TODO Auto-generated constructor stub
	}
}


public class StrategyDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle1 st = new OffRoadY();
		Vehicle1 st1 = new SX();
		Stretegy str = new NormalV();
		str.drive();
		st.drive();
		st1.drive();
	}
	
}
