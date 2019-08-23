package JText;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JTextTest {
	
	JLabel lbl,la1,la2,la3;
	JTextField id;
	JPasswordField passwd;
	JPanel idPanel,paPnel,loginPanel;
	JButton b1,b2;
	JTextArea content;
	
	public JTextTest() {	
		super("JText 테스트");
		setLayout(new FlowLayout());
		EtcheBorder eborder = new EtcheBorder();
		lbl = new JLabel( "아이디와 패스워드를 입력해 주세요");
		lbl.setBorder(eborder);
		add (lbl);
		idPanel = new JPnel();
		paPanel = new JPnel();
		la3 = new JLabel("아이디");
		la2 = new JLabel("패스워드");
		id = new JTextField(10);
		passwd = new JPasswordField(10);
		idPanel.add(la3);
		idPanel.add(id);
		idPanel.add( la2 );
		paPanel.add( passwd );
		
		loginPanel = new JPnel();
		b1 = new JButton("로그인");
		b2 = new JButton("회원가입");
		log
		
		
		
		
	
		
		
	
}

	
	
	
	

	
	
	
	
	
}

