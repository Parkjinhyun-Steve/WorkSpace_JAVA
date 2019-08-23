// C:\DEV\WorkSpace_JAVA\DAY-20190808-first\bin>java -cp ./ net1.TCPEchoServer 9000
// 수신한 메시지: HelloJava

// 1. 프로세스 : 실행중이거나 실행할수 있는 PCB // 프로세스는 자원을 독점한다. (자원: CPU, 메모리등)
// 2. PCB(컨트롤블록) : 프로그램, 쓰레드, 작업우선순위 등을 가지고 있는 명세서 등
// 3. 쓰레드 : 명령어를 처리하는 작업 단위  // 쓰레드는 자원을 공유한다. (자원: CPU, 메모리등)
// 4. 자원공유의 목적 : 한정된 자원을 효율적으로 사용하기 위해서
 

package net1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class TCPEchoServer {
	private ServerSocket server=null;
	
	public TCPEchoServer(int port) {		
		//1. 소켓객체 생성
			
		try {
			server=new ServerSocket(port);
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	
	public void process() {  // 프로세스를 만들어야 된다.
		while(true) {        // 무한반복

			//2. 요청 대기
			try {
				Socket con = server.accept();

				//3. 수신
				//3-1. 스트림 객체 생성
				BufferedInputStream bis=null;
				BufferedOutputStream bos=null;
				bis=new BufferedInputStream(con.getInputStream());
				bos=new BufferedOutputStream(con.getOutputStream());
				
				byte buf[]=new byte[256];
				int len=0;
				String str="";  // "" -> null 과 같다.
				
				
				//3-2. 읽기
				while((len=bis.read(buf,0,buf.length)) !=-1) {
					str=str+new String(buf,0,len);				
				
					//3-3. 디스플레이
					bos.write(buf,0,len);
					bos.flush();
					
					if(str.indexOf("\n") !=-1);
						break;				
				}
				
				System.out.println("수신한 메시지: " + str);	

				//4. 종료
				bos.close();
				bis.close();
				con.close();
				
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
		
	
	public static void main(String[] args) {		
		//유효성 처리(Validation) -> fool proof 처리   // 예외처리 -> 프로그램 오류처리
		if(args.length !=1) {
			System.out.println("파라미터: <포트번호>");
			System.exit(0);
		}
	
		int port=Integer.parseInt(args[0]);  // 랩퍼 처리
		
		TCPEchoServer server=new TCPEchoServer(port);
		
		server.process();

	}
}