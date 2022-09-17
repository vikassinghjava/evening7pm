import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
public class Test15 
{
	JFrame jf;
	Test15(){
		  jf=new JFrame();
		  jf.setSize(500, 500);
		  jf.setVisible(true);
		  jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//best way
		  jf.setLocation(100, 100);
		  jf.setIconImage(Toolkit.getDefaultToolkit().getImage("img/bck.jpg"));
	}
	public static void main(String[] args) 
	{
	  new Test15();	
	}
	
}

