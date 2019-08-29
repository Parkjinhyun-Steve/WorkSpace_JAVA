package test_38;

public class Test38 extends Health {  // 상속 받음
	double s_weight; // 필드 생성
	double fat;
	String result;
	
	Test38(){  // 생성자 메서드 생성
		s_weight=0.0; // 표준체중 초기화
		fat=0.0;  // 비만도
		result=null;  // 결과
	}
	
	void calculate(){  // 생성자 메서드 생성  // 반환값 있음
		
		double value;
		if(super.gender.equalsIgnoreCase("M"))   // if 함수 이용 //super키  사용. gender 필드
			value=0.9;
		else
			value=0.85;
		
		// 표준체중
		s_weight=(super.tall-100) * value;	   
		
		// 비만도
		fat = (super.weight/s_weight) * 100;  
		
		// 결과
		if(fat <= 90)
			result="저체중";		
		else if (fat <= 110)
			result="정상(표준체중)";
		else if (fat <= 120)
			result="과체중";
		else if (fat <= 130)
			result="경도비만";
		else if (fat <= 130)
			result="중도비만";
		else
			result="고도비만";	
		
	}
	
	void output2(){ // 생성자 메서드 생성  // 반환값 있음
		System.out.println("당신의 비만도는 " + fat + ", " + result + "입니다." );
		
	}
	

}
