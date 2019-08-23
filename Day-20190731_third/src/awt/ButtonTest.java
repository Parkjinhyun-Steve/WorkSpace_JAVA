package awt;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest {

	public static void main(String[] args) {
		ButtonEx ex=new ButtonEx();
		
		Frame f=new Frame("버튼 테스트");
		f.add(ex);
		
		f.pack();
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {   // 종료버튼
			public void windowClosing(WindowEvent w) {
				System.exit(0);
			}
		});
	
	}

}
