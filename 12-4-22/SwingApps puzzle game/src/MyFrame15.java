import java.awt.*;
import javax.swing.*;
public class MyFrame15
{	
		JButton plus,minus,eq;
	     JButton jb[]=new JButton[10];
		JFrame jf;
		JTextField tf;
		public MyFrame15()
		{
				jf=new JFrame("Mytitle");
			
				GridLayout gl=new GridLayout(3, 4,10,10);
				jf.setLayout(gl);
				
				jf.add(tf=new JTextField());
				for (int i = 0; i < 10; i++)
				{
				  jf.add(jb[i]=new JButton(""+i));	
				}
				
				jf.add(plus=new JButton("+"));
				jf.add(minus=new JButton("-"));
				jf.add(eq=new JButton("="));
				
				jf.setSize(500, 500);
				jf.setVisible(true);
				jf.setDefaultCloseOperation(3);
		}
		
		
	public static void main(String[] args)
	{
				new MyFrame15();
	}
	

}









