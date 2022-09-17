import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
public class PrograssBarTest extends JFrame implements ActionListener
{	JProgressBar jp; JButton jb;
	public PrograssBarTest()
	{
		getContentPane().setLayout(new FlowLayout());
		getContentPane().setBackground(Color.cyan);
		
		//getContentPane().add(jp=new JProgressBar());//0 100
		getContentPane().add(jp=new JProgressBar(0,100));//0 100000
		jp.setStringPainted(true);
		//jp.setString("vikas");
		getContentPane().add(jb=new JButton("click"));
		
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(3);
		jb.addActionListener(this);
	}
		@Override
		public void actionPerformed(ActionEvent e) 
		{
		   		int v=jp.getValue();
		   		jp.setValue(v+1000);
		}
		
	public static void main(String[] args)
	{
	  new PrograssBarTest();	
	}

}
