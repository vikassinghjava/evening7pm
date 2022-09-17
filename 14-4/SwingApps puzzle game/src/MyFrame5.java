import java.awt.*;
import javax.swing.*;
public class MyFrame5
{	JFrame jf;JButton jb;

     Container  con;
	public MyFrame5()
	{
		jf=new JFrame("Mytitle");
		con=jf.getContentPane();
		con.setBackground(Color.red);

		
		
		jf.setSize(500, 500);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
	   new MyFrame5();			
	}

}









