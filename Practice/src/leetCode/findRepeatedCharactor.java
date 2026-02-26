package leetCode;

public class findRepeatedCharactor {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st = "211";
		String str = "";
		int count = 1;
		
		if(st.length() > 4) {
		
		for(int i=0;i<st.length()-1 ; i++) {
			
			if(st.charAt(i) == st.charAt(i+1)) {
				count++;
			}else if(i == 0){
				str = str.concat(String.valueOf(count).concat(String.valueOf(st.charAt(i))));
				count = 1;
			}else {
				str = str.concat(String.valueOf(count).concat(String.valueOf(st.charAt(i-1))));
				 count = 1;
				 
			}
		}
		str = str.concat(String.valueOf(count).concat(String.valueOf(st.charAt(st.length()-1))));
		}else {
			
		}
		
		System.out.println(str);

	}

}
