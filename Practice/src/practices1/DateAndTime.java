package practices1;

public class DateAndTime {

	public static void main(String[] args) {
		
		
		String st = "welcomeToJava";
		String st2[] = new String[st.length()-2];
		int k = 3;
		int count =0;
		for(char i='a',l='A' ;i<='z' || l<'Z';i++,l++) {
		  
			for(int j=0;j<st.length()-2;j++) {
				
				if( l == st.charAt(j)) {
					
					
					st2[count] = st.substring(j, j+k);
					count++;
				}
				
				if(i==st.charAt(j)) {
					st2[count] = st.substring(j, j+k);
					count++;
				}
				
			}
		}
		String st3 = "";
		
		for(int i=0;i<st2.length;i++) {
		 if(Character.isUpperCase(st2[i].charAt(0))) {
			  st3 = st2[i];
			 break;
		 }else {
			 st3 = st2[0];
		 }
		}
			System.out.println(st3+" "+st2[st2.length-1]);
		
		
		
	}

}
