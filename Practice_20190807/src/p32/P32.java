package p32;

import java.util.Scanner;

public class P32 {

	public static void main(String[] args) {
		
/*		Scanner in = new Scanner(System.in);  // Scanner 라이브러리??
		System.out.println("암호를 입력해 주세요");
		String str = in.nextLine();
		
		while(!str.equals("abc")) {
			System.out.println("암호가 틀렸습니다. 암호를 입력해 주세요");
			str = in.nextLine();			
		}
		
		System.out.println("OK!");
		
*/		
		
		Scanner in = new Scanner(System.in);
		System.out.println("암호를 입력해 주세요");
		String str = in.nextLine();
		
		while (true) {
			if (str.equals("abc")) {
				break;				
		}
		
		System.out.println("암호가 틀립니다. 올바른 암호를 입력해 주세요!");
		str = in.nextLine();
		
		}
	
		System.out.println("OK!");
	
	}
}


