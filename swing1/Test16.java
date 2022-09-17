import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class Test16 {
	JFrame jf;
	JLabel jl;
	JLabel jl1;
	JButton jb1;
	JTextArea ta;

	Test16() {
		jf = new JFrame();

		// set the background image
		Icon con;
		jf.setContentPane(jl = new JLabel(con=new ImageIcon("img/gamebck.jpg")));

		// set the background color of frame
		// jf.getContentPane().setBackground(Color.CYAN);

		// remove the default layout manager
		jf.setLayout(null);
		/*********************************************************************************/
		//jf.add(jl1 = new JLabel("Name"));
		//jf.add(jl1 = new JLabel(new ImageIcon("img//bck.jpg")));
		//jl1.setBounds(100, 100, 100, 30);

		jf.add(jb1=new JButton(new ImageIcon("img/bck.jpg")));
		jb1.setBounds(100, 500, 100, 30);
		
		/********************************************************************	*************/

		//jf.setSize(450, 500);
		jf.setSize(con.getIconWidth(), con.getIconWidth());
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// best way
		jf.setLocation(100, 100);
		jf.setIconImage(Toolkit.getDefaultToolkit().getImage("img/bck.jpg"));
		jf.setResizable(false);
	}

	public static void main(String[] args) {
		new Test16();
	}

}
