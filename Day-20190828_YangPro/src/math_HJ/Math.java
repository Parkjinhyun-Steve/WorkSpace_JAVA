package math_HJ;

import java.util.Scanner;

public class Math {

	int n, m;  // 필드 생성
	int Way, x; // 필드 생성
	int result;
	
	Scanner scan = new Scanner(System.in);
	
	Math(int n, int m){  // 생성자 메서드
		this.n=n;
		this.m=m;
	}
		
	void cal(int Way, int x) {  // 메서드
		n = 0; // 초기화
		m = 0; // 초기화	
		Way = 0; // 초기화
		x = 0; // 초기화
		result = 0; // 초기화
		
		System.out.println("n= "); n = scan.nextInt();		// 입력
		System.out.println("m= "); m = scan.nextInt();		// 입력
		System.out.println("Way[1(전체더하기),2(짝수개수),3(홀수개수),4(소수개수),5(x배수개수)] = "); Way = scan.nextInt();		// 입력		
		
		switch(Way) {
			case 1 :  // 전체 더하기				
				for (int i=n; i <=m; i++) {
					result++;
				}		
				break;
				
			
			case 2 :  // 짝수 개수 구하기
				
				for (int i=n; i <=m; i++) {
					if (i/2 == 0)
						result++;
				}
				break;
				
				
			case 3 :  // 홀수 개수 구하기
				result = 0;
				for (int i=n; i <=m; i++) {
					if (i/2 == 1)
						result++;
				}
				break;
			
			
			case 4 :  // 소수 개수 구하기
				int a, b;
				for(a=n; a<=m; a++) { 
					for(b=2; b<=m; b++) {
						if((a%b)==0)
							break;						
					}
					if(a==b)
						result++;
				}
				break;
				
				
			case 5 :  // x의 배수 구하기				
				System.out.println("x = "); x = scan.nextInt();		// 입력
				for(int i=n; i<=m; i++) {
				if((i%x)==0)
					result++;			
				}				
				break;
				
		}
		System.out.println(result);

	}
	
}
		