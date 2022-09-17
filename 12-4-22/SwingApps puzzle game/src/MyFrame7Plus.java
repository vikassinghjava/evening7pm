import java.awt.*;
import javax.swing.*;

public class MyFrame7Plus
{   JFrame jf;
	Container con; JButton jb1,jb2,jb3,jb4,jb5;	
	public MyFrame7Plus()
	{	jf=new JFrame("Mytitle");
		con=jf.getContentPane();//con object contains default border layout
		con.add(BorderLayout.NORTH,jb1=new JButton("North",new ImageIcon("img\\a.png")));
		con.add(BorderLayout.SOUTH,jb2=new JButton("South",new ImageIcon("img\\a.png")));
		//con.add(BorderLayout.EAST,jb3=new JButton("East"));
		//con.add(BorderLayout.WEST,jb4=new JButton("West"));
		//con.add(BorderLayout.CENTER,jb2=new JButton("Center"));
		jf.setSize(500, 500);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
	   new MyFrame7Plus();			
	}
	

}









