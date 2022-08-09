//package Calculator;
import javax.swing.*;  
import java.awt.event.*;  
import javax.swing.JOptionPane;
public class TextFieldExample implements ActionListener{  
    JTextField tf1,tf2,tf3;  
    JButton b1,b2,b3,b4;  
    TextFieldExample(){  
      
        JFrame f= new JFrame(); 

        tf1=new JTextField();  
        tf1.setBounds(50,50,255,20);  
        tf2=new JTextField();  
        tf2.setBounds(50,100,255,20);  
        tf3=new JTextField();  
        tf3.setBounds(50,150,255,20);  
        tf3.setEditable(false); 
        
        
        b1=new JButton("+");  
        b1.setBounds(50,200,50,50);  
        b2=new JButton("-");  
        b2.setBounds(120,200,50,50);
        b3=new JButton("*");
        b3.setBounds(190,200,50,50);
        b4 = new JButton("/");
        b4.setBounds(260,200,50,50);


        b1.addActionListener(this);  
        b2.addActionListener(this);
        b3.addActionListener(this);  
        b4.addActionListener(this); 
        
        
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);


        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
    }      
    public void actionPerformed(ActionEvent e) {  
        String s1=tf1.getText();  
        String s2=tf2.getText();  
        int a,b;
        try {
        	a=Integer.parseInt(s1);  
            b=Integer.parseInt(s2); 
            int c=0;
            if(e.getSource()==b1){  
                c=a+b;  
            }else if(e.getSource()==b2){  
                c=a-b;  
            }
            else if(e.getSource()==b3) {
            	c=a*b;
            }
            else if(e.getSource()==b4) {
            	try {
            		c=a/b;
            	}
            	catch(ArithmeticException e3){
            		JOptionPane.showMessageDialog(null,"Undefined","Warning",JOptionPane.ERROR_MESSAGE);
            		
            	}
            	
            	
            }
            String result=String.valueOf(c);  
            tf3.setText(result);
        	
        }
        catch(NumberFormatException eob) {
        	JOptionPane.showMessageDialog(null,"Input should be numerical. Please try again","Warning",JOptionPane.ERROR_MESSAGE);
        }
          
    }  
	public static void main(String[] args) {  
		new TextFieldExample();  
	}
}