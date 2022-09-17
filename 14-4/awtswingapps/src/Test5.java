import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Test5 implements ActionListener
{
	//same class listener
	Frame f;
	Button b;//source->event-ActionEvent->ActinListener
	TextField tf1,tf2,tf3;
	Test5()
	{
		f=new Frame();
		f.setLayout(null);//removed the default border layout from frame
			
		f.add(tf1=new TextField());
		f.add(tf2=new TextField());
		f.add(tf3=new TextField());
		f.add(b=new Button("Add"));
		
		//Register button to listener
		b.addActionListener(this);
		
		tf1.setBounds(300, 100, 200, 30);
		tf2.setBounds(600, 100, 200, 30);
		b.setBounds(300, 300, 500, 30);
		tf3.setBounds(300, 400, 500, 30);
		
		f.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		f.setVisible(true);
		f.setTitle("title");
		
	}
	public static void main(String[] args) 
	{
	  new Test5();	
	}
	

	public void actionPerformed(ActionEvent e) {
		/*String n1=tf1.getText();
		String n2=tf2.getText();
		
		int x=Integer.parseInt(n1);
		int y=Integer.parseInt(n2);
		
		tf3.setText(x+y+"");*/
		tf3.setText(Integer.parseInt(tf1.getText())+Integer.parseInt(tf2.getText())+"");
	}
}
