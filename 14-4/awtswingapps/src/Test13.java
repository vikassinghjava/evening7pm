import javax.swing.JFrame;
import javax.swing.WindowConstants;
public class Test13 extends JFrame
{
	Test13()
	{
		  setSize(300, 300);
		  setVisible(true);
		  //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//best way
	}
	public static void main(String[] args) 
	{
	  new Test13();	
	}
	
}

