package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

public class diff {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your date of birth");
			System.out.println("enter date");
			int date1=sc.nextInt();
			System.out.println("enter month");
			int month1=sc.nextInt();
			System.out.println("enter year");
			int year1=sc.nextInt();
			
			System.out.println("enter your siblings date of birth");
			System.out.println("enter date");
			int date2=sc.nextInt();
			System.out.println("enter month");
			int month2=sc.nextInt();
			System.out.println("enter year");
			int year2=sc.nextInt();
			
			
		 	LocalDate d1 = LocalDate.of(year1,month1,date1);
		    LocalDate d2 = LocalDate.of(year2, month2,date2);
		    
		    LocalDateTime l=d1.atStartOfDay();
		    LocalDateTime l2=d2.atStartOfDay();
		    
		    ZoneId  tokyo = ZoneId.of("Asia/Tokyo");
		    ZoneId  guy = ZoneId.of("America/Guyana");
		    ZonedDateTime d3=l.atZone(tokyo);
		    ZonedDateTime d4=l.atZone(guy);

		    Period period = Period.between(d1, d2);
		    int diff = period.getDays();
		    
		    Period period2 = Period.between(d1, d2);
		    int diff2 = period.getDays();
		 
		    System.out.println(d1+" "+d2);
		    System.out.println(diff);
		    double ans=Math.abs(diff*8.64);
		    System.out.printf("difference in nano seconds = %.4f x10^14 nanoseconds",ans);
		    System.out.println();
		    System.out.println("difference in days(diff timezone)"+diff2);
		    //assertEquals(diff, 6);
	}

}
