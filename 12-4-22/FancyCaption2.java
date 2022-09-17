import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class FancyCaption2 extends JFrame
{
	String cap="<html><big>Vikas Singh Sr Java Developer</big><br>"
		+"<B>B.sc.(Maths),M.C.A</b><br><hr><hr>" 
			+"<p align=right> JavaHub Pvt Ltd</p><hr>" 
			+"<font color=green size=5> Thanks To All My JAVA Team Members </FONT><HR>"
			+"<i><font color=blue size=5>Your Comments and bug r very welcome at... </FONT></i><HR>"
			+"<em><big>222vikassingh@gmail.com</big></em></html>";
	FancyCaption2()
	{
	
	
		JLabel jl=new JLabel(cap,JLabel.LEFT);
		jl.setForeground(Color.red);
		JButton jb=new JButton(cap);
		Border b=BorderFactory.createTitledBorder("Myframe");
		        jl.setBorder(b);
		        jb.setBorder(b);
		
		
		add(jl,"North");
		add(jb,"South");
		setSize(600,600);
		setVisible(true);
		
	}
	public static void main(String[] args) 
	{
		new FancyCaption2();
	}

}
