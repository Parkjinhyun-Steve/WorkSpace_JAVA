package test_38;

public class Test38 extends Health {  // ��� ����
	double s_weight; // �ʵ� ����
	double fat;
	String result;
	
	Test38(){  // ������ �޼��� ����
		s_weight=0.0; // ǥ��ü�� �ʱ�ȭ
		fat=0.0;  // �񸸵�
		result=null;  // ���
	}
	
	void calculate(){  // ������ �޼��� ����  // ��ȯ�� ����
		
		double value;
		if(super.gender.equalsIgnoreCase("M"))   // if �Լ� �̿� //superŰ  ���. gender �ʵ�
			value=0.9;
		else
			value=0.85;
		
		// ǥ��ü��
		s_weight=(super.tall-100) * value;	   
		
		// �񸸵�
		fat = (super.weight/s_weight) * 100;  
		
		// ���
		if(fat <= 90)
			result="��ü��";		
		else if (fat <= 110)
			result="����(ǥ��ü��)";
		else if (fat <= 120)
			result="��ü��";
		else if (fat <= 130)
			result="�浵��";
		else if (fat <= 130)
			result="�ߵ���";
		else
			result="����";	
		
	}
	
	void output2(){ // ������ �޼��� ����  // ��ȯ�� ����
		System.out.println("����� �񸸵��� " + fat + ", " + result + "�Դϴ�." );
		
	}
	

}
