package test2;

public class Test28_test {

	public static void main(String[] args) {
		Test28 ob = new Test28();
	//  Ŭ������  ��ü�� = new �����ڸ�
		
		double area = ob.getArea();
		double hypotenuse = ob.getHypotenuse();
		double perimeter = ob.getPerimeter();
		
		
		System.out.printf("�ﰢ���� ���� : %.2f\n", ob.getArea());
		System.out.printf("�������� : %.2f\n", ob.getHypotenuse());
		System.out.printf("�ѷ����� : %.2f\n", ob.getPerimeter());
		

	}

}