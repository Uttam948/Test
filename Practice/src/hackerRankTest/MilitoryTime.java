package hackerRankTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class MilitoryTime {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		String s = "12:01:00AM";
		String st = s.substring(s.length()-2 , s.length());
		String news = s.substring(0, s.length()-2);
		String s1 = s.substring(0,2);
	       String s2 = s.substring(3, 5);
	       String s3 = s.substring(6,8);
	       
	       String str = "";
	       
		char ch[] = s.toCharArray();
	
		for(int i =0 ; i< s.length() ; i++) {
			
			if((s.charAt(0) == 1 && s.charAt(i+1)== 2 ) && s.charAt(s.length()-1) == 'A' ) {
				
				ch[0] = '0';
				ch[1] = '0';
				
			}
			
			
		}
		
		
		System.out.println(st);
		
		
	}

}
