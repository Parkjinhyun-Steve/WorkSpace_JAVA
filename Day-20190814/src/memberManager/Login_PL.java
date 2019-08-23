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
//  @ Project : �ּҰ��� ���α׷�
//  @ File Name : MemberModel.java
//  @ Date : 2019-08-14
//  @ Author : ������
//
//


public class Login_PL extends JFrame {    // PL -> ���������̼� ���̾ƿ�
	
	JLabel l_driver;
	Choice ch_driver;
	JPanel label_panel;
	JPanel select_panel;
	
	public Login_PL() {    // ������ ��ü ����
		// ���̺�
		l_driver=new JLabel("Driver");
		
		//������Ʈ
		ch_driver=new Choice();
		ch_driver.add("������ �����ͺ��̽��� ������ �ּ���");
		ch_driver.add("MySql");
		ch_driver.add("Oracle");
		
		// �г��ۼ�
		label_panel=new JPanel();
		select_panel=new JPanel();
		
		label_panel.setPreferredSize(new Dimension(100,200));
		select_panel.setPreferredSize(new Dimension(300,200));
		
		label_panel.setLayout(new GridLayout(6,1,10,10));
		select_panel.setLayout(new GridLayout(6,1,10,10));
		
		label_panel.add(l_driver);

		select_panel.add(ch_driver);
		
		// ������ ��
		add(label_panel, BorderLayout.WEST);
		add(label_panel, BorderLayout.CENTER);
		
		//  ����  -- �ϱ�
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		pack();
		
		// ȭ�鿡 ���������̼�  -- �ϱ�
		this.setLocation(((this.getToolkit().getScreenSize()).width-this.getWidth())/2,
				((this.getToolkit().getScreenSize()).height-this.getHeight())/2
				);
		
		setVisible(true);
		
	}
	
	// ��Ʈ�� �Լ�
	public static void main(String[] args) {
		new Login_PL();
	}
}
