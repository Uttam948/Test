package hackerRankTest;

public class AdditionMagic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		AdditionMagic additionMagic =  new AdditionMagic();
		System.out.println(additionMagic.add(2.0, "hello"));
		
		System.out.println(additionMagic.add(20.00, 2.00));
		System.out.println(	additionMagic.add("hello", "Aorld"));
		
	
		
		
	}
	
	public String add(double a, String b) {
		 
		return a+b;
	}
   
	public String add(double a, double b) {
		
		double c = a+b;
		
		String st =  Double.toString(c);
		if(!st.contains(".0")) {
			return String.format("%.2f", c);
		}
		
		return st;
	}
	
	public String add(String a, String b) {
		return a+b;
		
	}
	
	
}
