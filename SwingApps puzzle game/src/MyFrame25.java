import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;

public class MyFrame25 extends JFrame 
{		Container con;
		JFileChooser jfile;
		JInternalFrame jf;
		public MyFrame25()
		{
			    con=getContentPane();
				con.setLayout(null);
				con.setBackground(Color.cyan);
				for (int i = 0; i <4; i++) 
				{
				    con.add(jf=new JInternalFrame("Title",true, true, true, true));
				    jf.setBackground(Color.red);				    
				    jf.setLayout(new FlowLayout());
					jf.add(new JLabel(new ImageIcon("e:\\h.png")));	
					jf.setVisible(true);
				    jf.setSize(200, 200);
				}
				
				
				
				
				setSize(500, 500);
				setVisible(true);
			    setDefaultCloseOperation(3);
			    
		}
		
		
	public static void main(String[] args)
	{
				new MyFrame25();
	}
	
		

}









