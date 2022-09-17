import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
public class ShiftPic extends JFrame implements ActionListener
{	
	
	JLabel jl1,jl2,jl3;
	JButton jb;
	static int count=0;
	public ShiftPic()
	{
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(jl1=new JLabel(new ImageIcon("e:\\h.png")));
		
		getContentPane().add(jb=new JButton("Next"));
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(3);
	    jb.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
	   	String path[]=new String[]{"e:\\h.png","e:\\b.png","e:\\c.png"};
	   	
	   		 jl1.setIcon(new ImageIcon(path[count]));
	   		 count=count+1;
	   		 if(count==3)
	   		 {
	   			 count=0;
	   		 }
	   	
	   	  
	}		
	public static void main(String[] args)
	{
	  new ShiftPic();	
	}

}
