package test2;

public class Calculator {  // Ķŧ������ Ŭ���� �̸�
	private int x, y;
	
	Calculator(int x, int y) {
		this.x =x;
		this.y =y;
	}
	
	Calculator() {
		
	}
	
	Calculator(int a) {
		
	}
		
	
	int rem() {  // �տ� ���� �����ڰ� ���ٸ� ����Ʈ �����ڷ� ���� �ȴ�.
		
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
