package Java8features;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println(d);
		
		//converting Date to String
		SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
		  String format = sdf.format(d);
		  System.out.println(format);
		  
		  SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-mm-dd");
		  String format1 = sdf1.format(d);
		  System.out.println(format1);
		  
		  //converting String to Date
		  
		  SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-mm-dd");
		 Date date = null;
		try {
			date = sdf2.parse("2025-12-09");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  System.out.println(date);
      
	}

}
