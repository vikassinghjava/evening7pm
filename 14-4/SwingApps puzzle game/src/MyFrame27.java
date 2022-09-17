import java.awt.*;
import javax.swing.*;
class MyButton extends Button
{	
	public void paint(Graphics ge)
	{
		         setBackground(Color.cyan);
				 ge.setColor(Color.red);
				 ge.drawString("Vikas", 90, 50);
				
	}	
}


public class MyFrame27 extends JFrame 
{		
		MyButton m;
		JButton jb;
		public MyFrame27()
		{		
				setLayout(null);			
				add(m=new MyButton());
				m.setBounds(100, 100, 200, 100);
				
				add(jb=new JButton("Click"));
				jb.setBounds(100, 200, 200, 100);
				
				setSize(500, 500);
				setVisible(true);
			    setDefaultCloseOperation(3);
			    
		}	
		
	public static void main(String[] args)
	{
				new MyFrame27();
	}
	
		

}









