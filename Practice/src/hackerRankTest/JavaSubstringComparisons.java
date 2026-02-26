package hackerRankTest;

public class JavaSubstringComparisons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhs"
				+ "dlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfh"
				+ "sdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
		
		//String s = "welcometojava";
		//int k = 3;
		int k = 30;
		
		String st1=s.substring(0, k);
        String st2=s.substring(0, k);
        
        
        
        String []st = new String [s.length()-(k-1)];
        
        for(int i =0 ; i<st.length ;i++) {
            
            st[i] = s.substring(i, i+k);
            
           // System.out.println(st[i]);
            
        }
          for(int i =1 ; i<st.length;i++) {
        	  
        	  
            
            if(st1.charAt(0) > st[i].charAt(0)) {
                
                st1 = st[i];
            }
            
               if(st2.charAt(0) < st[i].charAt(0)) {
                
                st2 = st[i];
            }
            
        }
          
          System.out.println(st1 + "  " + st2);
          
          

	}

}
