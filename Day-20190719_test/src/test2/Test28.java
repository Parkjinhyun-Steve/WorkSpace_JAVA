package test2;

public class Test28 {
	private double base = 5;  // �ʵ�
	private double height = 3.5; // �ʵ��
	
	public double getArea() {   // �޼��� ����
		return base * height /2;  
	}
	
	public double getHypotenuse() {  // �޼��� ����
		return Math.sqrt(base * base + height * height);	// ��ü�� ���� ���� �ʰ� ���  Math.sqrt	 
	}
	
	public double getPerimeter() {  // �޼��� ����
		return base + height + getHypotenuse();
	}

}

