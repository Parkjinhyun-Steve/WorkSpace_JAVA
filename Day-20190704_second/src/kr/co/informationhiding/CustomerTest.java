package kr.co.informationhiding;

public class CustomerTest {

	public static void main(String[] args) {
		Customer cus=new Customer();// �����
		cus.setLastName("��");
		cus.setFirstName("����");
		cus.setAge(37);     // ������� -> ��ü���� ���α׷����� �̷��� ����.. ��?? �������� ������ (information hiding)	
		cus.setAddress("��⵵ ������ ��ȱ�");    // �����
		cus.setDescription("����");    // �����
		
		String CusFirstName=cus.getFirstName();
		String CusLastName=cus.getLastName();
		int CusAge=cus.getAge();
		String CusAddress=cus.getAddress();
		String CusDescription=cus.getDescription();
		
		System.out.println("CusfirstName"+CusFirstName);
		System.out.println("CusLastName"+CusLastName);
		System.out.println("CusAge"+CusAge);
		System.out.println("CusAddress"+CusAddress);
		System.out.println("CusDesciptin:"+CusDescription);
				

	}

}
