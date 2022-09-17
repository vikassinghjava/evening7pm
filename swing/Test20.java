import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class Test20 implements ActionListener {
	JFrame jf;
	
	JLabel jl1;
	JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,jb10;
	Test20() {
		
		jf = new JFrame();
		//jf.setContentPane(jl1 = new JLabel(new ImageIcon("img/gamebck.jpg")));
		//jf.setLayout(new FlowLayout());
		jf.setLayout(new FlowLayout(FlowLayout.LEFT));
		/*********************************************************************************/
		
		jf.add(jb1=new JButton("1"));
		jf.add(jb2=new JButton("2"));
		jf.add(jb3=new JButton("3"));
		jf.add(jb4=new JButton("4"));
		jf.add(jb5=new JButton("5"));
		jf.add(jb6=new JButton("6"));
		jf.add(jb7=new JButton("7"));
		jf.add(jb8=new JButton("8"));
		jf.add(jb9=new JButton("9"));
		jf.add(jb10=new JButton("0"));
		
		
		
		/********************************************************************************/
		jf.setSize(850, 700);
		//jf.setSize(con.getIconWidth(), con.getIconWidth());
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// best way
		//jf.setLocation(100, 100);
		jf.setLocationRelativeTo(null);
		jf.setIconImage(Toolkit.getDefaultToolkit().getImage("img/bck.jpg"));
		//jf.setResizable(false);
	}

	public static void main(String[] args) {
		new Test20();
	}
	public void actionPerformed(ActionEvent ae) {
		
		
	}
}
