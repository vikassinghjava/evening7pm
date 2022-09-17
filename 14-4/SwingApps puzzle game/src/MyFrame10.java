import java.awt.*;

import javax.swing.*;
public class MyFrame10
{	JFrame jf;
	Container con;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	public MyFrame10()
	{
		jf=new JFrame("Mytitle");
		con=jf.getContentPane();
		con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
		
		con.add(jb1=new JButton("1"));
		con.add(jb2=new JButton("2"));
		con.add(jb3=new JButton("3"));
		con.add(jb4=new JButton("4"));
		
		jf.setSize(500, 500);
		jf.setVisible(true);
		jf.setIconImage(Toolkit.getDefaultToolkit().getImage("e:\\wall.jpg"));
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
	   new MyFrame10();			
	}
	

}









