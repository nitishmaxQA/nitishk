package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class utils {
	
	
	public static String DepartureDate () {
		
		DateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, +30);
		 Date todaydate= cal.getTime();    
	     String DepartureDate1 = dateFormat.format(todaydate);
	     return DepartureDate1;
	     
		
	}
	
public static String ArrivalDate () {
		
		DateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, +40);
		 Date todaydate= cal.getTime();    
	     String DepartureDate1 = dateFormat.format(todaydate);
	     return DepartureDate1;
	
	}
}
