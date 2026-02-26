package practices1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "10:34:45 PM";
		//Date date = new Date
		SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ss a");
		SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
		Date date=null;
		
			try {
				date = parseFormat.parse(s);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

		System.out.println(parseFormat.format(date) + " = " + displayFormat.format(date));
	}

}
