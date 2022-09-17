import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class Test6 implements WindowListener
{
	//same class listener
	Frame f;
	Test6()
	{
		f=new Frame();
		f.setSize(500,400);
		f.setVisible(true);
		f.setTitle("title");
		
		f.addWindowListener(this);
		
	}
	public static void main(String[] args) 
	{
	  new Test6();	
	}
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
