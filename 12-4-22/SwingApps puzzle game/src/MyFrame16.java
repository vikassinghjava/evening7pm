import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MyFrame16 implements ActionListener
{	
		JButton plus,minus,eq,delete,clear;
		int operator=0; double num1,num2,total;
	     JButton jb[]=new JButton[10];
		JFrame jf;
		JTextField tf;
		public MyFrame16()
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
				jf.add(delete=new JButton("Delete"));
				jf.add(clear=new JButton("Clear"));
				
				jf.setSize(500, 300);
				jf.setVisible(true);
				jf.setDefaultCloseOperation(3);
				for (int i = 0; i < jb.length; i++)
				{
					jb[i].addActionListener(this);
				}
				jf.setLocationRelativeTo(null);
				delete.addActionListener(this); clear.addActionListener(this);
				plus.addActionListener(this);minus.addActionListener(this);
				eq.addActionListener(this);
		}
				
	public static void main(String[] args)
	{
				new MyFrame16();
	}
	public void actionPerformed(ActionEvent ae) 
	{
			if(ae.getSource()==jb[0])
			{
				tf.setText(tf.getText()+"0");
			}
			if(ae.getSource()==jb[1])
			{
				tf.setText(tf.getText()+"1");
			}
			if(ae.getSource()==jb[2])
			{
				tf.setText(tf.getText()+"2");
			}
			if(ae.getSource()==jb[3])
			{
				tf.setText(tf.getText()+"3");
			}
			if(ae.getSource()==clear)
			{
				tf.setText("");
			}
			if(ae.getSource()==delete)
			{
				String str=tf.getText();
				String sub=str.substring(0, str.length()-1);
				tf.setText(sub);
			}
			if(ae.getSource()==plus)
			{
				operator=1;
				num1=Double.parseDouble(tf.getText());
				tf.setText("");
			}
			
			if(ae.getSource()==minus)
			{
				operator=2;
				num1=Double.parseDouble(tf.getText());
				tf.setText("");
			}
			
			if(ae.getSource()==eq)
			{
				num2=Double.parseDouble(tf.getText());
				
				  if(operator==1)
				  {
					  total=num1+num2;
				  }
				  if(operator==2)
				  {
					  total=num1-num2;
				  }
				tf.setText(""+total);
				
			}
			
			
	}
	

}









