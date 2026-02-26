package leetCode;

public class SubStringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st = "abcabcbb";
		String st1 = "pwwkew";
		
		String st2[] = new String[st.length()];
		
		//currently i am taking the char for storing value of st string but this is not the correct way 
		 //because some memory unused in the char ch2 it should be a dynamic char;
		char ch[] = st.toCharArray();
	
		char ch2[] = {};
		
		ch2[0] = ch[0];
		
		System.out.println(ch2[0]);
	
		for(int  i =1;i<st.length() ; i++) {
		    
			for(int j = 0;j< ch2.length; j++ ) {
				
				if(ch2[j] != ch[i]) {
					 
					ch2[i] = ch[i];
				}else {
					
					ch[j]= '0';
				}
			}
		}
		
		for(int i =0 ; i<ch2.length-1 ; i++) {
			
			System.out.println(ch2[i]);
		}

	}

}
