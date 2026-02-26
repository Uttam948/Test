package NovermberCoding_2025;

public class jan192 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int val = 31;
		int a = 30;
		int min = 0;
		int result = 0;
		
		int b = a-1;
		while(val/2 <= a) {
			b = a-1;
			 result = a | b;
			if( result == val) {
				min = b;
			}
			a = b;
		}
		System.out.println(min);
	}

}
