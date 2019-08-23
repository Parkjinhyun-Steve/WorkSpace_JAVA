package p350;

import java.util.concurrent.ExecutorService;  //thread pool 제공 라이브러리
import java.util.concurrent.Executors;  //라이브러리

public class CallBackSample {

	public static void main(String[] args) {
		final ExecutorService executor=Executors.newSingleThreadExecutor();
		AsyncProcess proc=new AsyncProcess(new AsyncCallback() {
			public void notify(String message) {
				System.out.println("callback message :" + message);
				executor.shutdown();
			}
					
		});
		executor.execute(proc);
		System.out.println("비동기 시작!!!!");
		
	}

}
