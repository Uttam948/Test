package hackerRankTest;

import com.sun.jdi.IntegerValue;


public class HackerrankJavaTest extends BaseC implements BaseI{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             //new HackerrankJavaTest().method();
		
		try {
			
			@SuppressWarnings("deprecation")
			Float f = new Float("3.0");
			int i = f.intValue();
			byte b= f.byteValue();
			double d = f.doubleValue();
			System.out.println(i+b+d);
			
			
		}catch(NumberFormatException e){
			System.out.println("Bad Line");
		}
	}

}

class BaseC{
	
	public void method() {
		System.out.println("Inside BaseC::method");
	}
}

interface BaseI{
	
	void method();
}