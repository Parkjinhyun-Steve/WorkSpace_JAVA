package np4;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : NotePad
//  @ File Name : NotePad3.java
//  @ Date : 2019-08-07
//  @ Author : jinhyun Park
//
//




public class NotePad4 extends Frame implements WindowListener {
	private NoteActionListener nal=null;
	private TextArea ta=null;
	private MenuBar mb=null;
	private Menu mfile=null;
	private String filename="������";
	
	private FileDialog fd=null;
	
	

	
	public NotePad4() {
		fd=new FileDialog(this);
		nal=new NoteActionListener(this, fd);
		
		ta=new TextArea();
		add(ta,BorderLayout.CENTER);
				
		mb=new MenuBar();
		mfile=new Menu("����");
		itemAdd("������",mfile);
		itemAdd("����",mfile);
		itemAdd("����",mfile);
		itemAdd("����",mfile);
		
		
		mb.add(mfile);
		
		setMenuBar(mb);
		
		setTitle(filename);
		addWindowListener(this);
		
	}
	
	public void itemAdd(String title, Menu m) {
		MenuItem mi=new MenuItem(title);
		mi.addActionListener(nal);
		m.add(mi);
		
	
	}
	
	public void windowsClosing(WindowEvent we) {
		dispose();
		System.exit(0);	
	}
	
	public void newfile() {
		filename="������";
		ta.setText("");
		setTitle(filename);
	}
	
	public void loadFile(String fn) {
		
	}
	
	
	public void saveFile(String fn) {
		
	}
	
	
	public static void main(String[] args) {
		NotePad4 np=new NotePad4();
		np.setSize(640, 480);
		np.setVisible(true);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}