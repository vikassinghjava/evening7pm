import java.awt.*;

import javax.swing.*;



public class MyFrame28 extends JFrame 
{		
		
		public MyFrame28()
		{		
				setLayout(null);			
				
				
				setSize(500, 500);
				setVisible(true);
			    setDefaultCloseOperation(3);
			    
		}	
		public void paint(Graphics g)
		{
			    super.paint(g);
			    g.fillArc(100, 200, 200, 200, 0, -90);
				//g.drawRect(100, 200, 100, 150);
			    //g.setColor(Color.red);
			    //g.fillRect(100, 200, 100, 150);
			    
			     //g.drawOval(220, 100, 100, 100);
			     //g.fillOval(220, 100, 100, 100);
				
		}
		
	public static void main(String[] args)
	{
				new MyFrame28();
	}
	
		

}









