import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;
public class TestFileChooser extends JFrame  implements ActionListener
{
	JButton jb;
	JTextArea ta;
	public TestFileChooser()
	{
		getContentPane().setLayout(new FlowLayout());		
		getContentPane().add(jb=new JButton("Choose file"));
		getContentPane().add(ta=new JTextArea(10, 10));
		ta.setBackground(Color.cyan);
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(3);
		jb.addActionListener(this);
	}
	public static void main(String[] args)
	{
		new TestFileChooser();
	}
	
	public void actionPerformed(ActionEvent e)
	{
	      JFileChooser jfc=new JFileChooser();
	      			jfc.showOpenDialog(this);
	      			File f=jfc.getSelectedFile();
	      			String name=f.getName();
	      			String path=f.getPath();
	      			ta.setText(name+"\n"+path);
	      
	}

}
