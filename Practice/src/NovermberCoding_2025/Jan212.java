package NovermberCoding_2025;

public class Jan212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "abc";
		String str1 = "ahgbfdc";
		int j =0 ;
		
	  for(int i =0 ;i<str1.length() ; i++) {
		  
		  if(str1.charAt(i) == str.charAt(j)) {
			  j++;
		  }
		  
		  System.out.println(j);
	  }
	  
	  if(j == str.length()) {
		  System.out.println("ok boss");
	  }
		
	}
}
