package kr.co.informationhiding;

public class CustomerTest {

	public static void main(String[] args) {
		Customer cus=new Customer();// 비권장
		cus.setLastName("박");
		cus.setFirstName("진현");
		cus.setAge(37);     // 권장사항 -> 객체지향 프로그래밍은 이렇게 쓴다.. 왜?? 정보은닉 때문에 (information hiding)	
		cus.setAddress("경기도 수원시 장안구");    // 비권장
		cus.setDescription("설명");    // 비권장
		
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
