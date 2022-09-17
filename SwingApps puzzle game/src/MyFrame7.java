import java.awt.*;
import javax.swing.*;

public class MyFrame7
{	
	JFrame jf;
	Container con; JButton jb1,jb2;
		
	public MyFrame7()
	{
		jf=new JFrame("Mytitle");
	
		con=jf.getContentPane();
		con.setBackground(Color.CYAN);
		FlowLayout f=new FlowLayout();
		con.setLayout(f);
		
		con.add(jb1=new JButton("Button1"));
		con.add(jb2=new JButton("Button2"));	
		
		jf.setSize(500, 500);
		jf.setVisible(true);
		//jf.setTitle("MyFRame!!!");
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
	   new MyFrame7();			
	}
	

}









