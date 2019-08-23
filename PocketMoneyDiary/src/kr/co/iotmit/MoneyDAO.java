package kr.co.iotmit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MoneyDAO {
	Connection conn=null;  // 커넥션을 밖으로 빼줌!!
	
	MoneyDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // 드라이버 로드
			System.out.println("드라이버 로드 성공!!!");
			
			// 커넥션 객체 생성  // 생성자 안에서 커넥션 생성 -> 전역으로 빼 줘야 한다!!
			conn = DriverManager.getConnection("jdbc:mysql://192.168.0.178/db_money?serverTimezone=UTC","iot2","1234");
			System.out.println("DB 접속 성공 !!!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB 접속 실패 !!!");
		}
	}
	
	// 1. 전체 개수 파악
	int Count() {      // Count 변수 선언
		int count = -1;
		try {
			PreparedStatement stmt=conn.prepareStatement("SELECT count(*) FROM moneydiary");
			ResultSet result=stmt.executeQuery();
			result.next();
			count=result.getInt(1);		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB 실행 실패");			
		}
		return count;
	}
	
	// 2. 수입, 지출 삽입
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
			System.out.println("DB 추가 실패");
		}
	}
	

	// 3. list 보기
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
			System.out.println("리스트 가져오기 실패");
		}
		return arryDTO;
	}
	
	//3.전체수입 구하기
	int TotalReceived() {
		int count=-1;
		try	{
			PreparedStatement stml=conn.prepareStatement("select sum(money) from moneydiary where money > 0");
			ResultSet result= stml.executeQuery();
			result.next();
			count=result.getInt(1);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB 실행 실패");
		}
		return count;
	}
	//4.전체지출 구하기
	int TotalPaid() {
		int count=-1;
		try	{
			PreparedStatement stml=conn.prepareStatement("select sum(money) from moneydiary where money < 0");
			ResultSet result= stml.executeQuery();
			result.next();
			count=result.getInt(1);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB 실행 실패");
		}
		return count;
	}
	//5.현재 잔액구하기
	int Balance() {
		int count=-1;
		try	{
			PreparedStatement stml=conn.prepareStatement("select sum(money) from moneydiary ");
			ResultSet result= stml.executeQuery();
			result.next();
			count=result.getInt(1);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB 실행 실패");
		}
		return count;
	}
	//6.행 삭제
	void Delete(int row) {
		try	{
			PreparedStatement stmt=conn.prepareStatement("DELETE FROM moneydiary WHERE no = ?");
			stmt.setInt(1, row);	
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB 삭제 실패");
			
		}
	}
}

			
			