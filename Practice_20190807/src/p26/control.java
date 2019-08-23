package p26;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;

public class control {

	public static void main(String[] args) {
		int second = LocalDateTime.now().getSecond();
		
		if (second %2 == 0 ) {
			System.out.println(second + "는 짝수 입니다\n");
		} else {
			System.out.println(second + "는 홀수 입니다\n");
		}
	
		
		int month = LocalDateTime.now().getMonthValue();
	
		if (3 <= month && month <= 5) {
			System.out.println(month + "월은 봄입니다.\n");
		} else if (3 <= month && month <= 8) {
			System.out.println(month + "월은 여름입니다.\n");
		} else if (3 <= month && month <= 8) {
			System.out.println(month + "월은 가을입니다.\n");
		} else {
			System.out.println(month + "월은 겨울입니다.\n");
		}
		
		Month month1 = LocalDateTime.now().getMonth();
		
/*		switch (month1) {
			case MARCH:
			case APRIL:
			case MAY:
				System.out.println(month + "은(는) 봄이다");
				break;
			case JUNE:
			case JULY:
			case AUGUST:
				System.out.println(month + "은(는) 여름이다");
				break;
			case SEPTEMBER:
			case OCTOBER:
			case NOVEMBER:
				System.out.println(month + "은(는) 여름이다");
				break;
			default:
				System.out.println(month + "은(는) 겨울이다");
				break;
		
*/		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
			System.out.println(i + "번째" + sum);
			
		int[] numbers = {1,1,2,3,5,8,13,21};
		for(int number : numbers) {
			System.out.println(number);
		
		
		Scanner in = new Scanner(System.in);  // Scanner 라이브러리??
		System.out.println("암호를 입력해 주세요");
		String str = in.nextLine();
		
		while(!str.equals("abc")) {
			System.out.println("암호가 틀렸습니다. 암호를 입력해 주세요");
			str = in.nextLine();			
		}
		
		System.out.println("OK!");
		
	
		
		}
	}			
}

}








