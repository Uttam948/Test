package SolidPrinciple;

import java.util.HashMap;
import java.util.Map;

interface Area{
	
	public int shape();

}
class Rectangle implements Area{
	int l;
	int b;
	Rectangle(int l , int b){
		this.l = l;
		this.b = b;
	}
	@Override
	public int shape() {
		// TODO Auto-generated method stub
		return l*b;
		
	}
}
class Square implements Area{
	
	int l;

	 
	Square(int l ){
		this.l = l;
		
	}
	@Override
	public int shape() {
		// TODO Auto-generated method stub
		return l*l;
	}
	
	
}

public class OpenClosePrinciple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(6,7);
	//	System.out.println(rectangle.shape());
	//	Square square = new Square(6);
	//	System.out.println(square.shape());
		
			  
			 
		
	}

}
