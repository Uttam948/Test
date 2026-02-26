package JavaPatternProgram;

public class PatternOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		for(int i =0 ;i<5 ; i++) {
			
              for(int k = i;k<5 ; k++) {
				
            	   System.out.print("*");
			}
			for(int j = 0 ; j<5 ; j++) {
				
				if(j < i) {
					System.out.print("  ");
				}else {
					System.out.print("*");
				}
			}
			if(i < 4) {
			System.out.println();
			}
		}
		int n = 9;
		for(int i =0 ;i<=5 ;i++) {
			for(int j = 0;j<i;j++) {
				System.out.print("*");
			}
               for(int  j= 0;j<5 ; j++) {
				
				if(5-i-1 < j) {
					System.out.print("*");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
