
public class PersonMain {
	
	public static void main(String[] args) {
		Person p1=new Person("ȫ�浿",30,"��⵵ ������ �Ǽ���");
		p1.Fphone="010-000-0000";
		
		String txtname=p1.Fname;   // F = field ����
		int txtage=p1.Fage;
		String txtaddress=p1.Faddress;
		String txtphone=p1.Fphone;
		
		
		//System.out.println(p1.Fphone);  // ���� �ڵ�	
		System.out.println(txtname);
		System.out.println(txtage);
		System.out.println(txtaddress);
		System.out.println(txtphone);
	}
}