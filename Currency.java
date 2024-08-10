import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="Currency.class" width="400" height="400">
</applet>
*/
public class Currency extends Applet implements ActionListener
{
Label a,b,f;
TextField c;
Button d,e;
public void init()
{
setLayout(null);
a=new Label("INR to USD Converter");
b=new Label("Amount In INR : ");
c=new TextField();
d=new Button("CONVERT");
e=new Button("RESET");
f=new Label();
add(a);
add(b);
add(c);
add(d);
add(e);
add(f);
a.setBounds(50,50,200,30);
b.setBounds(50,100,100,30);
c.setBounds(170,100,100,30);
d.setBounds(50,150,100,30);
e.setBounds(170,150,100,30);
f.setBounds(50,200,200,30);
d.addActionListener(this);
e.addActionListener(this);
}
public void actionPerformed(ActionEvent e1)
{
String s=e1.getActionCommand();
if(s.equals("CONVERT"))
{
float p= Float.parseFloat(c.getText());
float q=p/64.0f;
String s1="Amount In USD:" + q;
f.setText(s1);
}
if(s.equals("RESET"))
{
c.setText("");
f.setText("");
}
}
}



