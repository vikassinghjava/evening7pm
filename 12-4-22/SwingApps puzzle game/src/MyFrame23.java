import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;

public class MyFrame23 extends JFrame implements ActionListener
{		Container con;
		JFileChooser jfile;
		JButton jb,jb2;
		JTextArea ta;
		JColorChooser jc;
		public MyFrame23()
		{
			    con=getContentPane();
				con.setLayout(new FlowLayout());
				con.add(jb=new JButton("File Chooser"));
				con.add(ta=new JTextArea(10, 10));
				ta.setBackground(Color.PINK);
				
				con.add(jb2=new JButton("Select Color"));
				
				setSize(500, 500);
				setVisible(true);
			    setDefaultCloseOperation(3);
			    jb.addActionListener(this);
			    jb2.addActionListener(this);
		}
		
		
	public static void main(String[] args)
	{
				new MyFrame23();
	}
	
		public void actionPerformed(ActionEvent ae) 
		{
			if(ae.getSource()==jb)
			{
		    jfile=new JFileChooser();
			jfile.showOpenDialog(this);//open file chooser
			File f=jfile.getSelectedFile();
			String fileName=f.getName();
			String filePath=f.getPath();
			ta.setText(fileName+"\n"+filePath);
			}
			if(ae.getSource()==jb2)
			{
				jc=new JColorChooser();
				Color c=jc.showDialog(this,"Select Color", null);
				con.setBackground(c);
			}
			
			
		}
	


}









