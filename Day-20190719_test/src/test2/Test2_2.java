package test2;

import java.util.Scanner;

public class Test2_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 65430���� ����� ���� ȭ���� ������ ���Ͻÿ�.
		
		int money=65430;
		int a, b, c, d;  		
		
		a=money/10000;  //������ ����
		money= money - (a*10000);
		
		b=money/1000;  //õ���� ����
		money= money - (b*1000);
		
		c=money/100;  //����� ����
		money= money - (c*100);
		
		d=money/10;  //�ʿ��� ����

		// ���
		System.out.println("���� = " + a); 
		System.out.println("õ�� = " + b);
		System.out.println("��� = " + c);
		System.out.println("�ʿ� = " + d);
		
				

	}

}
