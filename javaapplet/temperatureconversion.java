import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class temperatureconversion extends Applet
  {
    Button b1;
    TextField t1,t2,t3;
    Label l1,l2,l3,l4,l5;
    CheckboxGroup cg;
    Checkbox r1,r2;
       public void init()
       {
        setLayout(null);
        l1 = new Label("Enter the Value : ");                
		t1 = new TextField(10);
        l2 = new Label("Fahrenheit to Celsius is : ");   
		t2 = new TextField(10);
        l3 = new Label("Celsius to Fahrenheit is : ");   
		t3 = new TextField(10);
        cg=new CheckboxGroup();
        r1=new Checkbox("Fahrenheit to Celsius",cg,false);
        r2=new Checkbox("Celsius to Fahrenheit",cg,false);
        b1=new Button("Clear");
        l1.setBounds(170,50,100,25);               
		t1.setBounds(280,50,100,25);
        r1.setBounds(100,100,125,25);             
		r2.setBounds(325,100,125,25);
        l2.setBounds(150,150,130,25);             
		t2.setBounds(300,150,100,25);
        l3.setBounds(150,200,130,25);             
		t3.setBounds(300,200,100,25);
        b1.setBounds(230,250,100,25);
        b1.addActionListener(new b());     
		r1.addItemListener(new a());
        r2.addItemListener(new a());
        add(l1); 
		add(t1); 
		add(r1);  
		add(r2); 
		add(b1); 
		add(l2); 
		add(t2); 
		add(l3); 
		add(t3);
}
class a implements ItemListener
 {
         double a1,a2,a3;
         public void itemStateChanged(ItemEvent ie )
         {
            a1 = Double.parseDouble(t1.getText());
            if(ie.getSource()==r1)
              {    
			      a2=((a1-32)*5)/9;                  
                  t2.setText(String.valueOf(a2));     
			  }
            if(ie.getSource()==r2)
              {    
		          a3=(((a1*9)/5)+32);
                  t3.setText(String.valueOf(a3));         
		      }
         }
 }
class b implements ActionListener
 {
  public void actionPerformed(ActionEvent e)
     {
      if(e.getSource()==b1)
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
         }
       }
     }
  }
