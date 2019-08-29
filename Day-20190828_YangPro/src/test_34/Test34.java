package test_34;

public class Test34 extends Salary {   // Salary 클래스를 상속 
	String department;  // 필드 생성
	
	Test34(String name, int salary, String department){  // 생성자 메소드
		super.name=name;
		super.salary=salary;
		this.department=department;
	}
		
		void getInformation2() {   // 메소드
			super.getInformation1();		
			System.out.println("부서 : " + department);
		
	}	
}
