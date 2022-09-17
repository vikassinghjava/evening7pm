//package awtapps;
import java.awt.*;
import java.awt.event.*;
public class Temp7 implements ActionListener
{		  
			TextField tf; int operator=0;
			double num1,num2,total;
			Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,eq,plus,minus,multiply,divide,delete,clear;
			Frame f; 
		    Temp7()
	      {
	    	   f=new Frame(); f.setLayout(null);//remove the border layout
	    	   f.add(tf=new TextField());	    	   
	    	   f.add(b1=new Button("1"));
	    	   f.add(b2=new Button("2"));
	    	   f.add(b3=new Button("3"));
	    	   f.add(b4=new Button("4"));
	    	   f.add(b5=new Button("5"));
	    	   f.add(b6=new Button("6"));
	    	   f.add(b7=new Button("7"));
	    	   f.add(b8=new Button("8"));
	    	   f.add(b9=new Button("9"));
	    	   f.add(b0=new Button("0"));
	    	   f.add(plus=new Button("+"));
	    	   f.add(minus=new Button("-"));
	    	   f.add(multiply=new Button("X"));
	    	   f.add(divide=new Button("/"));
	    	   f.add(eq=new Button("="));
	    	   f.add(delete=new Button("Del"));
	    	   f.add(clear=new Button("Clear"));
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
