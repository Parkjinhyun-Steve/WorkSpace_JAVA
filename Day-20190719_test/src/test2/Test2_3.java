package test2;

public class Test2_3 {

	public static void main(String[] args) {
		// 사칙연산을 수행하는 메소드(함수) 만들기
		
		int x=10, y=3;
		System.out.println(add(x,y));  // 더한값
		System.out.println(sub(x,y));  // 뺀값
		System.out.println(mul(x,y));  // 곱한값
		System.out.println(div(x,y));  // 나눗셈(몫값) - 몫값이 소수점으로 출력
		System.out.println(rem(x,y));  // 나숫셈(나머지값)  
		
		Calculator cal1 = new Calculator(10,3);
		//클래스이름   객체생성 = new 생성자(클래스 이름과 똑같음)
				
		System.out.println(cal1.add());
		System.out.println(cal1.sub());
		
		
		Calculator cal2 = new Calculator(3,7);

		System.out.println(cal2.add());
		System.out.println(cal2.sub());
		
		

	}

	private static int rem(int x, int y) {
		
		return x%y;
	}

	private static double div(int x, int y) {
		
		return (double)x/y;
	}

	private static int mul(int x, int y) {
		
		return x*y;
	}

	private static int sub(int x, int y) {
		
		return x-y;
	}

	private static int add(int x, int y) {
		
		return x+y;
				
				
		
	}
}

