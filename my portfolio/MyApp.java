import java.applet.*;
import java.awt.*;
/*
  <applet code="myapp.class" height="300" width="300"></applet>
 */
public class MyApp extends applet{
    public void init()
    {
      setBackground(Color.yellow);
    }
    public void paint (Graphics g)
    {
        g.drawString("hello applet",100,100);
    }
}
public class MyApp extends applet{
    public void init()
    {
      setBackground(Color.yellow);
    }
    public void paint (Graphics g)
    {
 Font f=new Font("arial",FONT.BOLD,36);
 g.setFont(f);
 g.setColor(Color.green);
 g.drawString("hello",100,100);
    }
}
public class myapp extends applet implements actionlistner
{
    public void init()
    {
        Button b=new Button("click");
        b.setBounds(100,100,100,100);
        add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        Appletcontext apx=getAppletcontext();
        applet a=apx.getApplet("response");
        Font f=new Font();
        a.setfont(f);
        

    }
}

