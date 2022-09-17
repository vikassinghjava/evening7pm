import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Test4 implements ActionListener
{
	//same class listener
	Frame f;
	Button b;//source->event-ActionEvent->ActinListener
	TextField tf1;
	Test4()
	{
		f=new Frame();
		f.setLayout(null);//removed the default border layout from frame
			
		f.add(tf1=new TextField());
		f.add(b=new Button("hello"));
		
		//Register button to listener
		b.addActionListener(this);
		
		tf1.setBounds(300, 100, 200, 30);
		b.setBounds(300, 300, 200, 30);
		
		f.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		f.setVisible(true);
		f.setTitle("title");
		
	}
	public static void main(String[] args) 
	{
	  new Test4();	
	}
	

	public void actionPerformed(ActionEvent e) {
	//System.out.println("hello");
		tf1.setText("welcome");
	}
}
