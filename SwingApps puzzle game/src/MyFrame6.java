import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;
public class MyFrame6
{	JFrame jf;
	JButton jb1,jb2;
	public MyFrame6()
	{	jf=new JFrame("Mytitle");
	    jf.setBackground(Color.red);
	    
		FlowLayout f=new FlowLayout();
		jf.setLayout(f);//flowlayout
	    
		jf.add(jb1=new JButton("button1"));
		jf.add(jb2=new JButton("button2"));
		
		
		jf.setSize(500, 500);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
	   new MyFrame6();			
	}
	

}









