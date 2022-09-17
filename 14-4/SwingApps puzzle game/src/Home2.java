import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
public class Home2 extends JFrame 
{	JProgressBar jp; JButton jb;
	public Home2()
	{
		getContentPane().setLayout(new FlowLayout());
		getContentPane().setBackground(Color.WHITE);
		
		getContentPane().add(jp=new JProgressBar());//0 100
		  jp.setBackground(Color.WHITE);
		  jp.setForeground(Color.red);
		//getContentPane().add(jp=new JProgressBar(0,100000));
		jp.setStringPainted(true);
	
		
		
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(3);
		
	}
		
	public static void main(String[] args)
	{
	  new Home2();	
	}

}
