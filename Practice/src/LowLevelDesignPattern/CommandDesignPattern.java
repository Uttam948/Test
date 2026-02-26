package LowLevelDesignPattern;


interface Icommand{
	
	public void execute();
}



class AcConductor{
	
	private int tempereture;
	private boolean turnOn;
	

	public void setTempereture(int tempereture) {
		this.tempereture = tempereture;
	}

	public boolean isTurnOf(boolean turnOf) {
		turnOf = false;
		return turnOf;
	}

	
	public boolean ifTurnOn(boolean turnOn) {
		turnOn = true;
		return turnOn;
	}
	
}

public class CommandDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
