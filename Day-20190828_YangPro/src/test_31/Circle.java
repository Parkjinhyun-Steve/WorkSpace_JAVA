package test_31;

import java.util.Scanner;

public class Circle {

	int r; // �ʵ� ����
	double size;
	final double PI=3.141592;
	
	Circle() {   // ������ �޼��� (��������)
		Scanner sc = new Scanner(System.in);
		System.out.println("������ : ");
		r = sc.nextInt();
	}
		
	void process() {  // �޼��� 
		size = r*r*PI;		
		
	}
	void output() {  // �޼���
		System.out.println("���� ����: " + size);
	}
}

		


