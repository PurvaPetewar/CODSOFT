


import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="GradeCal.class" width="600" height="600">
</applet>
*/
public class GradeCal extends Applet implements ActionListener
{
Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
TextField t1,t2,t3,t4,t5,t6,t7,t8;
Button b1,b2;
public void init()
{
setLayout(null);
l1=new Label("Grade CALCULATOR");
l2=new Label("Subject");
l3=new Label("Score");
l4=new Label("Out OF");
l5=new Label("Math");
l6=new Label("Science");
l7=new Label("English");
l8=new Label("Marathi");
l9=new Label("Social Sci");
l10=new Label("100");
l11=new Label("100");
l12=new Label("100");
l13=new Label("100");
l14=new Label("100");
l15=new Label("Total");
l16=new Label("Percentage");
l17=new Label("GRADE");
t1=new TextField();
t2=new TextField();
t3=new TextField();
t4=new TextField();
t5=new TextField();
t6=new TextField();
t7=new TextField();
t8=new TextField();
b1=new Button("CALCULATE");
b2=new Button("RESET");
add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);
add(l8);
add(l9);
add(l10);
add(l11);
add(l12);
add(l13);
add(l14);
add(l15);
add(l16);
add(l17);
add(t1);
add(t2);
add(t3);
add(t4);
add(t5);
add(t6);
add(t7);
add(t8);
add(b1);
add(b2);
l1.setBounds(50,50,150,30);
l2.setBounds(70,100,100,30);
l3.setBounds(220,100,100,30);
l4.setBounds(370,100,100,30);
l5.setBounds(70,150,100,30);
l6.setBounds(70,200,100,30);
l7.setBounds(70,250,100,30);
l8.setBounds(70,300,100,30);
l9.setBounds(70,350,100,30);
l10.setBounds(370,150,100,30);
l11.setBounds(370,200,100,30);
l12.setBounds(370,250,100,30);
l13.setBounds(370,300,100,30);
l14.setBounds(370,350,100,30);
l15.setBounds(50,400,100,30);
l16.setBounds(50,450,100,30);
l17.setBounds(50,500,100,30);
t1.setBounds(220,150,100,30);
t2.setBounds(220,200,100,30);
t3.setBounds(220,250,100,30);
t4.setBounds(220,300,100,30);
t5.setBounds(220,350,100,30);
t6.setBounds(170,400,100,30);
t7.setBounds(170,450,100,30);
t8.setBounds(170,500,100,30);
b1.setBounds(300,400,100,30);
b2.setBounds(300,450,100,30);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent e1)
{
String s=e1.getActionCommand();
if(s.equals("CALCULATE"))
{
int m1=Integer.parseInt(t1.getText());
int m2=Integer.parseInt(t2.getText());
int m3=Integer.parseInt(t3.getText());
int m4=Integer.parseInt(t4.getText());
int m5=Integer.parseInt(t5.getText());
int total=m1+m2+m3+m4+m5;
t6.setText(" "+total);
float per=total/5.0f;
t7.setText(" "+per+"%");
        String gL;
        if (per >= 90.0f) {
            gL = "A";
        } else if (per >= 80.0f) {
            gL = "B";
        } else if (per >= 70.0f) {
            gL = "C";
        } else if (per >= 60.0f) {
            gL = "D";
        } else {
            gL = "F";
        }
String s1=gL;
t8.setText(s1);
}
if(s.equals("RESET"))
{
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
t6.setText("");
t7.setText("");
t8.setText("");
repaint();
}
}
public void paint(Graphics g)
{
g.setColor(Color.blue);
g.drawLine(170,100,170,390);
g.drawLine(360,100,360,390);
g.drawLine(470,100,470,390);
g.drawLine(30,100,30,390);
g.drawLine(30,140,470,140);
g.drawLine(30,390,470,390);
}
}



