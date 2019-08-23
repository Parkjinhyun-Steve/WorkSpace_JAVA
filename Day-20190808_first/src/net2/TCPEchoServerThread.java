// C:\DEV\WorkSpace_JAVA\DAY-20190808-first\bin>java -cp ./ net1.TCPEchoServer 9000
// ������ �޽���: HelloJava

// 1. ���μ��� : �������̰ų� �����Ҽ� �ִ� PCB // ���μ����� �ڿ��� �����Ѵ�. (�ڿ�: CPU, �޸𸮵�)
// 2. PCB(��Ʈ�Ѻ���) : ���α׷�, ������, �۾��켱���� ���� ������ �ִ� ������ ��
// 3. ������ : ���ɾ ó���ϴ� �۾� ����  // ������� �ڿ��� �����Ѵ�. (�ڿ�: CPU, �޸𸮵�)
// 4. �ڿ������� ���� : ������ �ڿ��� ȿ�������� ����ϱ� ���ؼ�
 

package net2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TCPEchoServerThread implements Runnable {

	private Socket con=null;
	private	BufferedInputStream bis=null;
	private BufferedOutputStream bos=null;
	
	public TCPEchoServerThread(Socket con) {		//1. ���ϰ�ü ����
					
		con=con;  // ������ �Լ�
	}

	@Override
	public void run() {

			//2. ��û ���
			try {
					
				//3. ����
				//3-1. ��Ʈ�� ��ü ����
				bis=new BufferedInputStream(con.getInputStream());
				bos=new BufferedOutputStream(con.getOutputStream());
				
				byte buf[]=new byte[256];
				int len=0;
				String str="";  // "" -> null �� ����.
				
				
				//3-2. �б�
				while((len=bis.read(buf,0,buf.length)) !=-1) {
					str=str+new String(buf,0,len);				
				
					//3-3. ���÷���
					bos.write(buf,0,len);
					bos.flush();
					
					if(str.indexOf("\n") !=-1);
						break;				
				}
				
				System.out.println("������ �޽���: " + str);	

				//4. ����
				bos.close();
				bis.close();
				con.close();
				
			}catch (IOException e) {
				e.printStackTrace();
			}

	}
}
		