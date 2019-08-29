package test_38_JH;

public class Test38 extends Health {  // Health 상속
	// 필드 생성
	
	double s_weight;  // 표준체중
	double fat;
	String result;
	
	String grade = null;  // 초기화
			
	
	void calculate() {  // 메소드 생성
								
		// 남녀 표준 체중
		s_weight = 0.0; // 초기화
		switch(gender)
		{
			case "M" :
				fat = (tall-100)*0.9;
				System.out.println(s_weight); break;
				
			case "F" :
				fat = (tall-100)*0.85;
				System.out.println(s_weight); break;
			
			default : System.out.println("바보");			
		}
		
		// 비만도
		fat = 0.0;  // 초기화

		
		// 결과
		result = null;  // 초기화		
						
		if (fat <= 0.9)
			result = "저체중";
		else if (fat <= 1.1)
			result = "정상(표준체중)";
		else if (fat <= 1.2)
			result = "과체중";
		else if (fat <= 1.3)
			result = "경도비만";
		else if (fat <= 1.5)
			result = "중도비만";
		else
			result = "고도비만";
		
	}
				

		
}
	

