package test_34;

public class Salary {	
	String name;
	int salary;
	
	Salary(){
		
	}
	
	Salary(String n, int s){  // 생성자 메소드는 리턴 타입이 없다.
		name=n;  	// 초기화
		salary=s;	// 초기화
	}	
		
	void getInformation1() {  // 일반 메소드라 리턴 타입이 있어야 한다.
		System.out.println("이름 : " + name);
		System.out.println("연봉 : " + salary);
		
	}

}
