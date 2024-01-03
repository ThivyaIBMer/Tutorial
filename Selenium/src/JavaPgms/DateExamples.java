package JavaPgms;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class DateExamples {
	int i;
	String d;

public void datesamples() {
	Date d=new Date();
	System.out.println(d.toString());

	SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy");
	SimpleDateFormat sd=new SimpleDateFormat("MMM-dd-yyyy");
	SimpleDateFormat sdf_h=new SimpleDateFormat("MMM-dd-yyyy hh:mm:ss");
	System.out.println(sdf.format(d));
	System.out.println(sd.format(d));
	System.out.println(sdf_h.format(d));
}
public void calendarSamples() {
	Calendar cal=Calendar.getInstance();
	SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy");
	System.out.println(sdf.format(cal.getTime()));
	System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	System.out.println(cal.get(Calendar.HOUR_OF_DAY));
	System.out.println(cal.get(Calendar.AM_PM));
}


	public static void main(String[] args) {
		DateExamples de=new DateExamples();
		System.out.println(de.d);
		de.datesamples();
		de.calendarSamples();
		

	}

}
