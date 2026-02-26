package leetCode;

public class LogestPelindromSecondApproch {

	public static String maxPelindrome(String str , int left , int right) {
		
		while(left>=0 && right<str.length() && str.charAt(left) == str.charAt(right)) {
			left--;
			right++;
		}
	
		
		 return str.substring(left+1 , right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	String st = "asddbbabb"; cccc  ,cccvv , vvvc , vccc ,vv ,v ,abba
			String st = "mcccx";
	//	String st = "abba";
	//	String st = "abb";
     //		Stirng st = cbac; aabaa // aba
		//String st = "babad";
		//	"aacabdkacaa"
		//	String st ="bacaa";
		//	String st = "jhddc";
		//	String st = "aabaa";
		//	String st = "acaa";
		//	String st = "bacabab";
		//	String st = "aacabdkacaa";
			
			
			String str = "";
			for(int i =0 ; i < st.length() ; i++) {
			String str1 =maxPelindrome(st , i , i);
			String str2 =maxPelindrome(st, i, i+1); 
			
			if(str1.length() > str.length() ) {
				
				    str = str1;
			} if( str2.length() > str.length()) {
			  
			    str = str2;
			}	
	}

			System.out.println(str);
	}
}
