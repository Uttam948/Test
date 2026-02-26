package LowLevelDesignPattern;

class LogProcessor{
	
	LogProcessor nextLogProcessor;
	
	LogProcessor (LogProcessor nextLogProcessor){
		this.nextLogProcessor = nextLogProcessor;
	}
	
	public void log (String message ) {
		
		if(nextLogProcessor != null) {
			nextLogProcessor.log(message);
		}
	}
      
}
 class InfoLog extends LogProcessor{

	InfoLog(LogProcessor nextLogProcessor) {
		super(nextLogProcessor);
	}
	 
 }



public class ChainOfResponsibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
