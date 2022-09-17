import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class BorderSample 
{	JFrame jf;
	JButton jb1,jb2;
	JLabel jl1;
	public BorderSample() 
	{
		jf=new JFrame("Title");
		Font f=new Font("Viner Hand ITC",Font.PLAIN , 20);
		//jf.setFont(f);
		jf.setLayout(new FlowLayout());		
		jf.add(jb1=new JButton("Button1"));
		jf.add(jb2=new JButton("Button2"));		
		jf.add(jl1=new  JLabel("MyLabel"));
		jb1.setFont(f);
		jb2.setFont(f);
		jl1.setFont(f);
		//jb1.setBorder(BorderFactory.createEtchedBorder());
		//jb2.setBorder(BorderFactory.createLineBorder(Color.cyan));
		 // jb1.setBorder(BorderFactory.createLineBorder(Color.RED, 10));
		//jb1.setBorder(BorderFactory.createLoweredBevelBorder());
		jb1.setBorder(BorderFactory.createRaisedBevelBorder());		
		jf.setSize(400, 400);
		jf.setVisible(true);
	}
	
	public static void main(String[] args) {
		new BorderSample();
	}

}
