import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;
public class TestJCombobox extends JFrame  implements ActionListener
{
	JComboBox jcm;
	JTextArea ta;
	public TestJCombobox()
	{
		getContentPane().setLayout(new FlowLayout());	
		
		String item[]=new String[]{"select","india","china","nepal"};
		getContentPane().add(jcm=new JComboBox(item));
		
		
		getContentPane().add(ta=new JTextArea(10, 10));
		ta.setBackground(Color.cyan);
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(3);
		jcm.addActionListener(this);
		
	}
	public static void main(String[] args)
	{
		new TestJCombobox();
	}
	
	public void actionPerformed(ActionEvent e)
	{
	   String st=(String)jcm.getSelectedItem();
	      ta.setText(st);
	}

}
