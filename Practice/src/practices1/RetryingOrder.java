package practices1;

public class RetryingOrder {

	
	public static void main(String agr[]) {
	
		String st = "AbcaZeoB";
		StringBuilder str = new StringBuilder();
		str.append(st);
		int n = st.length();
	//	char ch;
		char chr[] = new char[n];
		for(int i=0 ;i<n ;i++)
		{
			char che = st.charAt(i);
			if((che >= 'A' && che <= 'Z' )) {
				
			}
				if(st.charAt(i)=='a'|| st.charAt(i)=='e'|| st.charAt(i)=='i'||
						st.charAt(i)=='o'|| st.charAt(i)=='u') {
					che= '#';
					chr[i] = che;
				}
			}
		
	//	String str = String.valueOf(chr);
		System.out.println(str);
		
	}
}
