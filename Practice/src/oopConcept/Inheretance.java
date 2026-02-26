package oopConcept;

import java.util.Scanner;

public class Inheretance {
	
	public static void main(String agr[]) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Maths m = new Maths();
		m.Add(a, b);
		
		Substraction s = new Substraction();
		s.Add(a, b);
		s.Sub(a, b);
		
	}
	
	public void display() {
		
		
	}

}
 

class Maths{
	
	public int Add(int a, int b) {
		int c = a+b;
	    return c;
	}
	
}

class Substraction extends Maths{
	public int Sub(int a, int b) {
		int c = a-b;
		return c;
	}
}


