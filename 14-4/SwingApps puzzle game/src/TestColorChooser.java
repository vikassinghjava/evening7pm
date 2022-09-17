import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;


public class TestColorChooser extends JFrame  implements ActionListener
{
	JButton jb;
	public TestColorChooser()
	{
		getContentPane().setLayout(new FlowLayout());
		
		getContentPane().add(jb=new JButton("Choose Color"));
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(3);
		jb.addActionListener(this);
	}
	public static void main(String[] args)
	{
		new TestColorChooser();
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		JColorChooser jc=new JColorChooser();
		Color col=jc.showDialog(this, "Select Color",null);
			getContentPane().setBackground(col);
			jb.setForeground(col);
	}

}
