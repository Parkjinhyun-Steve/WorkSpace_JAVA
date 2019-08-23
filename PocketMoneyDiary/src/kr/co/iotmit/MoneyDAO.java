package kr.co.iotmit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MoneyDAO {
	Connection conn=null;  // Ŀ�ؼ��� ������ ����!!
	
	MoneyDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // ����̹� �ε�
			System.out.println("����̹� �ε� ����!!!");
			
			// Ŀ�ؼ� ��ü ����  // ������ �ȿ��� Ŀ�ؼ� ���� -> �������� �� ��� �Ѵ�!!
			conn = DriverManager.getConnection("jdbc:mysql://192.168.0.178/db_money?serverTimezone=UTC","iot2","1234");
			System.out.println("DB ���� ���� !!!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB ���� ���� !!!");
		}
	}
	
	// 1. ��ü ���� �ľ�
	int Count() {      // Count ���� ����
		int count = -1;
		try {
			PreparedStatement stmt=conn.prepareStatement("SELECT count(*) FROM moneydiary");
			ResultSet result=stmt.executeQuery();
			result.next();
			count=result.getInt(1);		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB ���� ����");			
		}
		return count;
	}
	
	// 2. ����, ���� ����
	void Insert(MoneyDTO moneyDTO) {
		try {	
			PreparedStatement stmt
			= conn.prepareStatement("insert into moneydiary(date,category,particulars,money) values(?,?,?,?)");
			stmt.setString(1, moneyDTO.getDate());
			stmt.setString(2, moneyDTO.getCategory());
			stmt.setString(3, moneyDTO.getParticulars());
			stmt.setInt(4, moneyDTO.getMoney());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB �߰� ����");
		}
	}
	

	// 3. list ����
	ArrayList<MoneyDTO> List(int count, int pagecount) {
		ArrayList<MoneyDTO> arryDTO = new ArrayList<>();
		ResultSet result=null;
		try {
			PreparedStatement stmt
			= conn.prepareStatement("SELECT * FROM moneydiary ORDER BY date Limit ?,?");
			stmt.setInt(1, count-pagecount);		
			stmt.setInt(2, pagecount);
			result = stmt.executeQuery();
			result.next();			
			
			while(result.next()) {
				MoneyDTO moneyDTO = new MoneyDTO();
				moneyDTO.setNo(result.getInt("no"));
				moneyDTO.setDate(result.getString("date"));
				moneyDTO.setCategory(result.getString("category"));
				moneyDTO.setParticulars(result.getString("particulars"));
				moneyDTO.setMoney(result.getInt("money"));
				arryDTO.add(moneyDTO);
			}		
				
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("����Ʈ �������� ����");
		}
		return arryDTO;
	}
	
	//3.��ü���� ���ϱ�
	int TotalReceived() {
		int count=-1;
		try	{
			PreparedStatement stml=conn.prepareStatement("select sum(money) from moneydiary where money > 0");
			ResultSet result= stml.executeQuery();
			result.next();
			count=result.getInt(1);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB ���� ����");
		}
		return count;
	}
	//4.��ü���� ���ϱ�
	int TotalPaid() {
		int count=-1;
		try	{
			PreparedStatement stml=conn.prepareStatement("select sum(money) from moneydiary where money < 0");
			ResultSet result= stml.executeQuery();
			result.next();
			count=result.getInt(1);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB ���� ����");
		}
		return count;
	}
	//5.���� �ܾױ��ϱ�
	int Balance() {
		int count=-1;
		try	{
			PreparedStatement stml=conn.prepareStatement("select sum(money) from moneydiary ");
			ResultSet result= stml.executeQuery();
			result.next();
			count=result.getInt(1);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB ���� ����");
		}
		return count;
	}
	//6.�� ����
	void Delete(int row) {
		try	{
			PreparedStatement stmt=conn.prepareStatement("DELETE FROM moneydiary WHERE no = ?");
			stmt.setInt(1, row);	
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB ���� ����");
			
		}
	}
}

			
			