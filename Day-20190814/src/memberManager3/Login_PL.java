package memberManager3;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//
//
//  @ Project : �ּҰ��� ���α׷�
//  @ File Name : MemberModel.java
//  @ Date : 2019-08-14
//  @ Author : ������
//
//

public class Login_PL extends JFrame implements ActionListener, ItemListener {    // PL -> ���������̼� ���̾ƿ�
	
	JLabel l_driver,l_ip, l_port, l_db, l_id, l_passwd;
	Choice ch_driver;
	JTextField txt_ip, txt_port, txt_db, txt_id, txt_passwd;
	JButton bt_login, bt_cancel;
	JPanel label_panel, select_panel, button_panel;
	String url, driver, id, passwd;
	Connection con;
	
	
	public Login_PL() {    // ������ ��ü ����
		// ���̺�
		l_driver=new JLabel("Driver");
		l_ip=new JLabel("IP");
		l_port=new JLabel("Port");
		l_db=new JLabel("DataBase");
		l_id=new JLabel("ID");
		l_passwd=new JLabel("PassWord");
		
		
		//������Ʈ
		ch_driver=new Choice();
		ch_driver.add("������ �����ͺ��̽��� ������ �ּ���");
		ch_driver.add("MySql");
		ch_driver.add("Oracle");
		
		txt_ip=new JTextField(30);
		txt_port=new JTextField(30);
		txt_db=new JTextField(30);
		txt_id=new JTextField(30);
		txt_passwd=new JTextField(30);
		
		bt_login=new JButton("����");
		bt_cancel=new JButton("���");
								
		
		// �г��ۼ�
		label_panel=new JPanel();
		select_panel=new JPanel();
		button_panel=new JPanel();
		
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
		
		// ������ ��
		add(label_panel, BorderLayout.WEST);		
		add(select_panel, BorderLayout.CENTER);
		add(button_panel, BorderLayout.SOUTH);
		
		// �̺�Ʈ ������ ó��
		bt_login.addActionListener(this);
		bt_cancel.addActionListener(this);
		ch_driver.addItemListener(this);
						
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

	@Override
	public void itemStateChanged(ItemEvent e) {
		getDBMStype(ch_driver.getSelectedIndex(),null,null,null,null,null);
		
	}

	private HashMap<String, String> getDBMStype(int index, String ip, String port, String dbname, String id,
			String pass) {
		HashMap<String, String> map=new HashMap<String, String>();
		
		//�ƹ��͵� �������� �ʾ��� ��
		if(index==0) {
			map.put("driver","");
			map.put("ip",ip=(ip==null)?"":ip);
			map.put("port",port=(port==null)?"":port);
			map.put("dbname",dbname=(dbname==null)?"":dbname);
			map.put("id",id=(id==null)?"":id);
			map.put("pass",pass=(pass==null)?"":pass);
			url="";
		}	

		//MySql�� �������� ��
		
		if(index==1) {
			map.put("driver","com.mysql.jdbc.Driver");
			map.put("ip",ip=(ip==null)?"127.0.0.1":ip);
			map.put("port",port=(port==null)?"3306":port);
			map.put("dbname",dbname=(dbname==null)?"db_money?serverTimezone=UTC":dbname);
			map.put("id",id=(id==null)?"root":id);
			map.put("pass",pass=(pass==null)?"1234":pass);
			url="jdbc:mysql:"+"//"+ip+":"+port+"/"+dbname;					
		}
					
		//Oracle�� �������� ��
		if(index==2) {
		map.put("driver","oracle.jdbc.driver.OracleDriver");
		map.put("ip",ip=(ip==null)?"127.0.0.1":ip);
		map.put("port",port=(port==null)?"1521":port);
		map.put("dbname",dbname=(dbname==null)?"xe":dbname);
		map.put("id",id=(id==null)?"scott":id);
		map.put("pass",pass=(pass==null)?"tiger":pass);
		url="jdbc:oracle:thin"+"@"+ip+":"+port+":"+dbname;
		}
		
		driver=map.get("driver");
		
		txt_ip.setText(ip);
		txt_port.setText(port);
		txt_db.setText(dbname);
		txt_id.setText(id);
		txt_passwd.setText(pass);
		
		return map;
	}
	
	private String connect() {
		id=txt_id.getText();
		passwd=txt_passwd.getText();
		
	
		try {
			Class.forName(driver);
			System.out.println(driver);
			//���ӽõ�
			con=DriverManager.getConnection(url,id,passwd);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return driver;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		
		// �α���
		if(obj.equals(bt_login)) {
			if(connect().equals("com.mysql.jdbc.Driver")) {
							
			}
			if(connect().equals("oracle.jdbc.driver.OracleDriver")) {
				
			}
											
		}
		
		// ���
		if(obj.equals(bt_cancel)) {	

		}
	}
	
}