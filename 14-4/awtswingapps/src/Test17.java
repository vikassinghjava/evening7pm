import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class Test17 implements ActionListener {
	JFrame jf;
	JLabel jl;
	JLabel jl1;
	JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;
	JTextArea ta;

	Test17() {
		jf = new JFrame();
		Icon con;
		jf.setContentPane(jl = new JLabel(con=new ImageIcon("img/gamebck.jpg")));
		jf.setLayout(new GridLayout(3, 3));
		/*********************************************************************************/
		jf.add(jb1=new JButton("1"));
		jf.add(jb2=new JButton("2"));
		jf.add(jb3=new JButton("3"));
		jf.add(jb4=new JButton("4"));
		jf.add(jb5=new JButton("5"));
		jf.add(jb6=new JButton("6"));
		jf.add(jb7=new JButton("7"));
		jf.add(jb8=new JButton("8"));
		jf.add(jb9=new JButton(""));
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		jb6.addActionListener(this);
		jb7.addActionListener(this);
		jb8.addActionListener(this);
		jb9.addActionListener(this);
		
		
		/********************************************************************	*************/
		jf.setSize(450, 500);
		//jf.setSize(con.getIconWidth(), con.getIconWidth());
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// best way
		jf.setLocation(100, 100);
		jf.setIconImage(Toolkit.getDefaultToolkit().getImage("img/bck.jpg"));
		jf.setResizable(false);
	}

	public static void main(String[] args) {
		new Test17();
	}
	public void actionPerformed(ActionEvent ae) {
		
		  
		  if(ae.getSource()==jb9) 
		  {
			 if(jb6.getText()=="") 
			 {
				 jb6.setText(jb9.getText());
				 jb9.setText("");
				 
			 }
			 if(jb8.getText()=="") 
			 {
				 jb8.setText(jb9.getText());
				 jb9.setText("");
				 
			 }
			   if(jb1.getText()=="1"&&jb2.getText()=="2"&&jb3.getText()=="3"&&jb4.getText()=="4"&&jb5.getText()=="5"&&jb6.getText()=="6"&&jb7.getText()=="7"&&jb8.getText()=="8"&&jb9.getText()=="")
	  			{
	  				JOptionPane.showMessageDialog(null,"You Won!!");
	  			}
		  }
		  
		  if(ae.getSource()==jb8) 
		  {
			 if(jb9.getText()=="") 
			 {
				 jb9.setText(jb8.getText());
				 jb8.setText("");
				 
			 }
			 if(jb7.getText()=="") 
			 {
				 jb7.setText(jb8.getText());
				 jb8.setText("");
				 
			 }
			 
			 if(jb5.getText()=="") 
			 {
				 jb5.setText(jb8.getText());
				 jb8.setText("");
				 
			 }
			 if(jb1.getText()=="1"&&jb2.getText()=="2"&&jb3.getText()=="3"&&jb4.getText()=="4"&&jb5.getText()=="5"&&jb6.getText()=="6"&&jb7.getText()=="7"&&jb8.getText()=="8"&&jb9.getText()=="")
	  			{
	  				JOptionPane.showMessageDialog(null,"You Won!!");
	  			}
			 
		  }
	}
}
