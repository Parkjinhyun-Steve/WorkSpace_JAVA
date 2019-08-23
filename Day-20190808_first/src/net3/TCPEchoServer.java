// C:\DEV\WorkSpace_JAVA\DAY-20190808-first\bin>java -cp ./ net1.TCPEchoServer 9000
// ������ �޽���: HelloJava

// 1. ���μ��� : �������̰ų� �����Ҽ� �ִ� PCB // ���μ����� �ڿ��� �����Ѵ�. (�ڿ�: CPU, �޸𸮵�)
// 2. PCB(��Ʈ�Ѻ��) : ���α׷�, ������, �۾��켱���� ���� ������ �ִ� ���� ��
// 3. ������ : ��ɾ ó���ϴ� �۾� ����  // ������� �ڿ��� �����Ѵ�. (�ڿ�: CPU, �޸𸮵�)
// 4. �ڿ������� ���� : ������ �ڿ��� ȿ�������� ����ϱ� ���ؼ�
 

package net3;

import java.io.IOException;
import java.net.ServerSocket;

public class TCPEchoServer {
	
	public static void main(String[] args) {		
		//��ȿ�� ó��(Validation) -> fool proof ó��   // ����ó�� -> ���α׷� ����ó��

		if(args.length !=1) {
			System.out.println("�Ķ����: <��Ʈ��ȣ>");
			System.exit(0);
		}
	
		int port=Integer.parseInt(args[0]);  // ���� ó��
		
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