import javax.swing.*;
public class MyFrame13 extends JFrame
{		JButton jb1,jb2;
		public MyFrame13()
		{		setLayout(null);
				add(jb1=new JButton("Login"));
				add(jb2=new JButton("signup"));
				
				jb1.setBounds(100, 100, 100, 40);
				jb2.setBounds(100, 200, 100, 40);
				
				setSize(500, 500);
				setVisible(true);
				setDefaultCloseOperation(3);
		}
		
		
	public static void main(String[] args)
	{
				new MyFrame13();
	}
	

}









