package array;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		int input;
		int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���ϴ� �� : "); input = scan.nextInt();		
		
		System.out.println(input + "���� " + month[input-1] + "�� �Դϴ�.");		
		
		

	}

}
