package practices1;



public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "Uttam";
		
	    
		
		char[] st = new char[str.length()] ;
		
		int k = 0;
		int key = 3;
		
		int left = str.length() - key;
		
		StringBuilder str2 = new StringBuilder();
		
	String[] str1 = str.split("a" , key);
	
	System.out.println(str1);
	
	int i = 1;	
	
	for( i = str.length()-1 ; i >= 3 ; i--) {
		
		st[k] = str.charAt(i);
		k++;
	}
	st[k] = str.charAt(i);
	
	
	
	
	st.toString();
	
	//	StringBuilder str1 =  new StringBuilder(str);
      System.out.println(st);
	
		
	//	str1.reverse();
	}

}
