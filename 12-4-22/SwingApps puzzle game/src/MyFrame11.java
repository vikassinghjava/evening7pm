import java.awt.*;
import javax.swing.*;
public class MyFrame11 
{	JFrame jf;
	Container con;
	JLabel jl1;
	JButton jb,jb2;
	public MyFrame11()
	{	jf=new JFrame("Mytitle");		
		jl1=new JLabel(new ImageIcon("img\\gamebck.jpg"));
		jf.setContentPane(jl1);
		con=jf.getContentPane();
		con.setLayout(new FlowLayout());			
		
		con.add(jb=new JButton("Click Me!!"));		
		con.add(jb2=new JButton("Clear!!"));	
		
			
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setSize(500, 500);
		jf.setVisible(true);
			
	}
	public static void main(String[] args)
	{
	   new MyFrame11();			
	}
		
		
	

}









