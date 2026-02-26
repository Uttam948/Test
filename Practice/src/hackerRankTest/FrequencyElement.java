package hackerRankTest;

public class FrequencyElement {
	
	
	public static void main(String gar[]) {
		
		String st = "aaabbbbccghhh"; 
		
		char []ch = st.toCharArray();
		
		int fre[] = new int[st.length()];
		
		for(int i =0 ;i<st.length() ; i++) {
			
			fre[i] = 1;
			
			for(int j = i+1 ; j<st.length() ; j++) {
				
				if(ch[i] == ch[j]) {
					
					fre[i]++;
					
					ch[j] = '0';
				} 
			}
		}
		
		for(int i =0 ;i<st.length() ; i++) {
			if(ch[i]!='0' && ch[i] != ' ') {
				System.out.println(ch[i] + " " + fre[i]);
			}
		}
		
	}

}
