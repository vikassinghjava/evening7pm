import javax.swing.*;
public class MyFrame4
{	
	JFrame jf;
	public MyFrame4()
	{
		jf=new JFrame("MyFrame");
		jf.setSize(500, 500);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//System.exit(0);
		//jf.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);//Default Awt Frame
		//jf.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);//hide after close
		//jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
	}
	public static void main(String[] args)
	{
		new MyFrame4();		
	}
	

}









