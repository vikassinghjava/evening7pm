import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Home extends JFrame implements ActionListener
{

	JButton login,signup;
	Home()
	{
		setLayout(null);
		add(login=new JButton("Login"));
		add(signup=new JButton("Signup"));
		
		login.setBounds(200, 200, 100,40);
		signup.setBounds(200, 300, 100,40);
		
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(3);
		setLocationRelativeTo(null);
		
		login.addActionListener(this);
		signup.addActionListener(this);
		
	}
	public static void main(String[] args)
	{
		new Home();
	}
	
	public void actionPerformed(ActionEvent ae)
	{
			if(ae.getSource()==login)
			{
				new Login();// login page will be open
				this.dispose();//like hide
			}
			if(ae.getSource()==signup)
			{
				new Signup();//signup page will be open!!
				this.dispose();
			}
			
	}
	
	
}
