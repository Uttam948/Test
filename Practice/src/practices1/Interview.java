package practices1;

import java.util.Scanner;

public class Interview {
	
	public static void main(String agr[])
	{
		String st = "ACNCGBAGJAKAGGG";
	//	String st = "AAAA";
		int paircount = 0;
		int Acount = 0;
		//int Atotal = 0;
		
		int startposition = 0;
		
		
	    for(int i=0 ; i<=st.length()-1 ; i++)
	    {
	    	if(st.charAt(i) == 'A' )
	    	{
	    		Acount++;
	    	}
	    	if(st.charAt(i) == 'G') {
	    		paircount = paircount+Acount;
	    	}
	    	}
	    
	    System.out.println(paircount);
	}

}
