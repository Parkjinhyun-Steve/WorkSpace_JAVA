package p281;

import java.util.*;

public class ExCalender {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//Date date = calendar.getTime();
		//System.out.println(date);
		
		Date date = new Date(calendar.getTimeInMillis());
		System.out.println(date);
		
	}

}
