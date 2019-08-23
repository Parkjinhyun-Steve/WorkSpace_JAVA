package kr.co.student;

public class CustomerTest {

	public static void main(String[] args) {
		Customer cus=new Customer("진현","박",37);
		cus.Address="경기도 수원시 장안구";
		cus.Description="설명";
		
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
