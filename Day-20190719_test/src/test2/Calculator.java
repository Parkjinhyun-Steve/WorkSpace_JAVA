package test2;

public class Calculator {  // 캘큘레이터 클래스 이름
	private int x, y;
	
	Calculator(int x, int y) {
		this.x =x;
		this.y =y;
	}
	
	Calculator() {
		
	}
	
	Calculator(int a) {
		
	}
		
	
	int rem() {  // 앞에 접근 제한자가 없다면 디폴트 제한자로 설정 된다.
		
		return x%y;
	}

	double div() {
		
		return (double)x/y;
	}

	int mul() {
		
		return x*y;
	}

	int sub() {
		
		return x-y;
	}

	int add() {
		
		return x+y;
				
		

    }
	
}
