package test_38;

import java.util.Scanner;

public class Health {
	String gender;  // �ʵ�
	double tall;
	double weight;
	
	Health(){  // ������(��������)
		
	}
	
	void input() {  // ��ǲ �޼���
		System.out.println("****** Check ******");
		Scanner scan = new Scanner(System.in);
		System.out.println("����(M/F): ");
		gender=scan.next();		// �Է�
		System.out.println("����(cm): ");
		tall=scan.nextDouble();		// �Է�
		System.out.println("ü��(kg): ");
		weight=scan.nextDouble();		// �Է�
		
	}
	
	void output1() {  // �ƿ�ǲ �޼���		
		System.out.println("���� - " + gender);
		System.out.println("���� - " + tall);
		System.out.println("ü�� - " + weight);
				
	}	

}
