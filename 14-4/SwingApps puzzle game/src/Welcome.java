import java.awt.Color;
import java.awt.Container;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

public class Welcome extends JFrame implements Runnable
{
	private JLabel welcome;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    
    private JLabel micky;
    private JProgressBar jProgressBar1;
    
    Icon img1;
    ImageIcon ioc1;
    Container c;
    Thread t;
    int i=0;
    
    public Welcome(String title) 
    {
    	super(title);
        welcome = new JLabel();
        jLabel2 = new JLabel();

        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jProgressBar1 = new JProgressBar();
        
        micky = new JLabel();
        
        
        img1= new ImageIcon("F:/study/Project/new/src/img/micky.gif");
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        c=getContentPane();
	    welcome.setFont(new java.awt.Font("Segoe UI", 3, 50)); 
        welcome.setText("Welcome");
        getContentPane().add(welcome);
        welcome.setBounds(500, 90, 500, 100);
        
        micky.setIcon(img1);
        getContentPane().add(micky);
        micky.setBounds(20, 20, 400, 450);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 50));
        jLabel2.setText("To");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(560, 150, 100, 80);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 50)); 
        jLabel3.setText("Cake");
        jLabel3.setForeground(Color.red);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(530, 200, 150, 80);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 50)); 
        jLabel4.setText("Ordering System");
        jLabel4.setForeground(Color.red);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(430, 250, 500, 80);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(00, 200, 900, 35);

        c.setBackground(Color.white);
        
        t =new Thread(this);
        t.start();
        		
        setVisible(true);
        setSize(1000, 400);
       // setSize(Toolkit.getDefaultToolkit().getScreenSize());
        
        
    }
    public void run()
    {
    	try{
    		for(i=0;i<=100;i++)
    		{
    			jProgressBar1.setValue(i);
    			Thread.sleep(10);
    		}
    		dispose();
    		//new Login("Login Panel");
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        new Welcome("Cake Ordering System");
    }
}
