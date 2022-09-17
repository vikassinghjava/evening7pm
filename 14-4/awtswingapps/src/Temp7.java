//package awtapps;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Temp7 implements ActionListener
{		  
			JTextField tf; int operator=0;
			double num1,num2,total;
			JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,eq,plus,minus,multiply,divide,delete,clear;
			JFrame f; 
		    Temp7()
	      {
	    	   f=new JFrame(); f.setLayout(null);//remove the border layout
	    	   f.add(tf=new JTextField());	    	   
	    	   f.add(b1=new JButton("1"));
	    	   f.add(b2=new JButton("2"));
	    	   f.add(b3=new JButton("3"));
	    	   f.add(b4=new JButton("4"));
	    	   f.add(b5=new JButton("5"));
	    	   f.add(b6=new JButton("6"));
	    	   f.add(b7=new JButton("7"));
	    	   f.add(b8=new JButton("8"));
	    	   f.add(b9=new JButton("9"));
	    	   f.add(b0=new JButton("0"));
	    	   f.add(plus=new JButton("+"));
	    	   f.add(minus=new JButton("-"));
	    	   f.add(multiply=new JButton("X"));
	    	   f.add(divide=new JButton("/"));
	    	   f.add(eq=new JButton("="));
	    	   f.add(delete=new JButton("Del"));
	    	   f.add(clear=new JButton("Clear"));
	    	  tf.setBounds(10, 50, 300, 30);	    	
	    	  b1.setBounds(15, 100, 50, 30);
	    	  b2.setBounds(80, 100, 50, 30);
	    	  b3.setBounds(150, 100, 50, 30);
	    	  b4.setBounds(220, 100, 50, 30);
	    	  
	    	  b5.setBounds(15, 150, 50, 30);
	    	  b6.setBounds(80, 150, 50, 30);
	    	  b7.setBounds(150, 150, 50, 30);
	    	  b8.setBounds(220, 150, 50, 30);
	    	  
	    	  b9.setBounds(15, 200, 50, 30);
	    	  b0.setBounds(80, 200, 50, 30);
	    	  plus.setBounds(150, 200, 50, 30);
	    	  minus.setBounds(220, 200, 50, 30);
	    	  
	    	  multiply.setBounds(15, 250, 50, 30);
	    	  divide.setBounds(80, 250, 50, 30);
	    	  eq.setBounds(150, 250, 50, 30);
	    	  delete.setBounds(220, 250, 50, 30);
	    	  
	    	 clear.setBounds(15, 290, 50, 30); 	   
	    	
	    	  f.setSize(340,350);
	    	  f.setLocationRelativeTo(null);
	    	  f.setVisible(true);
	    	  f.setTitle("Title");
	    	  
	    	  f.addWindowListener(new WindowAdapter() 
	    	  {    		
	    		public void windowClosing(WindowEvent arg0)
	    		{
	    		   System.exit(0);	
	    		}
	    	  });
	    	  b1.addActionListener(this);
	    	  b2.addActionListener(this);
	    	  b3.addActionListener(this);
	    	  b4.addActionListener(this);
	    	  b5.addActionListener(this);
	    	  
	    	  plus.addActionListener(this);
	    	  minus.addActionListener(this);
	    	  multiply.addActionListener(this);
	    	  divide.addActionListener(this);
	    	  eq.addActionListener(this);
	    	  clear.addActionListener(this);
	    	  delete.addActionListener(this);
	    	 
	      }	
		   
		    public void actionPerformed(ActionEvent ae)
		    {
		       if(ae.getSource()==b1)
		       {
		    	   tf.setText(tf.getText()+"1");
		       }
		       if(ae.getSource()==b2)
		       {
		    	   tf.setText(tf.getText()+"2");
		       }
		       if(ae.getSource()==b3)
		       {
		    	   tf.setText(tf.getText()+"3");
		       }
		       if(ae.getSource()==b4)
		       {
		    	   tf.setText(tf.getText()+"4");
		       }		       
		       if(ae.getSource()==b5)
		       {
		    	   tf.setText(tf.getText()+"5");
		       }
		       //////////////////////////////////////////////////
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
		       if(ae.getSource()==multiply)
		       {
		    	   operator=3;
		    	   num1=Double.parseDouble(tf.getText());
		    	   tf.setText("");
		       }
		       ///////////////////////////////////////////////////
		       
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
		    	   if(operator==3)
		    	   {
		    		   total=num1*num2;
		    	   }
		    	   
		    	   tf.setText(""+total);
		       }
		   ////// /////////////////////////////////////
		       
		       	if(ae.getSource()==clear)
		       	{
		       		tf.setText("");
		       	}
		       	if(ae.getSource()==delete)
		       	{
		       		String str=tf.getText();
		       		tf.setText(str.substring(0,str.length()-1));
		       	}
		       
		       
		    } 
		    
			public static void main(String[] args)
			{
				new Temp7();
			}			
			
}
