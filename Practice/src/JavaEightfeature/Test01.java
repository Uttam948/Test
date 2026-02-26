package JavaEightfeature;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st = "aabbccaa";
		char s[] = st.toCharArray();
		int a[] = new int[st.length()];
		int count ;
		 
		for(int i = 0; i<st.length();i++)
		{
		      count = 1;
		      
		    for(int j = i+1;j<st.length();j++){

		     if( s[j] == s[i]){
		        count++;
		        s[j] = '0'; 
		   }
		    
		       
		}
		    a[i] = count;
		    
		    // System.out.println(a[i]);

		}
		
		 for(int i = 0;i<st.length() ; i++) {
		    
			 if(s[i] != '0') {
				 
				 System.out.println(a[i]);
			 }
			 
		    }

	}

}
