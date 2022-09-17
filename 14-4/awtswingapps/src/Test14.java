import javax.swing.JFrame;
import javax.swing.WindowConstants;
public class Test14 
{
	JFrame jf;
	Test14(){
		  jf=new JFrame();
		  jf.setSize(300, 300);
		  jf.setVisible(true);
		  //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//best way
	}
	public static void main(String[] args) 
	{
	  new Test14();	
	}
	
}

