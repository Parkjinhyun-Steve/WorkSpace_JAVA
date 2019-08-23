package p192;

class CallTest {

	public static void main(String[] args) {
		Call call=new Call();
		
		// call.callee();
		
		try{  // try catch로 여기서 예외처리를 여기서 한다.
			call.callee();			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
