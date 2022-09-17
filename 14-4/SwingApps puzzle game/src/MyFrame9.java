import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MyFrame9 implements ActionListener
{	JFrame jf;
	Container con;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	CardLayout card;
	public MyFrame9()
	{
		jf=new JFrame("Title");
		con=jf.getContentPane();
		//CardLayout c=new CardLayout();
		 card=new CardLayout(40,40);
		
		con.setLayout(card);
		
		ImageIcon img=new ImageIcon("img\\a.png");
		/*con.add(jb1=new JButton("1",img));
		con.add(jb2=new JButton("2",img));
		con.add(jb3=new JButton("3",img));
		con.add(jb4=new JButton("4",img));
		con.add(jb5=new JButton("5",img));
		con.add(jb6=new JButton("6",img));	
		*/
		con.add("one",jb1=new JButton("1",img));
		con.add("two",jb2=new JButton("2",img));
		con.add("three",jb3=new JButton("3",img));
		con.add("four",jb4=new JButton("4",img));
		con.add("five",jb5=new JButton("5",img));
		con.add("six",jb6=new JButton("6",img));	
		
		jf.setSize(500, 500);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(3);
		jb1.addActionListener(this);jb2.addActionListener(this);jb3.addActionListener(this);
		jb4.addActionListener(this);jb5.addActionListener(this);jb6.addActionListener(this);
		
		
	}
	public static void main(String[] args)
	{
	   new MyFrame9();			
	}
	
		public void actionPerformed(ActionEvent e)
		{
			//card.next(con);
			//card.last(con);
			//card.first(con);
			///card.previous(con);
			String cardName=JOptionPane.showInputDialog("Ennter name!!");
			card.show(con, cardName);
		}

}









