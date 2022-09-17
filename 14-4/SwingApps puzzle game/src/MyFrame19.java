import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MyFrame19 implements ActionListener
{	
		JButton jb1,jb2,jb3,jb4,jb5;
		JFrame jf;
		CardLayout cardLayout;
		public MyFrame19()
		{
				jf=new JFrame("Mytitle");				
	
				
				jf.setLayout(cardLayout=new CardLayout());
				
				jf.add("1",jb1=new JButton("1"));
				jf.add("2",jb2=new JButton("2"));
				jf.add("3",jb3=new JButton("3"));
				jf.add("4",jb4=new JButton("4"));
				jf.add("5",jb5=new JButton("5"));				
				
				jf.setSize(500, 500);
				jf.setVisible(true);
				jf.setDefaultCloseOperation(3);
				jb1.addActionListener(this);
				jb2.addActionListener(this);
				jb3.addActionListener(this);
				jb4.addActionListener(this);
				jb5.addActionListener(this);
				
		}
		
		
	public static void main(String[] args)
	{
				new MyFrame19();
	}
	
	
	public void actionPerformed(ActionEvent e)
	{	
		
		//cardLayout.next(jf.getContentPane());
		//cardLayout.previous(jf.getContentPane());
		//cardLayout.first(jf.getContentPane());
		//cardLayout.last(jf.getContentPane());
		String name=JOptionPane.showInputDialog("Enter card name");
		
		cardLayout.show(jf.getContentPane(), name);
	}


}









