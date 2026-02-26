
public class HackarrankProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "uttvam";
		
		char ch = 'a';
		
		for(int i =0 ; i<str.length() ; i++) {
			
			if(ch < str.charAt(i)) {
				ch = str.charAt(i);
			}
		}

		int a = 'v' - 'a' + 1;
		
		System.out.println(a);
		
		
		//System.out.println( ch - '0' - 26);
	}

}
