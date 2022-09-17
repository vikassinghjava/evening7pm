import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class JcheckBoxTest extends JFrame implements ActionListener
{	//JCheckBox ch1,ch2,ch3;
	JCheckBox ch[]=new JCheckBox[3];
    JLabel jl;
	Container con;
	 JcheckBoxTest()
	 {	 con=getContentPane();
		 con.setLayout(new FlowLayout(FlowLayout.CENTER,40,40));
		 con.add(ch[0]=new JCheckBox("java"));
		 con.add(ch[1]=new JCheckBox("bigdata"));
		 con.add(ch[2]=new JCheckBox("hadoop"));
			
		 con.add(jl=new JLabel(""));
		 setSize(500, 500);
		 setVisible(true);
		 setDefaultCloseOperation(3);
		 for (int i = 0; i < ch.length; i++)
		 {
		    ch[i].addActionListener(this);	
		 }
	 } 
	
		public void actionPerformed(ActionEvent e) 
		{
			   if(ch[0].isSelected()==true)
			   {
				   jl.setText(ch[0].getText());
			   }
			   if(ch[1].isSelected()==true)
			   {
				   jl.setText(ch[1].getText());
			   }
			   if(ch[2].isSelected()==true)
			   {
				   jl.setText(ch[2].getText());
			   }
		}
	public static void main(String[] args) 
	{
		new JcheckBoxTest();
	}

}
