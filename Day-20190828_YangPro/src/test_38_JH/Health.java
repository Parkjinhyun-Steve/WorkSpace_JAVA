package test_38_JH;

import java.util.Scanner;

public class Health {	
	// �ʵ� ����
	String gender;
	double tall;
	double weight;
	
	
	// ������ �޼ҵ� ����	
	Health(){
		
	}
	
	Health(String g , double tall, double weight){  // ������ �޼ҵ�� Ÿ���� ����.
		gender=g; 		// �ʱ�ȭ
		tall=0;			// �ʱ�ȭ
		weight=0;		// �ʱ�ȭ
	}
		
	void input() {  // �Ϲ� �޼���� Ÿ���� �ִ�.  
		
		// ����, ����, ü�� �Է¹ޱ� 
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("����(M/F) : "); gender=sc.next();
		System.out.println("����(Cm)  : "); tall=sc.nextDouble();
		System.out.println("ü��(Kg)  : "); weight=sc.nextDouble();
		
				
	}

	void output1() {
		//���????
		System.out.println("���� - " + gender);		
		System.out.println("���� - " + tall);
		System.out.println("ü�� - " + weight);
		
	}


}
