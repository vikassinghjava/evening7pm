import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
class Picture_Puzzle extends WindowAdapter implements ActionListener
{
	JFrame  f;
	JButton[] b=new JButton[16];
	JButton reButton;
	JButton click;
	int click_counter=1;
	Label iml;
	int reflag=0;
	int place_count=0;
	JButton change_image;
	JComboBox<String> imgs_combo;
	int image_count=0;
	JPanel p;
	JLabel imag_label;
	Font reButton_font;
	Border bo;
	Picture_Puzzle()
	{
		f=new JFrame();
		f.setSize(300,440);
		p=new JPanel();
		p.setLayout(null);
		f.add(p);
		f.setTitle("RUZZLE");
		imgs_combo=new JComboBox<>();
		imgs_combo.setBounds(100,370,100,20);
		p.add(imgs_combo);
		imgs_combo.addItem("RockStar");
		imgs_combo.addItem("Totoro");
		imgs_combo.addItem("Minion");
		p.add(imgs_combo);
		reButton=new JButton("SHUFFLE");
		reButton_font=new Font("Consolas",Font.BOLD,16);
		reButton.setFont(reButton_font);
		reButton.setBounds(25,290,100,40);
		change_image=new JButton("Change Image");
		imag_label=new JLabel("Pictures:");
		imag_label.setBounds(20,370,100,20);
		p.add(imag_label);
		click=new JButton("Clicks::");
		Border etched=BorderFactory.createEtchedBorder(EtchedBorder.LOWERED,Color.cyan,Color.blue);
		bo=BorderFactory.createTitledBorder(etched,"RUZZLE",TitledBorder.CENTER,TitledBorder.TOP);
		imag_label.setFont(reButton_font);
		Border line=BorderFactory.createLineBorder(Color.darkGray,2);
		imgs_combo.setBorder(line);
		p.setBorder(bo);
		reButton.setBorder(line);
		click.setBorder(line);
		p.setBackground(Color.white);
		click.setBounds(155,289,110,42);
		f.setResizable(false);
		f.getContentPane().setBackground(Color.white);
		p.setLayout(null);
		f.addWindowListener(this);
		b[0]=new JButton("");
		for(int i=1;i<16;i++)

			b[i]=new JButton("",new ImageIcon("rstar\\b["+(i)+"]"+".png"));
		
		int x=25,y=40;
		int k=0;
		for(int i=0;i<16;i++)
		{
			b[i].setBounds(x+60*k++,y,60,60);
			if((i+1)%4==0)
			{
				y=y+60;
			    k=0;
			}
		}
		p.add(click);
		p.add(reButton);
		for(int i=0;i<16;i++)
			p.add(b[i]);		
		f.setVisible(true);
		for(int i=0;i<=15;i++)
		{
			b[i].addActionListener(this);
		}
		reButton.addActionListener(this);
		change_image.addActionListener(this);
		imgs_combo.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b[0])
			{
				ImageIcon ii=(ImageIcon)b[0].getIcon();
				if(b[1].getIcon()==(null))
				{
					b[0].setIcon(b[1].getIcon());
					b[1].setIcon(ii);
					click.setText("Clicks::"+String.valueOf(click_counter++));
					this.wonInfoShow();
				}
				else if(b[4].getIcon()==(null))
				{
					b[0].setIcon(b[4].getIcon());
					b[4].setIcon(ii);
					click.setText("Clicks::"+String.valueOf(click_counter++));
					this.wonInfoShow();
				}
			}
		for(int i=1;i<=2;i++)
		{
			if(e.getSource()==b[i])
			{
				ImageIcon ii=(ImageIcon)b[i].getIcon();
				if(b[i+1].getIcon()==(null))
				{
					b[i].setIcon(b[i+1].getIcon());
					b[i+1].setIcon(ii);
					click.setText("Clicks::"+String.valueOf(click_counter++));
					this.wonInfoShow();
				}
				else if(b[i+4].getIcon()==(null))
				{
					b[i].setIcon(b[i+4].getIcon());
					b[i+4].setIcon(ii);
					click.setText("Clicks::"+String.valueOf(click_counter++));
					this.wonInfoShow();
				}
				if(b[i-1].getIcon()==null)
				{
					b[i].setIcon((ImageIcon)b[i-1].getIcon());
					b[i-1].setIcon(ii);
					click.setText("Clicks::"+String.valueOf(click_counter++));
					this.wonInfoShow();
				}
			}
		}
		if(e.getSource()==b[3])
		{
			ImageIcon ii=(ImageIcon)b[3].getIcon();
			if(b[2].getIcon()==(null))
			{
				b[3].setIcon(b[2].getIcon());
				b[2].setIcon(ii);
				click.setText("Clicks::"+String.valueOf(click_counter++));
				this.wonInfoShow();
			}
			else if(b[7].getIcon()==(null))
			{
				b[3].setIcon(b[7].getIcon());
				b[7].setIcon(ii);
				click.setText("Clicks::"+String.valueOf(click_counter++));
				this.wonInfoShow();
			}
		}
		
		if(e.getSource()==b[4])
		{
			ImageIcon ii=(ImageIcon)b[4].getIcon();
			if(b[5].getIcon()==(null))
			{
				b[4].setIcon(b[5].getIcon());
				b[5].setIcon(ii);
				click.setText("Clicks::"+String.valueOf(click_counter++));
				this.wonInfoShow();
			}
			else if(b[8].getIcon()==(null))
			{
				b[4].setIcon(b[8].getIcon());
				b[8].setIcon(ii);
				click.setText("Clicks::"+String.valueOf(click_counter++));
				this.wonInfoShow();
			}
			if(b[0].getIcon()==(null))
			{
				b[4].setIcon(b[0].getIcon());
				b[0].setIcon(ii);
				click.setText("Clicks::"+String.valueOf(click_counter++));
				this.wonInfoShow();				
			}
		}
		for(int i=5;i<=6;i++)
		{
			if(e.getSource()==b[i])
			{
				ImageIcon ii=(ImageIcon)b[i].getIcon();
				if(b[i+1].getIcon()==(null))
				{
					b[i].setIcon(b[i+1].getIcon());
					b[i+1].setIcon(ii);
					click.setText("Clicks::"+String.valueOf(click_counter++));
					this.wonInfoShow();
				}
				else if(b[i+4].getIcon()==(null))
				{
					b[i].setIcon(b[i+4].getIcon());
					b[i+4].setIcon(ii);
					click.setText("Clicks::"+String.valueOf(click_counter++));
					this.wonInfoShow();
				}
				if(b[i-1].getIcon()==(null))
				{
					b[i].setIcon(b[i-1].getIcon());
					b[i-1].setIcon(ii);
					click.setText("Clicks::"+String.valueOf(click_counter++));
					this.wonInfoShow();
				}
				if(b[i-4].getIcon()==(null))
				{
					b[i].setIcon(b[i-4].getIcon());
					b[i-4].setIcon(ii);
					click.setText("Clicks::"+String.valueOf(click_counter++));
					this.wonInfoShow();
				}
			}
		}
		if(e.getSource()==b[7])
		{
			ImageIcon ii=(ImageIcon)b[7].getIcon();
			if(b[6].getIcon()==(null))
			{
				b[7].setIcon(b[6].getIcon());
				b[6].setIcon(ii);
				click.setText("Clicks::"+String.valueOf(click_counter++));
				this.wonInfoShow();
			}
			else if(b[11].getIcon()==(null))
			{
				b[7].setIcon(b[11].getIcon());
				b[11].setIcon(ii);
				click.setText("Clicks::"+String.valueOf(click_counter++));
				this.wonInfoShow();
			}
			else if(b[3].getIcon()==(null))
			{
				b[7].setIcon(b[3].getIcon());
				b[3].setIcon(ii);
				click.setText("Clicks::"+String.valueOf(click_counter++));
				this.wonInfoShow();
			} 
		}
		if(e.getSource()==b[8])
		{
			ImageIcon ii=(ImageIcon)b[8].getIcon();
			if(b[9].getIcon()==(null))
			{
				b[8].setIcon(b[9].getIcon());
				b[9].setIcon(ii);
				click.setText("Clicks::"+String.valueOf(click_counter++));
				this.wonInfoShow();
			}
			else if(b[12].getIcon()==(null))
			{
				b[8].setIcon(b[12].getIcon());
				b[12].setIcon(ii);
				click.setText("Clicks::"+String.valueOf(click_counter++));
				this.wonInfoShow();
			}
			if(b[4].getIcon()==(null))
			{
				b[8].setIcon(b[4].getIcon());
				b[4].setIcon(ii);
				click.setText("Clicks::"+String.valueOf(click_counter++));
				this.wonInfoShow();
			}
		}
		for(int i=9;i<=10;i++)
		{
			if(e.getSource()==b[i])
			{
				ImageIcon ii=(ImageIcon)b[i].getIcon();
				if(b[i+1].getIcon()==(null))
				{
					b[i].setIcon(b[i+1].getIcon());
					b[i+1].setIcon(ii);
					click.setText("Clicks::"+String.valueOf(click_counter++));
					this.wonInfoShow();
				}
				else if(b[i+4].getIcon()==(null))
				{
					b[i].setIcon(b[i+4].getIcon());
					b[i+4].setIcon(ii);
					click.setText("Clicks::"+String.valueOf(click_counter++));
					this.wonInfoShow();
				}
				if(b[i-1].getIcon()==(null))
				{
					b[i].setIcon(b[i-1].getIcon());
					b[i-1].setIcon(ii);
					click.setText("Clicks::"+String.valueOf(click_counter++));
					this.wonInfoShow();
				}
				if(b[i-4].getIcon()==(null))
				{
					b[i].setIcon(b[i-4].getIcon());
					b[i-4].setIcon(ii);
					click.setText("Clicks::"+String.valueOf(click_counter++));
					this.wonInfoShow();
				}
			}
		}
		if(e.getSource()==b[11])
		{
			ImageIcon ii=(ImageIcon)b[11].getIcon();
			if(b[10].getIcon()==(null))
			{
				b[11].setIcon(b[10].getIcon());
				b[10].setIcon(ii);
				click.setText("Clicks::"+String.valueOf(click_counter++));
				this.wonInfoShow();
			}
			else if(b[15].getIcon()==(null))
			{
				b[11].setIcon(b[15].getIcon());
				b[15].setIcon(ii);
				click.setText("Clicks::"+String.valueOf(click_counter++));
				this.wonInfoShow();
			}
			else if(b[7].getIcon()==(null))
			{
				b[11].setIcon(b[7].getIcon());
				b[7].setIcon(ii);
				click.setText("Clicks::"+String.valueOf(click_counter++));
				this.wonInfoShow();
			}			
		}
		if(e.getSource()==b[12])
		{
			ImageIcon ii=(ImageIcon)b[12].getIcon();
			if(b[13].getIcon()==(null))
			{
				b[12].setIcon(b[13].getIcon());
				b[13].setIcon(ii);
				click.setText("Clicks::"+String.valueOf(click_counter++));
				this.wonInfoShow();
			}
			if(b[8].getIcon()==(null))
			{
				b[12].setIcon(b[8].getIcon());
				b[8].setIcon(ii);
				click.setText("Clicks::"+String.valueOf(click_counter++));
				this.wonInfoShow();
			}
		}
		for(int i=13;i<=14;i++)
		{
			if(e.getSource()==b[i])
			{
				ImageIcon ii=(ImageIcon)b[i].getIcon();
				if(b[i+1].getIcon()==(null))
				{
					b[i].setIcon(b[i+1].getIcon());
					b[i+1].setIcon(ii);
					click.setText("Clicks::"+String.valueOf(click_counter++));
					this.wonInfoShow();
				}
				else if(b[i-4].getIcon()==(null))
				{
					b[i].setIcon(b[i-4].getIcon());
					b[i-4].setIcon(ii);
					click.setText("Clicks::"+String.valueOf(click_counter++));
					this.wonInfoShow();
				}
				if(b[i-1].getIcon()==(null))
				{
					b[i].setIcon(b[i-1].getIcon());
					b[i-1].setIcon(ii);
					click.setText("Clicks::"+String.valueOf(click_counter++));
					this.wonInfoShow();
				}
			}
		
		}
		if(e.getSource()==b[15])
		{
			ImageIcon ii=(ImageIcon)b[15].getIcon();
			if(b[14].getIcon()==(null))
			{
				b[15].setIcon(b[14].getIcon());
				b[14].setIcon(ii);
				click.setText("Clicks::"+String.valueOf(click_counter++));
				this.wonInfoShow();
			}
			else if(b[11].getIcon()==(null))
			{
				b[15].setIcon(b[11].getIcon());
				b[11].setIcon(ii);
				click.setText("Clicks::"+String.valueOf(click_counter++));
				this.wonInfoShow();
			}
		}
		if(e.getSource()==reButton)
		{
			reflag=1;
			click_counter=1;
			click.setText("*");
			{
				ImageIcon ii=(ImageIcon)b[4].getIcon();
				b[4].setIcon(b[15].getIcon());
				b[15].setIcon(ii);
			}
			{
				ImageIcon ii=(ImageIcon)b[8].getIcon();
				b[8].setIcon(b[11].getIcon());
				b[11].setIcon(ii);
			}
			{
				ImageIcon ii=(ImageIcon)b[4].getIcon();
				b[4].setIcon(b[11].getIcon());
				b[11].setIcon(ii);
			}
			{
				ImageIcon ii=(ImageIcon)b[7].getIcon();
				b[7].setIcon(b[8].getIcon());
				b[8].setIcon(ii);
			}
			{
				ImageIcon ii=(ImageIcon)b[12].getIcon();
				b[12].setIcon(b[13].getIcon());
				b[13].setIcon(ii);
			}
		}
		
			if(e.getSource()==imgs_combo)
			{
				if((imgs_combo.getItemAt(imgs_combo.getSelectedIndex()))=="Totoro")
				{
					for(int i=1;i<16;i++)
						b[i].setIcon(new ImageIcon("totoro\\b["+i+"]"+".png"));
				}
				else if((imgs_combo.getItemAt(imgs_combo.getSelectedIndex()))=="Minion")
				{
					for(int i=1;i<16;i++)
						b[i].setIcon(new ImageIcon("minion\\b["+i+"]"+".png"));
							image_count++;
				}
				else if((imgs_combo.getItemAt(imgs_combo.getSelectedIndex()))=="RockStar")
					for(int i=1;i<16;i++)
						b[i].setIcon(new ImageIcon("rstar\\b["+i+"]"+".png"));
				b[0].setIcon(null);
				click_counter=0;
				click.setText("0");
			}
	}
		public void wonInfoShow()
		{
		/*	for(int i=0;i<15;i++)
				if(b[i].getText()==(""+(i+1)))
					place_count++;
			if(place_count==15&&reflag==1&&b[15].getIcon()==(null))
			//	f.add(won);*/
		}
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	public static void main(String ARGS[])
	{
		Picture_Puzzle p=new Picture_Puzzle();
	}
	
}