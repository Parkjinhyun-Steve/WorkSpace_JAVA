package p330;

public class AddThread extends Thread {
	
	String username=null;
	int target=0;
	
	public AddThread(String username, int target) { // 생성자 함수
		this.username=username;
		this.target=target;			
	}

	public void run() { // 생성자 함수
		for(int i=0; i<100; i++) {
			try {
				System.out.println(username+ "진행상황 : " + target);
				Thread.sleep(0);
				target++;				
			}catch(InterruptedException e) {
			e.printStackTrace();
			}				
		
		}
	
	System.out.println(username+ "이(가) 요청한 결과 : " + target);	
	
	}
		
}
