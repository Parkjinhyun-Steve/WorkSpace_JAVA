package test_38_JH;

import java.util.Scanner;

public class Health {	
	// 필드 생성
	String gender;
	double tall;
	double weight;
	
	
	// 생성자 메소드 생성	
	Health(){
		
	}
	
	Health(String g , double tall, double weight){  // 생성자 메소드는 타입이 없다.
		gender=g; 		// 초기화
		tall=0;			// 초기화
		weight=0;		// 초기화
	}
		
	void input() {  // 일반 메서드는 타입이 있다.  
		
		// 성별, 신장, 체중 입력받기 
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("성별(M/F) : "); gender=sc.next();
		System.out.println("신장(Cm)  : "); tall=sc.nextDouble();
		System.out.println("체중(Kg)  : "); weight=sc.nextDouble();
		
				
	}

	void output1() {
		//출력????
		System.out.println("성별 - " + gender);		
		System.out.println("신장 - " + tall);
		System.out.println("체중 - " + weight);
		
	}


}
