import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class Test7 
{
	//same class listener
	Frame f;
	Test7()
	{
		f=new Frame();
		f.setSize(500,400);
		f.setVisible(true);
		f.setTitle("title");
		f.addWindowListener(new OuterListener());
		
	}
	public static void main(String[] args) 
	{
	  new Test7();	
	}

	
}

class OuterListener implements WindowListener{
	
	public void windowOpened(WindowEvent e) {}
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
	public void windowClosed(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
	
	
}