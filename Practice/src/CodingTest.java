
public class CodingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "substances";
		String abbr = "s3t2ces";
        System.out.println(recursion(str, abbr));
	}
	
	public static boolean recursion(String str , String abbr) {
		
		int i = 0;
	    int j = 0;
		while(i < abbr.length()) {
			int val = 0;
			System.out.println(str.charAt(j) +" "+ abbr.charAt(i));
			if(Character.isDigit(abbr.charAt(i))) {
				int m = abbr.charAt(i) - '0';
				val = val*10 + m;
				j = j + val;
				i++;
				//sSystem.out.println(i);
			}else if(abbr.charAt(i) == str.charAt(j)) {
				i++;
				j++;
			}else {
				return false;
			}
		}
		
		return true;
	}

}
