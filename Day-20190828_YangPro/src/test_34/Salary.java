package test_34;

public class Salary {	
	String name;
	int salary;
	
	Salary(){
		
	}
	
	Salary(String n, int s){  // ������ �޼ҵ�� ���� Ÿ���� ����.
		name=n;  	// �ʱ�ȭ
		salary=s;	// �ʱ�ȭ
	}	
		
	void getInformation1() {  // �Ϲ� �޼ҵ�� ���� Ÿ���� �־�� �Ѵ�.
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + salary);
		
	}

}
