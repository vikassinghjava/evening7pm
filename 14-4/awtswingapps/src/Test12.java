import javax.swing.JFrame;
public class Test12 
{
	public static void main(String[] args) 
	{
	  JFrame jf=new JFrame();
	  jf.setSize(300, 300);
	  jf.setVisible(true);
	  //jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//System.exit
	  //jf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//default swing frame
	  //jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//mark as garbage
	  jf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);//like default awt frame
	}
	
}

