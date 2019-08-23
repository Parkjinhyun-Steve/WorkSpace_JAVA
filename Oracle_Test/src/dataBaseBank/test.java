package dataBaseBank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn
	= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","aaa","bbb");
			System.out.println("DB���� ����!!");			
			
		PreparedStatement stmt=null;
		ResultSet table=null;
		stmt=conn.prepareStatement("select * from MBOOK");
		table=stmt.executeQuery();
		table.next();
		
		int money=table.getInt("money");
		
		Scanner scan = new Scanner(System.in);
		for(;;) {
			System.out.println("�޴�(1.�ܾ�  2.����  3.���� 4.����)");
			int menu=scan.nextInt();
			if(menu==4) break;
			switch(menu) {
			case 1:
				stmt=conn.prepareStatement("select * from MBOOK");
				table=stmt.executeQuery();
				table.next();
				money=table.getInt("money");
				
				System.out.println("���� �ܾ���" + money + "�Դϴ�."); break;
			
			case 2:
				System.out.println("������ �Է��� �ּ���: ");
				int output_money = scan.nextInt();
				
				stmt=conn.prepareStatement(
						"update mbook set money=money-?");
				stmt.setInt(1, output_money);				
				stmt.executeUpdate();

				System.out.println("�Է��Ͻ� �ݾ���" + output_money + "�Դϴ�."); break;
				
			case 3:
				System.out.println("������ �Է��� �ּ���: ");
				int input_money = scan.nextInt();
				
				stmt=conn.prepareStatement(
						"update mbook set money=money+?");
				stmt.setInt(1, input_money);				
				stmt.executeUpdate();
				
				System.out.println("�Է��Ͻ� �ݾ���" + input_money + "�Դϴ�."); break;
			}
			
		}
		System.out.println("���� �Ǿ����ϴ�.");	

	}

}
