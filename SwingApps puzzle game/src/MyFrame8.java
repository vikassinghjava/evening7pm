import java.awt.*;
import javax.swing.*;
public class MyFrame8
{	JFrame jf;	Container con;	
	JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;//,jb1,jb2,jb3,
	public MyFrame8()
	{	jf=new JFrame("Mytitle");			
		con=jf.getContentPane();
		//GridLayout g=new GridLayout(3,3);
		//GridLayout g=new GridLayout();
		GridLayout g=new GridLayout(3,3,15,15);
		con.setLayout(g);
		ImageIcon img=new ImageIcon("img\\a.png");
		con.add(jb1=new JButton(img));
		con.add(jb2=new JButton(img));
		con.add(jb3=new JButton(img));
		con.add(jb4=new JButton(img));
		con.add(jb5=new JButton(img));
		con.add(jb6=new JButton(img));
		con.add(jb7=new JButton(img));
		con.add(jb8=new JButton(img));
		con.add(jb9=new JButton(img));
		
		jf.setSize(500, 500);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
	   new MyFrame8();			
	}
	

}









