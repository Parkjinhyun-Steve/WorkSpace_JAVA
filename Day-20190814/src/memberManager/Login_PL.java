package memberManager;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//
//
//  @ Project : 주소관리 프로그램
//  @ File Name : MemberModel.java
//  @ Date : 2019-08-14
//  @ Author : 박진현
//
//


public class Login_PL extends JFrame {    // PL -> 프리젠테이션 레이아웃
	
	JLabel l_driver;
	Choice ch_driver;
	JPanel label_panel;
	JPanel select_panel;
	
	public Login_PL() {    // 생성자 객체 생성
		// 레이블
		l_driver=new JLabel("Driver");
		
		//컴포넌트
		ch_driver=new Choice();
		ch_driver.add("접속할 데이터베이스를 선택해 주세요");
		ch_driver.add("MySql");
		ch_driver.add("Oracle");
		
		// 패널작성
		label_panel=new JPanel();
		select_panel=new JPanel();
		
		label_panel.setPreferredSize(new Dimension(100,200));
		select_panel.setPreferredSize(new Dimension(300,200));
		
		label_panel.setLayout(new GridLayout(6,1,10,10));
		select_panel.setLayout(new GridLayout(6,1,10,10));
		
		label_panel.add(l_driver);

		select_panel.add(ch_driver);
		
		// 프레임 셋
		add(label_panel, BorderLayout.WEST);
		add(label_panel, BorderLayout.CENTER);
		
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
}
