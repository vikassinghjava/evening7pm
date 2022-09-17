import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
public class Login extends JFrame implements ActionListener
{		Container con;
		JLabel id,name,job,pass;
		JTextField idf,namef,jobf,passf;
	
		JButton insert,update,select,delete;
		public Login()
		{
			con=getContentPane();
			con.setLayout(null);
			
			con.add(id=new JLabel("id"));
			con.add(name=new JLabel("Name"));
			con.add(job=new JLabel("Job"));
			con.add(pass=new JLabel("Password"));
			
			id.setBounds(100, 100, 100,60);
			name.setBounds(100, 150, 100,60);
			job.setBounds(100, 200, 100,60);
			pass.setBounds(100, 250, 100,60);
			
			con.add(idf=new JTextField());
			con.add(namef=new JTextField());
			con.add(jobf=new JTextField());
			con.add(passf=new JTextField());
			
			idf.setBounds(200, 100, 200, 40);
			namef.setBounds(200, 150, 200, 40);
			jobf.setBounds(200, 200, 200, 40);
			passf.setBounds(200, 250, 200, 40);
			
			con.add(insert=new JButton("Insert"));
			con.add(update=new JButton("Update"));
			con.add(delete=new JButton("Delete"));
			con.add(select=new JButton("Select"));
			insert.setBounds(50, 300, 80, 40);
			update.setBounds(150, 300, 80, 40);
			delete.setBounds(250, 300, 80, 40);
			select.setBounds(350, 300, 80, 40);
			
			setSize(500, 500);
			setVisible(true);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		    insert.addActionListener(this); update.addActionListener(this);
		    select.addActionListener(this); delete.addActionListener(this);
		}		    
		public static void main(String[] args) {
			new Login();
		}
			@Override
			public void actionPerformed(ActionEvent e)
		    {
				
			} 
		
		
}
