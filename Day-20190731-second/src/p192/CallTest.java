package p192;

class CallTest {

	public static void main(String[] args) {
		Call call=new Call();
		
		// call.callee();
		
		try{  // try catch�� ���⼭ ����ó���� ���⼭ �Ѵ�.
			call.callee();			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
