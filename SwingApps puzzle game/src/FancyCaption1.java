import java.awt.*;
import javax.swing.*;
public class FancyCaption1
{	JFrame jf;
	JLabel l1; JButton jb;
	public FancyCaption1()
	{	jf=new JFrame();
		//String c1="<html><font color=red><b> <u>Hello</u> </b> </font></html>";
		String c2="<html><font color=green> <i>Click</i> </font></html>";
		String c1="<html>"
				+ "<font color=red size=3>"
				+ "Hello"
				+ "</font>"
				+ "</html>";
		
		l1=new JLabel(c1,JLabel.CENTER);
		jb=new JButton(c2);
		
		jf.add(BorderLayout.NORTH,l1);
		jf.add(BorderLayout.CENTER,jb);
		jf.setVisible(true);
		jf.setSize(300, 400);
		
		
	}
	public static void main(String[] args)
	{
		new FancyCaption1();
	}

}
