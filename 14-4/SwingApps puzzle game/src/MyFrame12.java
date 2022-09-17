import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyFrame12 implements ActionListener
{	JFrame jf;
	Container con;
	JLabel jl1,jl2;
	JTextArea ta;
	JCheckBox ch1,ch2,ch3;
	
	public MyFrame12()
	{
		jf=new JFrame("Mytitle");
		jl1=new JLabel(new ImageIcon("e:\\wall2.jpg"));
		//jf.setContentPane(jl1);
		
		con=jf.getContentPane();
		con.setLayout(null);
		
		con.add(ta=new JTextArea());
		ta.setBounds(100, 100,200,50);
		ta.setBackground(Color.cyan);
		
		
		con.add(ch1=new JCheckBox("c"));
		con.add(ch2=new JCheckBox("c++"));
		con.add(ch3=new JCheckBox("java"));
		
		
		
		ch1.setBounds(100, 30, 50, 30);
		ch2.setBounds(200, 30, 50, 30);
		ch3.setBounds(300, 30, 50, 30);
		
		jf.setSize(500, 500);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setIconImage(Toolkit.getDefaultToolkit().getImage("e:\\wall2.jpg"));
		
		ch1.addActionListener(this);ch2.addActionListener(this);ch3.addActionListener(this);
	}
	public static void main(String[] args)
	{
	   new MyFrame12();			
	}
		
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==ch1)
			{
				ta.setText(ch1.getText());
			}
			if(e.getSource()==ch2)
			{
				ta.setText(ch2.getText());
			}
			if(e.getSource()==ch3)
			{
				ta.setText(ch3.getText());
			}
		}
	

}









