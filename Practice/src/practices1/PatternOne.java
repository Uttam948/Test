package practices1;

public class PatternOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i =0 ;i<5 ; i++) {
			
			for(int j = i; j<5 ; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}

		/*
		 * for (int i =0 ;i<=5 ; i++) {
		 * 
		 * for(int j = 1; j<=i ; j++) {
		 * 
		 * System.out.print("*"); }
		 * 
		 * System.out.println(); }
		 */

		for(int i =0 ; i<=5 ; i++) {
			
			for(int j = 0 ; j<=i ; j++) {
				
				for(int k =0 ; k<=(5-j) ; k++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}



