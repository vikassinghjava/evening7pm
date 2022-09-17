import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class SplashScreen {
	JFrame jf;
	JProgressBar jp;
	public SplashScreen() {
		jf=new JFrame();
		
		jf.getContentPane().setBackground(Color.gray);
		jf.add(jp=new JProgressBar(),BorderLayout.SOUTH);
		jp.setForeground(Color.red);
		jp.setBackground(Color.white);
		jp.setStringPainted(true);
		jf.setUndecorated(true);
		jf.setVisible(true);
		jf.setSize(500, 500);
		jf.setTitle("abcd");
		jf.setLocationRelativeTo(null);//automatic detect ceter coordinate
		
		for(int i=1;i<=100;i++) {
			jp.setValue(i);
			if(i==100) {
				jf.dispose();
				new Login();
			}
			try {
				Thread.sleep(100);//100ms ke liye stop
			}catch(Exception ex) {}
		}
	}
 public static void main(String[] args) {
	new SplashScreen();
}
}
