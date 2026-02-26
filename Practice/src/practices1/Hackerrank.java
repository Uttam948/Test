package practices1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Hackerrank {

	static int i =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if(i<=10)
		//System.out.printf("%d",i++);
	   // main(null);
		int k = 30;
		String st = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
		String st1=st.substring(0, k);
		String st2=st.substring(0, k);
		
		String []s = new String [st.length()-(k-1)];
		
		for(int i =0 ; i<st.length()-2;i++) {
			
			s[i] = st.substring(i, i+k);
		}
	      for(int i =1 ; i<s.length;i++) {
			
			if(st1.charAt(0) > s[i].charAt(0)) {
				
				st1 = s[i];
			}
			
               if(st2.charAt(0) < s[i].charAt(0)) {
				
				st2 = s[i];
			}
			
		}
	      System.out.println(st1 +" "+st2);
		
		  		
		}
		}
		

	


