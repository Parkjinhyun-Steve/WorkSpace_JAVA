package memberManager2;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//
//
//  @ Project : 주소관리 프로그램
//  @ File Name : MemberModel.java
//  @ Date : 2019-08-14
//  @ Author : 박진현
//
//

public class Login_PL extends JFrame implements ActionListener, ItemListener {    // PL -> 프리젠테이션 레이아웃
	
	JLabel l_driver,l_ip, l_port, l_db, l_id, l_passwd;
	Choice ch_driver;
	JTextField txt_ip, txt_port, txt_db, txt_id, txt_passwd;
	JButton bt_login, bt_cancel;
	JPanel label_panel, select_panel, button_panel;
	
	public Login_PL() {    // 생성자 객체 생성
		// 레이블
		l_driver=new JLabel("Driver");
		l_ip=new JLabel("IP");
		l_port=new JLabel("Port");
		l_db=new JLabel("DataBase");
		l_id=new JLabel("ID");
		l_passwd=new JLabel("PassWord");
		
		
		//컴포넌트
		ch_driver=new Choice();
		ch_driver.add("접속할 데이터베이스를 선택해 주세요");
		ch_driver.add("MySql");
		ch_driver.add("Oracle");
		
		txt_ip=new JTextField(30);
		txt_port=new JTextField(30);
		txt_db=new JTextField(30);
		txt_id=new JTextField(30);
		txt_passwd=new JTextField(30);
		
		bt_login=new JButton("연결");
		bt_cancel=new JButton("취소");
				
		
		
		// 패널작성
		label_panel=new JPanel();
		select_panel=new JPanel();
		
		label_panel.setPreferredSize(new Dimension(100,200));
		select_panel.setPreferredSize(new Dimension(300,200));
		button_panel.setPreferredSize(new Dimension(400,50));
		
		
		label_panel.setLayout(new GridLayout(6,1,10,10));
		select_panel.setLayout(new GridLayout(6,1,10,10));
		
		label_panel.add(l_driver);
		label_panel.add(l_ip);
		label_panel.add(l_port);
		label_panel.add(l_db);
		label_panel.add(l_id);
		label_panel.add(l_passwd);
		
		select_panel.add(ch_driver);
		select_panel.add(txt_ip);
		select_panel.add(txt_port);
		select_panel.add(txt_db);
		select_panel.add(txt_id);
		select_panel.add(txt_passwd);
		
		button_panel.add(bt_login);
		button_panel.add(bt_cancel);
		
		// 프레임 셋
		add(label_panel, BorderLayout.WEST);		
		add(select_panel, BorderLayout.CENTER);
		add(button_panel, BorderLayout.SOUTH);
		
		// 이벤트 리스터 처리
		bt_login.addActionListener(this);
		bt_cancel.addActionListener(this);
		ch_driver.addItemListener(this);
		
				
		//  종료  -- 암기
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		pack();
		
		// 화면에 프리젠테이션  -- 암기
		this.setLocation(((this.getToolkit().getScreenSize()).width-this.getWidth())/2,
				((this.getToolkit().getScreenSize()).height-this.getHeight())/2
				);
		
		setVisible(true);
		
	}
	
	// 엔트리 함수
	public static void main(String[] args) {
		new Login_PL();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
