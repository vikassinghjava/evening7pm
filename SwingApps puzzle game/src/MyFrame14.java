import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.swing.*;
public class MyFrame14 implements ActionListener
{		JFrame jf;
        JTextArea ta;
        JTextField tf;
		public MyFrame14()
		{
				jf=new JFrame("Mytitle");
				jf.add(BorderLayout.NORTH,tf=new JTextField());
				JScrollPane sc=new JScrollPane(ta=new JTextArea());
				jf.add(BorderLayout.CENTER,sc);
				ta.setEditable(false);
				jf.setSize(500, 500);
				jf.setVisible(true);
				jf.setDefaultCloseOperation(3);
				tf.addActionListener(this);
		}		
		
	public static void main(String[] args)
	{
				new MyFrame14();
	}	
	
		public void actionPerformed(ActionEvent e)
		{
			try{
			Class ref=Class.forName(tf.getText());
			Constructor con[]=ref.getDeclaredConstructors();
			Method  m[]=ref.getDeclaredMethods();
			Field f[]=ref.getDeclaredFields();
		    String fl="",cn="",mt="";
			for (int i = 0; i < f.length; i++)
			{
				fl=fl+f[i]+"\n";
			}
			for (int i = 0; i < m.length; i++)
			{
				mt=mt+m[i]+"\n";			
			}
			for (int i = 0; i < con.length; i++)
			{
				cn=cn+con[i]+"\n";			
			}
			
			ta.append(cn+mt+fl);
			
			
			}catch(Exception ex)
			{
				ex.printStackTrace();
			}
			
		}

}









