package src;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.*;

public class DateDemo {

	public static void main(String args[]) throws ParseException {
			Date currentDate = new Date();
			
			Calendar calender =Calendar.getInstance();
			
			//System.out.println(calender);
			//calender.set(2019,7, 25);
		//	calender.add(Calendar.DATE, 4);
		//	System.out.println("Month is "+calender.get(Calendar.MONTH));
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter date in dd-mm-yyy");
			String date = scan.nextLine();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
			Date parseDate =dateFormat.parse(date);
			System.out.println(parseDate);
			
		//	SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd-mm-yyyy a zzzz GGGG");
		//	Date parseDate2 =dateFormat2.parse(date);
		//	System.out.println(parseDate2);

			
			
			scan.close();
			
	}
}
