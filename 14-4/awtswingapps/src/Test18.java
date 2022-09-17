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

public class Test18 implements ActionListener {
	JFrame jf;
	JLabel jl,jl2;
	JButton jb1,jb2;
	Icon image;
	static int index=0;
	File f;
	File listFiles[];
	
	Test18() {
		f=new File("img");
		listFiles=f.listFiles();
		jf = new JFrame();
		Icon con;
		jf.setContentPane(jl = new JLabel(con=new ImageIcon("img/gamebck.jpg")));
		jf.setLayout(null);
		/*********************************************************************************/
		jf.add(jl2=new JLabel(image=new ImageIcon("")));
		jl2.setBounds(100, 100,500, 500);
		jf.add(jb1=new JButton("Previous"));
		jf.add(jb2=new JButton("Next"));
		
		jb1.setBounds(100, 500, 100, 30);
		jb2.setBounds(600, 500, 100, 30);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		
		
		/********************************************************************	*************/
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
		new Test18();
	}
	public void actionPerformed(ActionEvent ae) {
		
		 if(ae.getSource()==jb2) {
			  jl2.setIcon(new ImageIcon("img//"+listFiles[index].getName()));
			  index=index+1;
		  }
		  
		  if(ae.getSource()==jb1) {
			  jl2.setIcon(new ImageIcon("img//"+listFiles[index].getName()));
			  index=index-1;
		  }
		 
	}
}
