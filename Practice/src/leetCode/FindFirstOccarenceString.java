package leetCode;

public class FindFirstOccarenceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aaa";
		String s1 = "aaaa";
		 int k =0;
	    
		 String []st = new String[s.length() - (s1.length()-1)];
	        

	        for(int  i = 0 ; i<st.length ; i++){
	            
	            st[i] = s.substring(i, (i+s1.length()));
	            System.out.println(st[i]);
	            

	        }
	       
	        
	        			        	
	        for(int i =0 ; i<st.length ; i++) {
	        	
	        	
	        	
	        	if(st[i].equals(s1)) {
	        		k = i;
	        		break;
	        	}else {
	        		k = -1;
	        	}
	        	
	        }
	        	
	        	
	        	
	        
		//System.out.println(k);

	}

}
