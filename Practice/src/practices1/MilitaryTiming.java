package practices1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class MilitaryTiming {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		String st = "07:05:45PM";
		String st2[] = st.split(":");
		int hours = Integer.parseInt(st2[0]);
	
		if(hours == 12 && st.contains("PM")) {
			
			System.out.println(st.replace("PM", ""));
			
		}else if(hours == 12 && st.contains("AM")) {
			 st2[0] = "00";
			 System.out.println(st2[0] + ":" +st2[1] + ":" + st2[2].replace("AM", ""));
	
		
		}else {
			if(st.contains("PM"))
			{
				hours = hours +12;
				System.out.println(hours + ":" + st2[1] + ":" + st2[2].replace("PM", ""));
			}else if(st.contains("AM")){
				System.out.println(st.replace("AM", ""));
			}
		}
		
}
	
}

