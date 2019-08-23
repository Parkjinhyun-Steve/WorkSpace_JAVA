package test2;

import java.util.Scanner;

public class Test2_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//클래스이름    객체생성  = new  생성자(클래스 이름과 똑같음)   // 스캐너 라는 객체를 사용하기 위함
		
		String str;
		int num;
		System.out.println("글자입력: ");  
		
		
		str=scanner.next();
     	//str=객체이름.메소드
		System.out.println("숫자입력: ");
		
		num=scanner.nextInt();
     	//num=객체이름.메소드		

		System.out.println( str + num);
		
		scanner.close(); // 스캐너 객체를 닫어버림. 
		
				
		
	}

}
