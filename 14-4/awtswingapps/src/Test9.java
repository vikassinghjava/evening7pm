import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class Test9 
{
	//annonymous listener
	Frame f;
	Test9()
	{
		f=new Frame();
		f.setSize(500,400);
		f.setVisible(true);
		f.setTitle("title");
		f.addWindowListener(   
				                  new WindowAdapter() 
				                  {
				                	    public void windowClosing(WindowEvent e)
										{
											System.exit(0);
										}
								  }
		                    );
		
	}
	public static void main(String[] args) 
	{
	  new Test9();	
	}

	
}

