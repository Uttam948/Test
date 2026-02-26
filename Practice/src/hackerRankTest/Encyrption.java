package hackerRankTest;

public class Encyrption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Uttam Singh";
		String[] str1 = str.split(" ");
		char arr[] = str.toCharArray();
		double count = 0;
		for(int i =0 ; i <arr.length ; i++) {
		//	System.out.print(str1[i]);
			if(arr[i] != ' ') {
			   count++;
			}
		}
		double sr = 57.00;
		double sqrt = Math.sqrt(sr);
		double decimalpart = sqrt - Math.floor(sqrt);
		int val = (int) Math.round(sqrt);
		if(decimalpart < 0.5) {
			//System.out.println(decimalpart);
		}
		//System.out.println(sqrt);
		System.out.println(Math.sqrt(12));
		
	
	}
}
