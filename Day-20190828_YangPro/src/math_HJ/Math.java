package math_HJ;

import java.util.Scanner;

public class Math {

	int n, m;  // �ʵ� ����
	int Way, x; // �ʵ� ����
	int result;
	
	Scanner scan = new Scanner(System.in);
	
	Math(int n, int m){  // ������ �޼���
		this.n=n;
		this.m=m;
	}
		
	void cal(int Way, int x) {  // �޼���
		n = 0; // �ʱ�ȭ
		m = 0; // �ʱ�ȭ	
		Way = 0; // �ʱ�ȭ
		x = 0; // �ʱ�ȭ
		result = 0; // �ʱ�ȭ
		
		System.out.println("n= "); n = scan.nextInt();		// �Է�
		System.out.println("m= "); m = scan.nextInt();		// �Է�
		System.out.println("Way[1(��ü���ϱ�),2(¦������),3(Ȧ������),4(�Ҽ�����),5(x�������)] = "); Way = scan.nextInt();		// �Է�		
		
		switch(Way) {
			case 1 :  // ��ü ���ϱ�				
				for (int i=n; i <=m; i++) {
					result++;
				}		
				break;
				
			
			case 2 :  // ¦�� ���� ���ϱ�
				
				for (int i=n; i <=m; i++) {
					if (i/2 == 0)
						result++;
				}
				break;
				
				
			case 3 :  // Ȧ�� ���� ���ϱ�
				result = 0;
				for (int i=n; i <=m; i++) {
					if (i/2 == 1)
						result++;
				}
				break;
			
			
			case 4 :  // �Ҽ� ���� ���ϱ�
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
				
				
			case 5 :  // x�� ��� ���ϱ�				
				System.out.println("x = "); x = scan.nextInt();		// �Է�
				for(int i=n; i<=m; i++) {
				if((i%x)==0)
					result++;			
				}				
				break;
				
		}
		System.out.println(result);

	}
	
}
		