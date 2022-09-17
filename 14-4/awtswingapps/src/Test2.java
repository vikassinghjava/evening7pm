import java.awt.Frame;
import java.awt.Toolkit;
public class Test2 extends Frame
{
	Test2()//ye constr hai, 
	{	
		//setLocation(100, 100);
		//setSize(400,500);
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		setVisible(true);
		setTitle("title");
		
	}
	public static void main(String[] args) 
	{
	  new Test2();	
	}
}
