import java.applet.*;
import java.util.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Mycalculator extends Applet implements ActionListener
{
    Label label1, label2; 
    TextField tf1, tf2, tf3;
    Button b1, b2, b3, b4;
    String whichButtonClk;	

    public void init()
    {
        System.out.println("Initializing an applet");
        label1 = new Label("First Number:");
		tf1= new TextField(10);
		
		label2 = new Label("Second Number:");
        tf2= new TextField(10);
		
        b1 = new Button("Add");
        b2= new Button("Subtract");
        b3 = new Button("Multiply");
        b4= new Button("Divide");
		
		add(label1);
		add(tf1);
        add(label2);
        add(tf2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
		
        tf1.addActionListener(this); 	
        tf2.addActionListener(this); 	
        b1.addActionListener(this);	
        b2.addActionListener(this);	
        b3.addActionListener(this);	
	    b4.addActionListener(this);	
	}
    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getActionCommand().equals("Add") || ae.getActionCommand().equals("Subtract") ||ae.getActionCommand().equals("Multiply") ||ae.getActionCommand().equals("Divide"))
        {
            whichButtonClk=ae.getActionCommand(); 
            repaint();
        }
    }
    public void paint(Graphics g)
    {	
        g.drawString("Please enter two numbers to perform math operations", 10,130);
        if(tf1.getText().equals("") && tf2.getText().equals("")) 
        {
			
        }		
        else
        {
	      Double num1=Double.parseDouble(tf1.getText());
          Double num2=Double.parseDouble(tf2.getText());	
	      double sum = num1+num2;
	      double subtract=num1-num2;
	      double multiply=num1*num2;
	      double divide=num1/num2; 
		    
	
	     if(whichButtonClk.equals("Add"))
		 {
		   g.drawString("Result sum is "+ sum, 10,190);
		 }
	     if(whichButtonClk.equals("Subtract"))
		 {
		   g.drawString("Result subtract is "+ subtract, 10,190);
		 }
	     if(whichButtonClk.equals("Multiply"))
		 {
		   g.drawString("Result multiply is "+ multiply, 10,190);
		 }
	     if(whichButtonClk.equals("Divide"))
		 {
		   g.drawString("Result divide is "+ divide, 10,190);
		 }
	    }
	}
}
















 