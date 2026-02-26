package leetCode;



public class CountAndSay {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CountAndSay.recursion( 5));
	}
	
	
	
	public static String recursion(int n) {
		  
	     if(n == 1) {
	    	 return "1";
	     }
	     String str = recursion(n-1);
	     System.out.println(str);
		StringBuilder sb = new StringBuilder();
		int count = 1;
	
		char same = str.charAt(0);
		
		
	//	if(str.length() <4) {
	          for(int i =1 ; i<str.length();i++) {
				
				if(str.charAt(i) == same) {
					count++;
				
				}else {
				sb = sb.append(count).append(same);
					same = str.charAt(i);
					count = 1;
				}
			}
		
	        sb = sb.append(count).append(same);
		// 	System.out.println(str);
			
		//}
	       
		return sb.toString();
	}
}
