package memberManager;

import java.util.Vector;

//
//
//  @ Project : �ּҰ��� ���α׷�
//  @ File Name : MemberModel.java
//  @ Date : 2019-08-14
//  @ Author : ������
//
//

public class MemberModel {
	
	Vector column=new Vector();  //list -> Vector list ���⿡ ���� ó��  //array list �񵿱⿡ ���� ó��
	Vector list=new Vector();    //        ����� �ϳ��� ������ ���� ó��.  // �񵿱�� �ϳ��� ������ ���� ���� ó��.
							     //        Ʈ����� ó���ʿ�(Ŀ��, �ѹ�) -> ������� ó���ϱ� ���� -> ����ȭ�� ó������ ���ؼ�
	public MemberModel() {
		column.add("�̸�");
		column.add("����");
		column.add("����");
		column.add("�ּ�");
		column.add("����ó");
		column.add("�̸���");
	}
	
	// �÷����� �Է�
	public String getColumnName(int index) {
		return String.valueOf(column.get(index));
	}
		
	public void setList(Vector list) {
		this.list=list;		
	}
	
	// ��ȸ
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
