import java.awt.*;
import javax.swing.*;
public class MyFrame20
{	
		JButton jb1,jb2,jb3,jb4,jb5;
		JFrame jf;
		public MyFrame20()
		{
				jf=new JFrame("Mytitle");				
				
				BoxLayout b=new BoxLayout(jf.getContentPane(), BoxLayout.Y_AXIS);
				jf.setLayout(b);
				
				jf.add(jb1=new JButton("North"));
				jf.add(jb2=new JButton("South"));
				jf.add(jb3=new JButton("East"));
				jf.add(jb4=new JButton("West"));
				jf.add(jb5=new JButton("Center"));				
				
				jf.setSize(500, 500);
				jf.setVisible(true);
				jf.setDefaultCloseOperation(3);
		}
		
		
	public static void main(String[] args)
	{
				new MyFrame20();
	}
	


}









