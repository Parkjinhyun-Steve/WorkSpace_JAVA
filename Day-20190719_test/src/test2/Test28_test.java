package test2;

public class Test28_test {

	public static void main(String[] args) {
		Test28 ob = new Test28();
	//  클래스명  객체명 = new 생성자명
		
		double area = ob.getArea();
		double hypotenuse = ob.getHypotenuse();
		double perimeter = ob.getPerimeter();
		
		
		System.out.printf("삼각형의 넓이 : %.2f\n", ob.getArea());
		System.out.printf("빗변길이 : %.2f\n", ob.getHypotenuse());
		System.out.printf("둘레길이 : %.2f\n", ob.getPerimeter());
		

	}

}