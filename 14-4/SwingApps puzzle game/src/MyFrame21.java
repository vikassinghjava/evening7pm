import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MyFrame21 extends JFrame implements ActionListener
{	
			
		JRadioButton jb1,jb2,jb3,jb4;
		JCheckBox ch1,ch2,ch3;
		Container con;
		public MyFrame21()
		{
			    con=getContentPane();
				con.setLayout(new FlowLayout());
				
			    con.add(jb1=new JRadioButton("yes"));
				con.add(jb2=new JRadioButton("no"));
				con.add(jb3=new JRadioButton("other"));
				
				ButtonGroup bg=new ButtonGroup();
							bg.add(jb1);
							bg.add(jb2);
							bg.add(jb3);
							
								
							
				setSize(500, 500);
				setVisible(true);
			    setDefaultCloseOperation(3);
			    jb1.addActionListener(this);
			    jb2.addActionListener(this);
			    jb3.addActionListener(this);
		}
		
		
	public static void main(String[] args)
	{
				new MyFrame21();
	}
	
	public void actionPerformed(ActionEvent ae)
	{
			if(ae.getSource()==jb1)
			{
				JOptionPane.showMessageDialog(this, jb1.getText());
			}
			if(ae.getSource()==jb2)
			{
				JOptionPane.showMessageDialog(this, jb2.getText());
			}
			if(ae.getSource()==jb3)
			{
				JOptionPane.showMessageDialog(this, jb3.getText());
			}
			
	
	}


}









