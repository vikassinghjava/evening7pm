import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
public class Notepad extends JFrame  implements ActionListener
{
	JMenuBar jm;
	JMenu fileMenu,editMenu;
	JMenuItem cut,copy,paste,select,open,save,saveas;
	JTextArea ta;
	Container con;
	public Notepad()
	{
		try
		{
		   ///UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			//UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
		}
		catch(Exception ex){}
		
		//step 1
	  getContentPane().add(BorderLayout.NORTH,jm=new JMenuBar());
	 // con=getContentPane();
	 // con.add(BorderLayout.NORTH,jm=new JMenuBar());
	  
	  //step 2
	  jm.add(fileMenu=new JMenu("File")); jm.add(editMenu=new JMenu("Edit"));
	     
	  fileMenu.add(open=new JMenuItem("Open",new ImageIcon("img\\open.png")));
	  fileMenu.add(save=new JMenuItem("Save",new ImageIcon("img\\save.png")));
	  fileMenu.add(saveas=new JMenuItem("Save As",new ImageIcon("img\\saveas.png")));
	  
	  fileMenu.setMnemonic('f');
	  save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_MASK));
	  
	  
	  //step 3
	  editMenu.add(cut=new JMenuItem("Cut",new ImageIcon("img\\cut.png")));
	  editMenu.add(copy=new JMenuItem("Copy",new ImageIcon("img\\copy.png")));
	  editMenu.add(paste=new JMenuItem("Paste",new ImageIcon("img\\paste.png")));
	  editMenu.add(select=new JMenuItem("Select All",new ImageIcon("img\\select.png")));
	  editMenu.setMnemonic('e');
	  
	  cut.setMnemonic('c');
	  copy.setMnemonic('o');
	  paste.setMnemonic('P');
	  select.setMnemonic('a');
	  
	  ta=new JTextArea();
	  getContentPane().add(BorderLayout.CENTER,new JScrollPane(ta));
	  
	  setSize(500, 500);
	  setVisible(true);
	  setDefaultCloseOperation(3);
	  cut.addActionListener(this); copy.addActionListener(this);
	  paste.addActionListener(this); select.addActionListener(this);
	  open.addActionListener(this); save.addActionListener(this);
	  saveas.addActionListener(this);
	  
	  
		
	}
	public static void main(String[] args)
	{
		new Notepad();
	}
	
	public void actionPerformed(ActionEvent e) 
	{		if(e.getSource()==cut)
			{
				ta.cut();
			}
			if(e.getSource()==copy)
			{
				ta.copy();
			}
			if(e.getSource()==paste)
			{
				ta.paste();
			}
			if(e.getSource()==select)
			{
				ta.selectAll();
			}
			if(e.getSource()==open)
			{
				
				try{
					JFileChooser jf=new JFileChooser();
							jf.showOpenDialog(this);
					File f=jf.getSelectedFile();		
			BufferedReader br=new BufferedReader(new FileReader(f));
		    String str="",store="";
			   while((str=br.readLine())!=null)
			   {
				   store=store+str+"\n";
			   }
				ta.setText(store);
				
				}catch(Exception ex){ex.printStackTrace();}
			}
			
			if(e.getSource()==save)
			{
				try{
					JFileChooser jf=new JFileChooser();
							jf.showSaveDialog(this);
				String data=ta.getText();
				
				File f=jf.getSelectedFile();	
				FileWriter fw=new FileWriter(f);
							fw.write(data);
				fw.close();
					
				}catch(Exception ex){ex.printStackTrace();}
				
			}
			
	}
	
	

	
	
	
	
	
	
	
	
	
}
