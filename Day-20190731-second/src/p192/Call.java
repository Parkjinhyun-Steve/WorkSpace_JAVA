package p192;

public class Call {
	/*public void caller() {
		try {
			callee();
			
		}catch (Exception ex) {
			ex.printStackTrace();
			
		}
	}*/
	
	public void callee() throws Exception {  // �Լ��� ����� ������ ����ó�� �ۼ����� throws�� ������. 
		String str = "";
		
		System.out.println("str.length=" + str.length());
		
	}

}