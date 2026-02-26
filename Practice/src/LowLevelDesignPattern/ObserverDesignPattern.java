package LowLevelDesignPattern;

import java.util.ArrayList;
import java.util.List;

interface Observer{
	
	public void update();
}
interface Observable{
	
    public void add(Observer observer);
    
    public void remove(Observer observer);
    
    public void notifys();    	
    
}
class product implements Observable{

	
	List<Observer> addObserver = new ArrayList<>(); 
	
	@Override
	public void add(Observer observer) {
		// TO DO Auto-generated method stub
		addObserver.add(observer);
		
	}

	@Override
	public void remove(Observer observer) {
		// TODO Auto-generated method stub 
		addObserver.remove(observer);
	}

	@Override
	public void notifys() {
		// TODO Auto-generated method stub
		for(Observer i : addObserver) {
			i.update();
		}
		
	}
	
}

class EmailNotify implements Observer{

	Observable observable;
	String emial;
	 
	EmailNotify(Observable observable , String email){
		 this.emial = emial;
		 this.observable = observable;
	}
	
	public void sendEmail(String email) {
		System.out.println("Email send to the user");
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		sendEmail(emial);
	}
	
}
public class ObserverDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Observable observable = new product();
		
		Observer emailNotify = new EmailNotify( observable , "uttam@gmail.com" );
	     
		observable.add(emailNotify);	
  
	}

}
