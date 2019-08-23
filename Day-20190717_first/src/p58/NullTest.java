package p58;

public class NullTest {

	public static void main(String[] args) {
		String nullstr=null;  // 좋은 코딩
		int Number=0;
		
		//String nullstr;  // 나쁜 코딩
		//nullstr=null;  //  나쁜 코딩
		
		
		if(nullstr!=null) {
			System.out.println(nullstr.length());
			
		}else {
			System.out.println("nullstr은 null이다.");
		}

	}

}
