import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;
public class MyFrame30 extends JFrame implements MouseMotionListener
{		public MyFrame30()
		{		
				setLayout(null);
				getContentPane().setBackground(Color.cyan);
				
				setSize(500, 500);
				setVisible(true);
			    setDefaultCloseOperation(3);
			    
			    addMouseMotionListener(this);
			    
		}	
		
		
	public static void main(String[] args)
	{
				new MyFrame30();
	}



	public void mouseDragged(MouseEvent me)
	{
		Graphics g=getGraphics();
		g.setColor(Color.WHITE);
		//g.fillOval(me.getX(), me.getY(), 50, 50);
		
		Toolkit t=Toolkit.getDefaultToolkit();
	    Image img =t.getImage("e:\\wall.jpg");
		//g.drawImage(img, 0,0,500,500,this);//img,x,y,w,h,ImageObserver
	    g.drawImage(img, me.getX(),me.getY(),100,100,this);
	}
	
	public void mouseMoved(MouseEvent me) 
	{
	
		
	}
	
	
		

}









