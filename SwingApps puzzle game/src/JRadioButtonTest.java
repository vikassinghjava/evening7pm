import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
public class JRadioButtonTest extends JFrame implements ActionListener
{	  JRadioButton jr[]=new JRadioButton[3];
     JLabel jl;
	 Container con;
	 JRadioButtonTest()
	 {	con=getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.CENTER,40,40));
		con.add(jr[0]=new JRadioButton("yes"));
		con.add(jr[1]=new JRadioButton("no"));
		con.add(jr[2]=new JRadioButton("other"));
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(jr[0]);
		bg.add(jr[1]);
		bg.add(jr[2]);
		
		con.add(jl=new JLabel(""));
		 
		 setSize(500, 500);
		 setVisible(true);
		 setDefaultCloseOperation(3);
		 for (int i = 0; i < jr.length; i++)
		 {
		    jr[i].addActionListener(this);	
		 }
	 } 
		public void actionPerformed(ActionEvent e) 
		{	   if(jr[0].isSelected()==true)
			   {
				   jl.setText(jr[0].getText());
			   }
			   if(jr[1].isSelected()==true)
			   {
				   jl.setText(jr[1].getText());
			   }
			   if(jr[2].isSelected()==true)
			   {
				   jl.setText(jr[2].getText());
			   }
		}
	public static void main(String[] args) 
	{
		new JRadioButtonTest();
	}

}
