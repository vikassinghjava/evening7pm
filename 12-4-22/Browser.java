import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
import java.net.*;
import java.io.*;
public class Browser extends JFrame implements HyperlinkListener,ActionListener
{
  public static void main(String[] args)
  {
      if(args.length==0)
      new Browser("http://www.google.co.in/");
      else
      new Browser(args[0]);// ur choice web
  }
   //private JIconButton homeButton;
   private JTextField urlField;
   private JEditorPane htmlPane;// used to show html content
   private String initialURL;  // ur url name
   public Browser(String initialURL)
   {
      super("SimpleSwingBrowser");
      this.initialURL=initialURL;
     // addWindowListener(new ExitListener());
      //WindowUtilities.setNativeLookAndFeel();
      JPanel topPanel=new JPanel();
      topPanel.setBackground(Color.lightGray);
      JLabel urlLabel=new JLabel("URL");
      urlField=new JTextField(30);     
      urlField.setText(initialURL);
      urlField.addActionListener(this);
      topPanel.add(urlLabel);
      topPanel.add(urlField);
      getContentPane().add(topPanel,BorderLayout.NORTH);
      
      try
      {
        htmlPane=new JEditorPane(initialURL);
        htmlPane.setEditable(false);
        htmlPane.addHyperlinkListener(this);
        
        JScrollPane ScrollPane=new JScrollPane(htmlPane);
        getContentPane().add(ScrollPane,BorderLayout.CENTER);
      }
      catch(IOException ioe)
      {
         warnUser("Can't build HTML pane for" + initialURL + ":" + ioe);
      }
       Toolkit t=getToolkit();
       Dimension screenSize=t.getScreenSize();
       int width=screenSize.width*8/10;
       int height=screenSize.height*8/10;
       setBounds(width/8,height/8,width,height);
       setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String url;
        if(e.getSource()==urlField)
        url=urlField.getText();
        else//Clicked "home" button instead of entering URL
        url=initialURL;
        try
        {
          htmlPane.setPage(new URL(url));
          urlField.setText(url);
         }
        catch(IOException ioe)
        {
            warnUser("Can't follow link to" + url + ":" + ioe);
        }
    }
    public void hyperlinkUpdate(HyperlinkEvent event)
    {
        if(event.getEventType()==HyperlinkEvent.EventType.ACTIVATED)
        {
           try
           {
            htmlPane.setPage(event.getURL());
            urlField.setText(event.getURL().toExternalForm());
           }
           catch(IOException ioe)
           {
                warnUser("Can't follow link to" + event.getURL().toExternalForm() + ":" + ioe);
           }
         }
      }
     private void warnUser(String message)
     {
        JOptionPane.showMessageDialog(this,message,"Error",JOptionPane.ERROR_MESSAGE);
     }
}