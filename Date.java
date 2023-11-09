package mobitaining.day1;

import java.util.Calendar;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		
		System.out.println("Day : " + c.get(Calendar.DATE));
		System.out.println("Month : " + c.get(Calendar.MONTH));
		System.out.println("Year : " + c.get(Calendar.YEAR));
		System.out.println("Hour : " + c.get(Calendar.HOUR));
		System.out.println("Minute : " + c.get(Calendar.MINUTE));
	}

		

	}

	

