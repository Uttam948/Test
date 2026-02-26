package leetCode;

public class StringAtio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st = " -042 ";

		String sr = st.trim();
        String n = "";
        int digit = 0;
		StringBuilder str = new StringBuilder();
		char ch = 0;
		str.append(sr);
		long val = 0;
		 for(int i =0 ;i<sr.length() ; i++) {
			  
		      if(Character.isDigit(sr.charAt(i))) {
		    	  
		    	   val = val * 10 +  sr.charAt(i) - '0';
		    	
		      }
		      else if(sr.charAt(i) == '-') {
		    	   ch = '-';
		      }else {
		    	  break;
		      }
			 
		 }
		 
		 int maxSize = Integer.MAX_VALUE;
		 int minSize = Integer.MIN_VALUE;
		 
		
		 if(ch == '-') {
			  System.out.println(val*(-1)); 
		 }else {
			 System.out.println(val);
		 }
		 if(val > maxSize) {
				val = maxSize;
			 }else if(val < minSize){
				val = minSize;
			 }
			 
		 
	}

}
