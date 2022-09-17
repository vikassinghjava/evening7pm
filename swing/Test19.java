import java.awt.BorderLayout;
import java.awt.Color;
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

public class Test19 implements ActionListener {
	JFrame jf;
	
	JLabel jl1;
	JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,jb10;
	Test19() {
		
		jf = new JFrame();
		//jf.setContentPane(jl1 = new JLabel(new ImageIcon("img/gamebck.jpg")));
		//jf.setLayout(new BorderLayout());
		jf.setLayout(new BorderLayout(10,20));
		/*********************************************************************************/
		
		jf.add(jb1=new JButton("North"),BorderLayout.NORTH);
		jf.add(jb2=new JButton("South"),BorderLayout.SOUTH);
		jf.add(jb3=new JButton("East"),BorderLayout.EAST);
		jf.add(jb4=new JButton("West"),BorderLayout.WEST);
		jf.add(jb5=new JButton("Center"),BorderLayout.CENTER);
		
		/********************************************************************************/
		jf.setSize(850, 700);
		//jf.setSize(con.getIconWidth(), con.getIconWidth());
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// best way
		//jf.setLocation(100, 100);
		jf.setLocationRelativeTo(null);
		jf.setIconImage(Toolkit.getDefaultToolkit().getImage("img/bck.jpg"));
		jf.setResizable(false);
	}

	public static void main(String[] args) {
		new Test19();
	}
	public void actionPerformed(ActionEvent ae) {
		
		
	}
}
