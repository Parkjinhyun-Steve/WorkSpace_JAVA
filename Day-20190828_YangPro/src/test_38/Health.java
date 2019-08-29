package test_38;

import java.util.Scanner;

public class Health {
	String gender;  // 필드
	double tall;
	double weight;
	
	Health(){  // 생성자(생략가능)
		
	}
	
	void input() {  // 인풋 메서드
		System.out.println("****** Check ******");
		Scanner scan = new Scanner(System.in);
		System.out.println("성별(M/F): ");
		gender=scan.next();		// 입력
		System.out.println("신장(cm): ");
		tall=scan.nextDouble();		// 입력
		System.out.println("체중(kg): ");
		weight=scan.nextDouble();		// 입력
		
	}
	
	void output1() {  // 아웃풋 메서드		
		System.out.println("성별 - " + gender);
		System.out.println("신장 - " + tall);
		System.out.println("체중 - " + weight);
				
	}	

}
