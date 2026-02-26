package hackerRankTest;

import java.util.Scanner;

class UsernameValidator{
	
	
	
	public static final String RegularExpression =  ("^[a-zA-Z][a-zA-Z0-9_]{7,29}$");
	
	
}

public class RegularExpressionSolution {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scan = new Scanner(System.in);
		  int n = Integer.parseInt(scan.nextLine());
		  while (n-- != 0) {
	            String userName = scan.nextLine();

	            if (userName.matches(UsernameValidator.RegularExpression)) {
	                System.out.println("Valid");
	            } else {
	                System.out.println("Invalid");
	            }           
	        }

	}

}
