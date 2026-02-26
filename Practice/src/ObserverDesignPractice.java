import java.util.ArrayList;
import java.util.List;

interface Observer {
	
	public void update();
}

 
interface Observable{
	
	
	public void add(Observer observer);
	public void remove(Observer observer);
	public void notif();
	
}

class productOserveble  implements Observable{
	
	List<Observer> list = new ArrayList<>();

	@Override
	public void add(Observer observer) {
		// TODO Auto-generated method stub
		list.add(observer);
		
	}

	@Override
	public void remove(Observer observer) {
		// TODO Auto-generated method stub
		list.remove(observer);
	}

	@Override
	public void notif() {
		// TODO Auto-generated method stub
		for(Observer i : list) {
			i.update();
		}
	}
	
}

class EmailNotify implements Observer{
	
	Observable Observable;
	String email;
	EmailNotify(Observable Observable , String email){
		
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		sendEmail(email);
		
	}
	
	public void sendEmail(String email){
		System.out.println("send Email");
	}
	
}
public class ObserverDesignPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
