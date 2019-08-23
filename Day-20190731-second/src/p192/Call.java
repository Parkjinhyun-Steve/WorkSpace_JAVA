package p192;

public class Call {
	/*public void caller() {
		try {
			callee();
			
		}catch (Exception ex) {
			ex.printStackTrace();
			
		}
	}*/
	
	public void callee() throws Exception {  // 함수를 만드는 곳에서 예외처리 작성보다 throws로 던진다. 
		String str = "";
		
		System.out.println("str.length=" + str.length());
		
	}

}