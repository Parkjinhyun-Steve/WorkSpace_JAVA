package test2;

import java.util.Scanner;

public class Test2_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Ŭ�����̸�    ��ü����  = new  ������(Ŭ���� �̸��� �Ȱ���)   // ��ĳ�� ��� ��ü�� ����ϱ� ����
		
		String str;
		int num;
		System.out.println("�����Է�: ");  
		
		
		str=scanner.next();
     	//str=��ü�̸�.�޼ҵ�
		System.out.println("�����Է�: ");
		
		num=scanner.nextInt();
     	//num=��ü�̸�.�޼ҵ�		

		System.out.println( str + num);
		
		scanner.close(); // ��ĳ�� ��ü�� �ݾ����. 
		
				
		
	}

}
