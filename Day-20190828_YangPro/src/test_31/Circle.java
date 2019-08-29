package test_31;

import java.util.Scanner;

public class Circle {

	int r; // 필드 생성
	double size;
	final double PI=3.141592;
	
	Circle() {   // 생성자 메서드 (생략가능)
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름 : ");
		r = sc.nextInt();
	}
		
	void process() {  // 메서드 
		size = r*r*PI;		
		
	}
	void output() {  // 메서드
		System.out.println("원의 넓이: " + size);
	}
}

		


