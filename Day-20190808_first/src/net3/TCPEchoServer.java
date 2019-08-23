// C:\DEV\WorkSpace_JAVA\DAY-20190808-first\bin>java -cp ./ net1.TCPEchoServer 9000
// 수신한 메시지: HelloJava

// 1. 프로세스 : 실행중이거나 실행할수 있는 PCB // 프로세스는 자원을 독점한다. (자원: CPU, 메모리등)
// 2. PCB(컨트롤블록) : 프로그램, 쓰레드, 작업우선순위 등을 가지고 있는 명세서 등
// 3. 쓰레드 : 명령어를 처리하는 작업 단위  // 쓰레드는 자원을 공유한다. (자원: CPU, 메모리등)
// 4. 자원공유의 목적 : 한정된 자원을 효율적으로 사용하기 위해서
 

package net3;

import java.io.IOException;
import java.net.ServerSocket;

public class TCPEchoServer {
	
	public static void main(String[] args) {		
		//유효성 처리(Validation) -> fool proof 처리   // 예외처리 -> 프로그램 오류처리

		if(args.length !=1) {
			System.out.println("파라미터: <포트번호>");
			System.exit(0);
		}
	
		int port=Integer.parseInt(args[0]);  // 랩퍼 처리
		
		ServerSocket server=null;

		try {
			server=new ServerSocket(port);
			
			PoolDispatcher tPool=new PoolDispatcher();
			tPool.startDispatching(server);						
			
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}	

	}

}