package test_38_JH;

public class Test38 extends Health {  // Health ���
	// �ʵ� ����
	
	double s_weight;  // ǥ��ü��
	double fat;
	String result;
	
	String grade = null;  // �ʱ�ȭ
			
	
	void calculate() {  // �޼ҵ� ����
								
		// ���� ǥ�� ü��
		s_weight = 0.0; // �ʱ�ȭ
		switch(gender)
		{
			case "M" :
				fat = (tall-100)*0.9;
				System.out.println(s_weight); break;
				
			case "F" :
				fat = (tall-100)*0.85;
				System.out.println(s_weight); break;
			
			default : System.out.println("�ٺ�");			
		}
		
		// �񸸵�
		fat = 0.0;  // �ʱ�ȭ

		
		// ���
		result = null;  // �ʱ�ȭ		
						
		if (fat <= 0.9)
			result = "��ü��";
		else if (fat <= 1.1)
			result = "����(ǥ��ü��)";
		else if (fat <= 1.2)
			result = "��ü��";
		else if (fat <= 1.3)
			result = "�浵��";
		else if (fat <= 1.5)
			result = "�ߵ���";
		else
			result = "����";
		
	}
				

		
}
	

