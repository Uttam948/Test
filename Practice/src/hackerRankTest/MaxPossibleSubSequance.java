package hackerRankTest;

public class MaxPossibleSubSequance {

	
	public static int factorial(int n) {
		
		if(n < 2) {
			System.out.println(n);
			return n;
		}
		int m = n*factorial(n-1);
		System.out.println(m);
		return m;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxPossibleSubSequance.factorial(5);
	}
}
