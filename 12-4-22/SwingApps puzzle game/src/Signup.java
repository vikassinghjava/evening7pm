import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


public class Signup extends JFrame
{
	Container con;
	JLabel id,pass,eml;
	JTextField idf,email;
	JPasswordField jp;
	JButton signup;
	public Signup()
	{
		con=getContentPane();
		con.setLayout(null);
		
		con.add(id=new JLabel("Name"));
		con.add(pass=new JLabel("Password"));
		con.add(eml=new JLabel("Email"));
		
		id.setBounds(100, 100, 100,60);
		pass.setBounds(100, 200, 100,60);
		eml.setBounds(100, 300, 100, 60);
		
		con.add(idf=new JTextField(""));
		con.add(jp=new JPasswordField());
		con.add(email=new JPasswordField());
		
		idf.setBounds(200, 100, 200, 40);
		jp.setBounds(200, 200, 200, 40);
		email.setBounds(200, 300, 200, 40);
		
		con.add(signup=new JButton("signup"));
		signup.setBounds(200, 400, 200, 40);
		
		setSize(500, 500);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args)
	{
	  new Signup();	
	}
	

}
