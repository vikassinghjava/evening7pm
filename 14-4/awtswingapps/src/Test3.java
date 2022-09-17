import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Toolkit;

public class Test3
{
	Frame f;
	Button b;
	TextField tf1,tf2,tf3;
	Label lb1,lb2,lb3;
	Test3()
	{
		f=new Frame();
		f.setLayout(null);//removed the default border layout from frame
			
		f.add(lb1=new Label("First No"));
		f.add(lb2=new Label("Second  No"));
		f.add(lb3=new Label("Sum"));
		
		f.add(tf1=new TextField());
		f.add(tf2=new TextField());
		f.add(tf3=new TextField());
		f.add(b=new Button("Add"));
		
		lb1.setBounds(100, 100, 100, 30);
		lb1.setBackground(Color.red);
		tf1.setBounds(300, 100, 200, 30);
		
		lb2.setBounds(100, 200, 100, 30);
		tf2.setBounds(300, 200, 200, 30);
		
		b.setBounds(300, 300, 200, 30);
		
		lb3.setBounds(100, 400, 200, 30);
		tf3.setBounds(300, 400, 200, 30);
		
		f.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		f.setVisible(true);
		f.setTitle("title");
		
	}
	public static void main(String[] args) 
	{
	  new Test3();	
	}
}
