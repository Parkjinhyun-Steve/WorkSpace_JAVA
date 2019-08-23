package test2;

import java.util.Scanner;

public class Test2_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 65430원을 만들기 위한 화폐의 갯수를 구하시오.
		
		int money=65430;
		int a, b, c, d;  		
		
		a=money/10000;  //만원의 개수
		money= money - (a*10000);
		
		b=money/1000;  //천원의 개수
		money= money - (b*1000);
		
		c=money/100;  //백원의 개수
		money= money - (c*100);
		
		d=money/10;  //십원의 개수

		// 출력
		System.out.println("만원 = " + a); 
		System.out.println("천원 = " + b);
		System.out.println("백원 = " + c);
		System.out.println("십원 = " + d);
		
				

	}

}
