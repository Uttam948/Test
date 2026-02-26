package SolidPrinciple;

import java.util.ArrayList;
import java.util.List;


interface Observer{
	
	
}

interface Obervable{
	
	List<Observer> obj = new ArrayList<>();	
	
	public static void add(Observer observer) {
		obj.add(observer);
	}
	
}



public class ObserverDesignPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
