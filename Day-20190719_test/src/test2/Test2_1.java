package test2;

public class Test2_1 {

	public static void main(String[] args) {
		// 1부터 1000까지 홀수만 더해서 결과값 출력
		int sum=0;
		
		for (int i = 1; i<1001; i++) {
			if(i%2==1) {
				sum+=i;
			}
		}
		System.out.println(sum);

	}

}
