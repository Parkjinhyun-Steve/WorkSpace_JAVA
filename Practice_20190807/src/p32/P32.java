package p32;

import java.util.Scanner;

public class P32 {

	public static void main(String[] args) {
		
/*		Scanner in = new Scanner(System.in);  // Scanner ���̺귯��??
		System.out.println("��ȣ�� �Է��� �ּ���");
		String str = in.nextLine();
		
		while(!str.equals("abc")) {
			System.out.println("��ȣ�� Ʋ�Ƚ��ϴ�. ��ȣ�� �Է��� �ּ���");
			str = in.nextLine();			
		}
		
		System.out.println("OK!");
		
*/		
		
		Scanner in = new Scanner(System.in);
		System.out.println("��ȣ�� �Է��� �ּ���");
		String str = in.nextLine();
		
		while (true) {
			if (str.equals("abc")) {
				break;				
		}
		
		System.out.println("��ȣ�� Ʋ���ϴ�. �ùٸ� ��ȣ�� �Է��� �ּ���!");
		str = in.nextLine();
		
		}
	
		System.out.println("OK!");
	
	}
}


