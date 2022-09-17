import java.awt.*;

import javax.swing.*;
public class MyFrame17 extends JFrame
{	
	
		public MyFrame17()
		{		
				setLayout(new FlowLayout());
				getContentPane().add(new JButton("Click!!!"));
			    setSize(500, 500);
				setDefaultCloseOperation(3);
				setVisible(true);
				
		}
		
		public void paint(Graphics g)
		{
			    super.paint(g);
				Toolkit t=Toolkit.getDefaultToolkit();
			    Image img =t.getImage("e:\\wall.jpg");
				//g.drawImage(img, 0,0,500,500,this);//img,x,y,w,h,ImageObserver
			    g.drawImage(img, 0,0,img.getWidth(this),img.getHeight(this),this);
		}
		
		
	public static void main(String[] args)
	{
				MyFrame17 m=new MyFrame17();
				m.setVisible(true);
				
	}
	


}









