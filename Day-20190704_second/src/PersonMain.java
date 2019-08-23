
public class PersonMain {
	
	public static void main(String[] args) {
		Person p1=new Person("홍길동",30,"경기도 수원시 권선구");
		p1.Fphone="010-000-0000";
		
		String txtname=p1.Fname;   // F = field 변수
		int txtage=p1.Fage;
		String txtaddress=p1.Faddress;
		String txtphone=p1.Fphone;
		
		
		//System.out.println(p1.Fphone);  // 나쁜 코드	
		System.out.println(txtname);
		System.out.println(txtage);
		System.out.println(txtaddress);
		System.out.println(txtphone);
	}
}