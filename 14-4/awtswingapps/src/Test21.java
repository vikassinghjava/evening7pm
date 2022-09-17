import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Test21 implements ActionListener {
	
	JFrame jf;
	JLabel jl1;
	JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,jb10;
	JButton plus,minus,multiply,divide,equal,del;
	JTextField tf;
	int operator=0;
	double num1,num2;
	
	Test21() {
		
		jf = new JFrame();
		jf.setLayout(new FlowLayout());
		//jf.setLayout(new FlowLayout(FlowLayout.LEFT));
		/*********************************************************************************/
		jf.add(tf=new JTextField(17));
		jf.add(jb1=new JButton("1"));
		jf.add(jb2=new JButton("2"));
		jf.add(jb3=new JButton("3"));
		jf.add(jb4=new JButton("4"));
		jf.add(jb5=new JButton("5"));
		jf.add(jb6=new JButton("6"));
		jf.add(jb7=new JButton("7"));
		jf.add(jb8=new JButton("8"));
		jf.add(jb9=new JButton("9"));
		jf.add(jb10=new JButton("0"));
		jf.add(del=new JButton("del"));
		//del.setEnabled(false);
		jf.add(plus=new JButton("+"));
		jf.add(minus=new JButton("-"));
		jf.add(multiply=new JButton("X"));
		jf.add(divide=new JButton("/"));
		jf.add(equal=new JButton("="));
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		jb6.addActionListener(this);
		jb7.addActionListener(this);
		jb8.addActionListener(this);
		jb9.addActionListener(this);
		jb10.addActionListener(this);
		plus.addActionListener(this);
		minus.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
		equal.addActionListener(this);
		del.addActionListener(this);
		
		/********************************************************************************/
		jf.setSize(230, 300);
		//jf.setSize(con.getIconWidth(), con.getIconWidth());
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// best way
		//jf.setLocation(100, 100);
		jf.setLocationRelativeTo(null);
		jf.setIconImage(Toolkit.getDefaultToolkit().getImage("img/bck.jpg"));
		jf.setResizable(false);
	}

	public static void main(String[] args) {
		new Test21();
	}
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==jb1) 
		{
			tf.setText(tf.getText()+"1");
		}
		
		if(ae.getSource()==jb2) 
		{
			tf.setText(tf.getText()+"2");
		}
		
		if(ae.getSource()==plus) {
			operator=1;
			num1=Double.parseDouble(tf.getText());
			tf.setText("");//for clear buuton
		}
		
		if(ae.getSource()==minus) {
			operator=2;
			num1=Double.parseDouble(tf.getText());
			tf.setText("");
		}
		if(ae.getSource()==equal) {
			
			num2=Double.parseDouble(tf.getText());
			if(operator==1) {
				tf.setText(num1+num2+"");
			}
			
			if(operator==2) {
				tf.setText(num1-num2+"");
			}
		}
		
		if(ae.getSource()==del) {
			String str=tf.getText();
			tf.setText(str.substring(0,str.length()-1));
			
		}
		
	}
}
