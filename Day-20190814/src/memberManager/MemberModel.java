package memberManager;

import java.util.Vector;

//
//
//  @ Project : 주소관리 프로그램
//  @ File Name : MemberModel.java
//  @ Date : 2019-08-14
//  @ Author : 박진현
//
//

public class MemberModel {
	
	Vector column=new Vector();  //list -> Vector list 동기에 대한 처리  //array list 비동기에 대한 처리
	Vector list=new Vector();    //        동기는 하나가 끝나야 다음 처리.  // 비동기는 하나가 끝나기 전에 다음 처리.
							     //        트랜잭션 처리필요(커밋, 롤백) -> 데드락을 처리하기 위해 -> 동기화를 처리하지 못해서
	public MemberModel() {
		column.add("이름");
		column.add("나이");
		column.add("성별");
		column.add("주소");
		column.add("연락처");
		column.add("이메일");
	}
	
	// 컬럼명을 입력
	public String getColumnName(int index) {
		return String.valueOf(column.get(index));
	}
		
	public void setList(Vector list) {
		this.list=list;		
	}
	
	// 조회
	public int getColumn() {
		return column.size();
	}
	
	public int getRowCount() {
		return list.size();		
	}
		
	public Object getValueAt(int row, int col) {
		Vector vec=(Vector)list.get(row);
		return vec.get(col);
			
	}
	
}
