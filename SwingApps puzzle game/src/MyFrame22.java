import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class MyFrame22 extends JFrame implements ItemListener,ListSelectionListener
{	
			
		JComboBox jcm;
		JList jlst;
		JTextArea ta;
		Container con;
		public MyFrame22()
		{
			    con=getContentPane();
				con.setLayout(new FlowLayout());
				
				con.add(jcm=new JComboBox());
				jcm.addItem("India");
				jcm.addItem("Afganistan");
				jcm.addItem("Nigieria");
				jcm.addItem("nepal");
				jcm.addItemListener(this);			
								
				String items[]={"c","c++","java","html","CSS","JS"};
				con.add(jlst=new JList(items));
				jlst.setBackground(Color.pink);
				jlst.addListSelectionListener(this);
				
				con.add(ta=new JTextArea(10, 10));
				ta.setBackground(Color.cyan);
				
				setSize(500, 500);
				setVisible(true);
			    setDefaultCloseOperation(3);
			    
		}
		
		
	public static void main(String[] args)
	{
				new MyFrame22();
	}
	
	public void itemStateChanged(ItemEvent arg0) 
	{
			String item=(String)jcm.getSelectedItem();
			JOptionPane.showMessageDialog(this, item);
	}
	
	public void valueChanged(ListSelectionEvent l) 
	{
			//String item=(String)jlst.getSelectedValue();
			//ta.setText(item);
		   Object items[]=jlst.getSelectedValues();
		   
		   String store="";
		   for (int i = 0; i < items.length; i++)
		   {
			store=store+items[i]+"\n";
		   }
		   ta.setText(store);
	}
	


}









