package p26;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;

public class control {

	public static void main(String[] args) {
		int second = LocalDateTime.now().getSecond();
		
		if (second %2 == 0 ) {
			System.out.println(second + "�� ¦�� �Դϴ�\n");
		} else {
			System.out.println(second + "�� Ȧ�� �Դϴ�\n");
		}
	
		
		int month = LocalDateTime.now().getMonthValue();
	
		if (3 <= month && month <= 5) {
			System.out.println(month + "���� ���Դϴ�.\n");
		} else if (3 <= month && month <= 8) {
			System.out.println(month + "���� �����Դϴ�.\n");
		} else if (3 <= month && month <= 8) {
			System.out.println(month + "���� �����Դϴ�.\n");
		} else {
			System.out.println(month + "���� �ܿ��Դϴ�.\n");
		}
		
		Month month1 = LocalDateTime.now().getMonth();
		
/*		switch (month1) {
			case MARCH:
			case APRIL:
			case MAY:
				System.out.println(month + "��(��) ���̴�");
				break;
			case JUNE:
			case JULY:
			case AUGUST:
				System.out.println(month + "��(��) �����̴�");
				break;
			case SEPTEMBER:
			case OCTOBER:
			case NOVEMBER:
				System.out.println(month + "��(��) �����̴�");
				break;
			default:
				System.out.println(month + "��(��) �ܿ��̴�");
				break;
		
*/		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
			System.out.println(i + "��°" + sum);
			
		int[] numbers = {1,1,2,3,5,8,13,21};
		for(int number : numbers) {
			System.out.println(number);
		
		
		Scanner in = new Scanner(System.in);  // Scanner ���̺귯��??
		System.out.println("��ȣ�� �Է��� �ּ���");
		String str = in.nextLine();
		
		while(!str.equals("abc")) {
			System.out.println("��ȣ�� Ʋ�Ƚ��ϴ�. ��ȣ�� �Է��� �ּ���");
			str = in.nextLine();			
		}
		
		System.out.println("OK!");
		
	
		
		}
	}			
}

}








