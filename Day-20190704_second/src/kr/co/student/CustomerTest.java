package kr.co.student;

public class CustomerTest {

	public static void main(String[] args) {
		Customer cus=new Customer("����","��",37);
		cus.Address="��⵵ ������ ��ȱ�";
		cus.Description="����";
		
		String CusFirstName=cus.FirstName;
		String CusLastName=cus.LastName;
		int CusAge=cus.Age;
		String CusAddress=cus.Address;
		String CusDescription=cus.Description;
		
		System.out.println("CusfirstName"+CusFirstName);
		System.out.println("CusLastName"+CusLastName);
		System.out.println("CusAge"+CusAge);
		System.out.println("CusAddress"+CusAddress);
		System.out.println("CusDesciptin:"+CusDescription);
				

	}

}
