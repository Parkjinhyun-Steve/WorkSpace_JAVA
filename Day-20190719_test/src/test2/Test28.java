package test2;

public class Test28 {
	private double base = 5;  // 필드
	private double height = 3.5; // 필드명
	
	public double getArea() {   // 메서드 생성
		return base * height /2;  
	}
	
	public double getHypotenuse() {  // 메서드 생성
		return Math.sqrt(base * base + height * height);	// 객체를 생성 하지 않고 사용  Math.sqrt	 
	}
	
	public double getPerimeter() {  // 메서드 생성
		return base + height + getHypotenuse();
	}

}

