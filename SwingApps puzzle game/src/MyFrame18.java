import java.awt.*;
import javax.swing.*;
public class MyFrame18
{	
		JButton jb1,jb2,jb3,jb4,jb5;
		JFrame jf;
		public MyFrame18()
		{
				jf=new JFrame("Mytitle");				
				
				//FlowLayout fl=new FlowLayout();
				//FlowLayout fl=new FlowLayout(FlowLayout.RIGHT);
				//FlowLayout fl=new FlowLayout(FlowLayout.LEFT);
				FlowLayout fl=new FlowLayout(FlowLayout.CENTER,50,50);
				jf.setLayout(fl);
				
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
				new MyFrame18();
	}
	


}









