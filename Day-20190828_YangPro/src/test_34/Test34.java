package test_34;

public class Test34 extends Salary {   // Salary Ŭ������ ��� 
	String department;  // �ʵ� ����
	
	Test34(String name, int salary, String department){  // ������ �޼ҵ�
		super.name=name;
		super.salary=salary;
		this.department=department;
	}
		
		void getInformation2() {   // �޼ҵ�
			super.getInformation1();		
			System.out.println("�μ� : " + department);
		
	}	
}
